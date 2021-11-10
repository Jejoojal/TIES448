package Module;


public class LtD extends Instr2
{
	public LtD(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecBool exec(ExecValue[] memory) {
		return new ExecBool(left.exec(memory).getDouble() < right.exec(memory).getDouble());
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("f32.lt ");
	}
}
