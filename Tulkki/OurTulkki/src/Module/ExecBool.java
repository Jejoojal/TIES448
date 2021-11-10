package Module;

public class ExecBool extends ExecValue
{
	public boolean value;
	
	public ExecBool(boolean _value)
	{
		value = _value;
	}

	@Override
	public int getInt() {
		return 0;
	}

	@Override
	public double getDouble() {
		return 0;
	}

	@Override
	public boolean getBool() {
		return value;
	}
	
	@Override
	public boolean isBool()
	{
		return true;
	}
}
