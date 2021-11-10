package Module;

public class SubI extends Instr2
{
	public SubI(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		return "SUBI";
	}

	@Override
	public ExecInt exec(ExecValue[] memory)
	{
		int l = left.exec(memory).getInt();
		int r = right.exec(memory).getInt();
		return new ExecInt(l - r);
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i32.sub \n");
	}

}
