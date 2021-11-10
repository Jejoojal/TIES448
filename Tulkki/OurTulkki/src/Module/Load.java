package Module;

import java.util.ArrayList;

public class Load extends Instr {

	LocalVar x;
	
	public Load(LocalVar _x)
	{
		x = _x;
	}
	
	public int type() {return x.type;}
	
	@Override
	public void addToListing(ArrayList<String> lst)
	{
		lst.add("LOAD\t#" + x.inx +"(" + x.name + ")");
	}

	@Override
	public String mnemonic() {
		return null;
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		return memory[x.inx];
	}

	@Override
	protected void generate_wat(WATGen watGen) {
		watGen.output("local.get ");
		watGen.localidx(x.inx);
		watGen.output("\n");
	}

}
