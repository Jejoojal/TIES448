package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class Program extends ASTNode
{
	public String name;
	VarDeclarations params;
	public Code body;

	public Program(String _name, VarDeclarations visitedParamList, Code _body)
	{
		name = _name;
		params = visitedParamList;
		body = _body;
	}

	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		for (VarDeclaration v : params.vars)
		{
			v.declare(tenv);
		}
		body.typeCheck(tenv);
	}

	public Number run(Map<String, Number> env, String[] args) {
		
		VarDeclaration[] vars = new VarDeclaration[params.vars.size()];
		int count = 0;
		
		for (VarDeclaration vd : params.vars)
		{
			vars[count] = vd;
			count++;
		}
		
		for (int i = 0; i < vars.length; i++)
		{
			vars[i].setValue(env, args[i]);
		}
		
		body.eval(env);
		
		return env.get("RETURN");
	}

	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}
	
	public void generate(Module gen, Map<String, LocalVar> env)
	{
		for (VarDeclaration vd : params.vars)
		{
			vd.emitParam(gen, env);
		}
		body.generate(gen, env);
	}
	
	
}
