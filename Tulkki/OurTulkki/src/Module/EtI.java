package Module;

public class EtI extends Instr2 {

	public EtI(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic() {
		return "ETI";
	}

	@Override
	public ExecBool exec(ExecValue[] memory) {
		return new ExecBool(left.exec(memory).getInt() == right.exec(memory).getInt());
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i32.eq \n");
	}

}
