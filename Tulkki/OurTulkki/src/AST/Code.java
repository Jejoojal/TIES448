package AST;

import java.util.List;
import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class Code extends ASTNode
{
	List<ASTNode> stmts;
	
	public Code (List<ASTNode> _stmts)
	{
		stmts = _stmts;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		for (ASTNode node : stmts)
		{
			node.typeCheck(tenv);
		}
	}

	@Override
	public void eval(Map<String, Number> env)
	{
		for (ASTNode node : stmts)
		{
			node.eval(env);
		}
	}

	public void generate(Module gen, Map<String, LocalVar> env)
	{
		for (ASTNode stmt : stmts)
		{
			stmt.generate(gen, env);
		}
	}

}
