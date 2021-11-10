package AST;

public class DoubleType extends Type
{
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(Type t)
	{
		return t.isDouble();
	}
	
	@Override
	public Number parseValue(String val)
	{
		return Double.parseDouble(val);
	}
	
	@Override
	public String toString()
	{
		return "Double";
	}
}
