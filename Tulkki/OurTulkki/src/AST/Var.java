package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class Var extends Value
{
	String id;
	
	public Var(String _id)
	{
		id = _id;
	}
	
	@Override
	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		if (tenv.containsKey(id)) type = tenv.get(id);
		else ;//virheilmoitus
	}

	@Override
	public Number evaluate(Map<String, Number> env)
	{
		return env.get(id);
	}

	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Instr generateValue(Module gen, Map<String, LocalVar> env) {
		LocalVar var = env.get(id);
		if (var == null)
		{
			LocalVar v;
			int varType = gen.DOUBLE_TYPE;
			if (type.isInt())
			{
				varType = gen.INT_TYPE;
			}
			v = gen.addLocalVar(id, varType);
			env.put(id, v);
		}
		var = env.get(id);
		//System.out.println(var +" " + id + " " + var.inx);
		return gen.emitLoad(var);
	}

}
