package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class ConstVal extends Value
{
	String value;
	
	public ConstVal(String _value, Type t)
	{
		type = t;
		value = _value;
	}
	
	@Override
	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		//Ei tee mit‰‰n
	}

	@Override
	public Number evaluate(Map<String, Number> env)
	{
		if (type.isInt()) {
			int i = Integer.parseInt(value);
			return i;
		}
		if (type.isDouble()) {
			double d = Double.parseDouble(value);
			return d;
		}
		return null;
	}

	@Override
	public void eval(Map<String, Number> tenv)
	{
		
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Instr generateValue(Module gen, Map<String, LocalVar> env) {
		if (type.isInt())
			return gen.emitIntegerConstant(value);
		return gen.emitDoubleConstant(value);
	}

}
