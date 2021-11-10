package AST;

public class IntType extends Type
{
	@Override
	public Number parseValue(String val)
	{
		return Integer.parseInt(val);
	}
	
	@Override
	public boolean isInt()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(Type t)
	{
		return t.isInt() || t.isDouble();
	}
	
	@Override
	public String toString()
	{
		return "Integer";
	}
	
}
