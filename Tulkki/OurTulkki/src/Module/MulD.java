package Module;

public class MulD extends Instr2 {

	public MulD(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		return "MULD";
	}

	@Override
	public ExecDouble exec(ExecValue[] memory) {
		return new ExecDouble (left.exec(memory).getDouble() * right.exec(memory).getDouble());
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("f32.mul \n");
	}

}
