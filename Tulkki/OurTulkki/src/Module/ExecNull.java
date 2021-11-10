package Module;

public class ExecNull extends ExecValue{

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
		return false;
	}
	
	@Override
	public boolean isNull()
	{
		return true;
	}

}
