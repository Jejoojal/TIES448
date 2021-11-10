package AST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import OurLanguage.OurLanguageVisitor;
import OurLanguage.OurLanguageBaseVisitor;
import OurLanguage.OurLanguageParser;
import OurLanguage.OurLanguageParser.CodeContext;
import OurLanguage.OurLanguageParser.ConditionContext;
import OurLanguage.OurLanguageParser.EqconContext;
import OurLanguage.OurLanguageParser.ForstmtContext;
import OurLanguage.OurLanguageParser.GreatconContext;
import OurLanguage.OurLanguageParser.IdstmtContext;
import OurLanguage.OurLanguageParser.IfstmtContext;
import OurLanguage.OurLanguageParser.LesconContext;
import OurLanguage.OurLanguageParser.ParamListContext;
import OurLanguage.OurLanguageParser.ProgramContext;
import OurLanguage.OurLanguageParser.ReturnstmtContext;
import OurLanguage.OurLanguageParser.SimplestValueContext;
import OurLanguage.OurLanguageParser.StatementContext;
import OurLanguage.OurLanguageParser.ValueContext;

public class OurASTVisitor extends OurLanguageBaseVisitor<ASTNode>
{
	@Override
	public Program visitProgram(ProgramContext ctx)
	{
	
		List<VarDeclaration> emptyList = new ArrayList<VarDeclaration>();
		
		VarDeclarations visitedParamList = new VarDeclarations(emptyList);
		
		if (ctx.paramList() != null)
		{
			visitedParamList = (VarDeclarations) visit(ctx.paramList());	//ourASTVisitor.visitParamList(paramList);
		}
		
		return new Program(ctx.ID().getText(), visitedParamList, (Code)visit(ctx.code()));
	}
	
	@Override
	public ASTNode visitParamList(ParamListContext paramList)
	{
		List<VarDeclaration> rv = new ArrayList<VarDeclaration>();
		
		for (TerminalNode node : paramList.ID())
		{
			VarDeclaration varDec = new VarDeclaration(node.getText(), new IntType());
			rv.add(varDec);
		}
		
		VarDeclarations vardecs = new VarDeclarations(rv);
		
		return vardecs;
	}
	
	@Override
	public ASTNode visitCode(CodeContext ctx)
	{
		List<ASTNode> ss = new ArrayList<ASTNode>();
		
		
		for (StatementContext sc : ctx.statement())
		{
			ss.add(visit(sc));
		}
		
		Code code = new Code(ss);
		
		return code;
	}
	
	@Override
	public ASTNode visitIfstmt(IfstmtContext ctx)
	{
		
		return new IfStatement((Condition) visit(ctx.condition()),
				(Code) visit(ctx.code(0)),
				(Code) visit(ctx.code(1)));
	}
	
	@Override
	public ASTNode visitForstmt(ForstmtContext ctx)
	{
		return new ForStatement((Value) visit(ctx.value()),
				visit(ctx.code()));
	}
	
	@Override
	public ASTNode visitReturnstmt(ReturnstmtContext ctx)
	{
		if (ctx.value() != null)
			return new ReturnStatement((Value)visit(ctx.value()));
		return new ReturnStatement();
	}
	
	@Override
	public ASTNode visitIdstmt(IdstmtContext ctx)
	{
		return new AssignStatement(ctx.ID().getText(),(Value) visit(ctx.value()));
	}
	
	@Override
	public ASTNode visitEqcon(EqconContext ctx)
	{
		return new EqCon((Value)visit(ctx.value(0)), (Value)visit(ctx.value(1)));
	}
	
	@Override
	public ASTNode visitLescon(LesconContext ctx)
	{
		return new LesCon((Value) visit(ctx.value(0)), (Value) visit(ctx.value(1)));
	}
	
	@Override
	public ASTNode visitGreatcon(GreatconContext ctx)
	{
		return new GreatCon((Value) visit(ctx.value(0)), (Value) visit(ctx.value(1)));
	}
	
	@Override
	public ASTNode visitConst(OurLanguageParser.ConstContext ctx)
	{
		return visit(ctx.simplestValue());
	}
	
	@Override
	public ASTNode visitAdd(OurLanguageParser.AddContext ctx)
	{
		switch(ctx.op.getText())
		{
		case "+":
			return new Add((Value) visit(ctx.value(0)), (Value) visit(ctx.value(1)));
		case "-":
			return new Sub((Value) visit(ctx.value(0)), (Value) visit(ctx.value(1)));
		}
		return null;
	}
	
	@Override
	public ASTNode visitNoarith(OurLanguageParser.NoarithContext ctx)
	{
		return visit(ctx.simpleValue());
	}
	
	@Override
	public ASTNode visitParen(OurLanguageParser.ParenContext ctx)
	{
		return visit(ctx.value());
	}
	
	@Override
	public ASTNode visitMul(OurLanguageParser.MulContext ctx)
	{
		switch (ctx.op.getText())
		{
		case "*":
			return new Mul((Value) visit(ctx.simpleValue(0)), (Value) visit(ctx.simpleValue(1)));
		case "/":
			return new Div((Value) visit(ctx.simpleValue(0)), (Value) visit(ctx.simpleValue(1)));
		}
		return null;
	}
	
	@Override
	public ASTNode visitIntt(OurLanguageParser.InttContext ctx)
	{
		return new ConstVal(ctx.INT().getText(), new IntType());
	}
	
	@Override
	public ASTNode visitDoublet(OurLanguageParser.DoubletContext ctx)
	{
		return new ConstVal(ctx.DOUBLE().getText(), new DoubleType());
	}
	
	@Override
	public ASTNode visitIdt(OurLanguageParser.IdtContext ctx)
	{
		return new Var(ctx.ID().getText());
	}

}
