package Module;

import java.util.ArrayList;

public class Return extends Instr1 {
	
	LocalVar x;
	
	public Return(Instr _instr, LocalVar _x) {
		super(_instr);
		x = _x;
	}

	@Override
	public void addToListing(ArrayList<String> lst) {
		if (instr == null) {
			lst.add("RETURN");
		}
		else {
			instr.addToListing(lst);
			lst.add("RETURN\t@" + (lst.size()-1) );
		}
	}

	@Override
	public String mnemonic() {
		return null;
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		
		if (instr == null)
		{
			if (memory[memory.length-1] == null) memory[memory.length-1] = new ExecNull();
		}
		else
		{
			if (memory[memory.length-1] == null) memory[memory.length-1] = instr.exec(memory);
		}
		return null;
	}

	@Override
	protected void generate_wat(WATGen watgen) {
		if (instr != null) instr.generate_wat(watgen);
		watgen.output("return ");
	}

}
