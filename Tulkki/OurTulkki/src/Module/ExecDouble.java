package Module;

public class ExecDouble extends ExecValue{
	public double value;
	
	public ExecDouble(double _value)
	{
		value = _value;
	}

	@Override
	public int getInt() {
		return (int)value;
	}

	@Override
	public double getDouble() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public boolean getBool() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
}
