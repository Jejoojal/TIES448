package Module;

public class DivD extends Instr2 {

	public DivD(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic()
	{
		return "DIVD";
	}

	@Override
	public ExecDouble exec(ExecValue[] memory) {
		return new ExecDouble( left.exec(memory).getDouble() / right.exec(memory).getDouble() );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("f32.div \n");
	}

}
