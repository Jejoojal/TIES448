package Module;

public class LtI extends Instr2
{
	public LtI(Instr _left, Instr _right)
	{
		left = _left;
		right = _right;
	}

	@Override
	public String mnemonic() {
		return "LTI";
	}

	@Override
	public ExecBool exec(ExecValue[] memory) {
		return new ExecBool(left.exec(memory).getInt() < right.exec(memory).getInt() );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i32.lt_u ");
	}

}
