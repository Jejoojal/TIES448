package Module;

public class SubD extends Instr2 {

	public SubD(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		return "SUBD";
	}

	@Override
	public ExecDouble exec(ExecValue[] memory) {
		double l = left.exec(memory).getDouble();
		double r = right.exec(memory).getDouble();
		return new ExecDouble(l - r);
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("f32.sub \n");
	}

}
