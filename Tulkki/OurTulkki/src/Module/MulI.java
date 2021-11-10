package Module;

public class MulI extends Instr2 {

	public MulI(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		return "MULI";
	}

	@Override
	public ExecInt exec(ExecValue[] memory) {
		return new ExecInt(left.exec(memory).getInt() * right.exec(memory).getInt() );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i32.mul \n");
	}

}
