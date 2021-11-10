package Module;

public class ExecInt extends ExecValue
{
	public int value;
	public ExecInt(int _value)
	{
		value = _value;
	}
	
	@Override
	public int getInt() {
		return value;
	}
	@Override
	public double getDouble() {
		return (double)value;
	}
	@Override
	public boolean getBool() {
		return false;
	}
	
	@Override
	public boolean isInt()
	{
		return true;
	}
}
