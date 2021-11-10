package Module;

public abstract class ExecValue {

	public abstract int getInt();
	public abstract double getDouble();
	public abstract boolean getBool();
	
	public boolean isInt()
	{
		return false;
	}
	
	public boolean isDouble()
	{
		return false;
	}
	
	public boolean isBool()
	{
		return false;
	}
	
	public boolean isNull()
	{
		return false;
	}
	
}
