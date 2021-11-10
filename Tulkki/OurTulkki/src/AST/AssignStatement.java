package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class AssignStatement extends ASTNode
{
	String x;
	Value e;
	
	public AssignStatement(String _x, Value _e)
	{
		x = _x;
		e = _e;
	}
	
	@Override
	public
	void typeCheck(Map<String, Type> tenv)
	{
		e.typeCheck(tenv);
		
		if (!tenv.containsKey(x))
		{
			tenv.put(x, e.type);
		}
		
		if (!e.type.canAssign(tenv.get(x)))
		{
			//virheilmoitus
		}
	}

	@Override
	public void eval(Map<String, Number> env)
	{
		env.put(x, e.evaluate(env));
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		
		int varType = 0;
		
		if (e.type.isDouble())
		{
			varType = gen.DOUBLE_TYPE;
		}
		else if(e.type.isInt())
		{
			varType = gen.INT_TYPE;
		}
		
		if (!env.containsKey(x)) env.put(x, gen.addLocalVar(x, varType));
		
		if (e.type.isDouble())
		{
			gen.emitStoreD(env.get(x), e.generateValue(gen, env));
		}
		else if(e.type.isInt())
		{
			gen.emitStoreI(env.get(x), e.generateValue(gen, env));
		}
		else
		{
			System.out.println(" Type error in the assignment ");
		}
		
		//gen.emitStoreD(gen.addLocalVar(x, varType), e.generateValue(gen, env));
	}

}
