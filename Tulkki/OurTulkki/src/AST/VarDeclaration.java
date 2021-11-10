package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class VarDeclaration
{
	String name;
	Type type;
	
	public VarDeclaration(String _name, Type _type)
	{
		name = _name;
		type = _type;
	}
	
	public void declare(Map<String, Type> type_env)
	{
		if (type_env.containsKey(name))
		{
			//TODO: oikea virheilmoitus tai pois
			System.out.println(name + " variable already exists in the type environment");
		}
		else
		{
			type_env.put(name, type);
		}
	}
	
	public void setValue(Map<String, Number> env, String valStr)
	{
		env.put(name, type.parseValue(valStr));
	}
	
	public void emitParam(Module gen, Map<String, LocalVar> env)
	{
		LocalVar v ;
		
		if (type.isDouble())
		{
			v = gen.addParamD(name);
		}
		else
		{
			v = gen.addParamI(name);
		}
		env.put(name, v);
	}
}
