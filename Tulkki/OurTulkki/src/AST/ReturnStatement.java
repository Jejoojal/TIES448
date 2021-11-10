package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class ReturnStatement extends ASTNode
{
	Value e;
	
	
	public ReturnStatement()
	{
	}
	
	public ReturnStatement(Value _e)
	{
		e = _e;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		if (e != null) e.typeCheck(tenv);
	}

	@Override
	public void eval(Map<String, Number> env) {
		if (env.containsKey("RETURN")) return;
		if (e != null)
		{
			env.put("RETURN", e.evaluate(env));
		}
		else
			env.put("RETURN", null);
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		if (e == null || e.type == null) {
			gen.emitReturn(null,null);
			return;
		}
		
		if (e.type.isInt()) {
			gen.emitReturn(gen.returnVar(), e.generateInt(gen, env));
		}
		else {
			gen.emitReturn(gen.returnVar(), e.generateDouble(gen, env));
		}
	}

}
