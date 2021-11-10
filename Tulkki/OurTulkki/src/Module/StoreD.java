package Module;

import java.util.ArrayList;

public class StoreD extends Instr {

	LocalVar x;
	Instr instr;
	
	public StoreD(LocalVar _x, Instr _instr)
	{
		x = _x;
		instr = _instr;
	}
	
	@Override
	public void addToListing(ArrayList<String> lst) {
		instr.addToListing(lst);
		int n = lst.size() - 1;
		lst.add("STORED\t#" + x.inx +"(" + x.name+ "),\t@" + n);
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		
		memory[x.inx] = instr.exec(memory); 
		return null;//memory[x.inx];
	}

	@Override
	public void generate_wat(WATGen watgen) {
		watgen.instrF(instr);
		watgen.output("local.set ");
		watgen.localidx(x.inx);
		watgen.output("\n");
	}

}
