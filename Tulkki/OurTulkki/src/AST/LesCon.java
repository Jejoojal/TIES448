package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class LesCon extends Condition
{
	public LesCon(Value _left, Value _right)
	{
		left = _left;
		right = _right;
	}

	@Override
	public boolean evaluate(Map<String, Number> env) {
		return left.evaluate(env).doubleValue() < right.evaluate(env).doubleValue();
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instr generateCon(Module gen, Map<String, LocalVar> env)
	{
		if (left.type.isInt() && right.type.isInt())
		{
			return gen.emitLtI(left.generateValue(gen, env), right.generateValue(gen, env));
		}
		else
		{
			return gen.emitLtD(left.generateValue(gen, env), right.generateValue(gen, env));
		}
	}

}
