package Module;

public class AddD extends Instr2 {

	public AddD(Instr l, Instr r)
	{
		left = l;
		right = r;
	}
	
	@Override
	public String mnemonic() {
		return "ADDD";
	}

	@Override
	public ExecDouble exec(ExecValue[] memory) {
		return new ExecDouble(left.exec(memory).getDouble() + right.exec(memory).getDouble());
	}

	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("f32.add \n");
	}

}
