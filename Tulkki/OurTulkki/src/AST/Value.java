package AST;

import java.util.HashMap;
import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public abstract class Value extends ASTNode
{

	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		type.typeCheck(tenv);
	}
	
	public abstract Number evaluate(Map<String, Number> env);

	public Instr generateDouble(Module gen, Map<String, LocalVar> env) {
		if (type.isInt())
		{
			return gen.emitIntToDouble(generateValue(gen, env));
		}
		else
		{
			return generateValue(gen, env);
		}
	}

	protected abstract Instr generateValue(Module gen, Map<String, LocalVar> env);

	public Instr generateInt(Module gen, Map<String, LocalVar> env) {
		if (type.isInt())
		{
			return generateValue(gen, env);
		}
		else
		{
			return gen.emitDoubleToInt( generateValue(gen, env));
		}
	}

}
