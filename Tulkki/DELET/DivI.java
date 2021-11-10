/*package Module;

public class DivI extends Instr2 {

	public DivI(Instr l, Instr r)
	{
		left = l;
		right = r;
	}

	@Override
	public String mnemonic()
	{
		return "DIVI";
	}

	@Override
	public ExecInt exec(ExecValue[] memory) {
		return new ExecInt( left.exec(memory).getInt() / right.exec(memory).getInt() );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i64.div_u \n");
	}
} */