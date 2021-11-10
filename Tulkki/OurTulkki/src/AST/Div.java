package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class Div extends Arithmetic
{
	
	public Div(Value l, Value r) {
		super(l, r);
	}

	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		left.typeCheck(tenv);
		right.typeCheck(tenv);
		type = new DoubleType();
	}

	@Override
	public Number evaluate(Map<String, Number> env) {
		if (left.type.isInt() == right.type.isInt())
		{
			return left.evaluate(env).intValue() / right.evaluate(env).intValue();
		}
		else
		{
			return left.evaluate(env).doubleValue() / right.evaluate(env).doubleValue();
		}
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Instr generateValue(Module gen, Map<String, LocalVar> env)
	{
		/*if (left.type.isInt() && right.type.isInt())
		{
			return gen.emitDivI(left.generateValue(gen, env), right.generateValue(gen, env));
		}*/
		return gen.emitDivD(left.generateDouble(gen, env), right.generateDouble(gen, env));
	}
}
