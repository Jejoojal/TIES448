package Module;

public class IntToDouble extends Instr1
{

	public IntToDouble(Instr _instr)
	{
		super(_instr);
	}

	@Override
	public String mnemonic() {
		return "I2D";
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		return instr.exec(memory);
	}

	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(instr);
		watgen.output("f32.convert_s/i32 \n");
	}

}
