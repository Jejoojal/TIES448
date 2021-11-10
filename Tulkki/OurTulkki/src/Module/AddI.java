package Module;

public class AddI extends Instr2 {

	public AddI(Instr _left, Instr _right)
	{
		left = _left;
		right = _right;
	}

	@Override
	public String mnemonic()
	{
		return "ADDI";
	}

	@Override
	public ExecInt exec(ExecValue[] memory)
	{
		return new ExecInt(left.exec(memory).getInt() + right.exec(memory).getInt());
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(left);
		watgen.instrF(right);
		watgen.output("i32.add \n");
	}

}
