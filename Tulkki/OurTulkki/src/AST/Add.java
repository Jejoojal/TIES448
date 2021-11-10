package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class Add extends Arithmetic
{

	public Add(Value l, Value r) {
		super(l, r);
	}

	@Override
	public Number evaluate(Map<String, Number> env) {
		if (left.type.isInt() && right.type.isInt())
		{
			return left.evaluate(env).intValue() + right.evaluate(env).intValue();
		}
		else
		{
			return left.evaluate(env).doubleValue() + right.evaluate(env).doubleValue();
		}
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Instr generateValue(Module gen, Map<String, LocalVar> env)
	{
		if (type.isInt())
		{
			return gen.emitAddI(left.generateValue(gen, env),
					right.generateValue(gen, env));
		}
		else
		{
			return gen.emitAddD(left.generateDouble(gen, env),
					right.generateDouble(gen, env));
		}
	}

}
