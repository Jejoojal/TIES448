package AST;

public class BoolType extends Type
{
	@Override
	public boolean isBool()
	{
		return true;
	}
	
	@Override
	public String toString()
	{
		return "Boolean";
	}
}
