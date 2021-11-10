package AST;

import java.util.ArrayList;
import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class IfStatement extends ASTNode
{
	Condition iF;
	Code then;
	Code els;
	
	public IfStatement(Condition _if, Code _then, Code _else)
	{
		iF = _if;
		then = _then;
		els = _else;
	}
	
	public void typeCheck(Map<String, Type> tenv)
	{
		iF.typeCheck(tenv);
		if (!iF.type.isBool())
		{
			//TODO: oikea virheilmoitus tähän
			System.out.println("Condition needs to be boolean type. Actual type: " + iF.type.toString());
		}
		then.typeCheck(tenv);
		if (els != null) els.typeCheck(tenv); 
	}

	@Override
	public void eval(Map<String, Number> env)
	{
		boolean conditionTrue = iF.evaluate(env);
		if (conditionTrue) {
			then.eval(env);
		}
		else
		{
			if (els != null) els.eval(env);
		}
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env)
	{
		Instr tr = iF.generateCon(gen, env);
		ArrayList<Instr> th = gen.asCode(then, gen, env);
		ArrayList<Instr> el = gen.asCode(els, gen, env);
		gen.emitIf(tr, th, el);
	}

}
