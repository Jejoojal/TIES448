package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class Type extends ASTNode
{
	public boolean isInt()
	{
		return false;
	}
	public boolean isBool()
	{
		return false;
	}
	public boolean isDouble()
	{
		return false;
	}
	
	public boolean canAssign(Type t)
	{
		return false;
	}
	
	public Number parseValue(String val)
	{
		return null;
	}
	
	public String toString()
	{
		return "None";
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		//virheilmoitus
	}
	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}
}
