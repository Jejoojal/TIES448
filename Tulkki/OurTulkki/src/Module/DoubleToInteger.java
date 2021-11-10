package Module;

public class DoubleToInteger extends Instr1
{

	public DoubleToInteger(Instr _instr)
	{
		super(_instr);
	}

	@Override
	public String mnemonic() {
		return "D2I";
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		return instr.exec(memory);
	}

	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(instr);
		watgen.output("i32.convert_s/f32 \n");
	}

}