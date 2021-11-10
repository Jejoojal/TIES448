package Module;

import java.util.ArrayList;

public class If extends Instr {

	Instr tst;
	ArrayList<Instr> thn;
	ArrayList<Instr> els;
	static int counter = 0;
	
	public If(Instr tr, ArrayList<Instr> th, ArrayList<Instr> el)
	{
		tst = tr;
		thn = th;
		els = el;
	}
	
	@Override
	public void addToListing(ArrayList<String> lst) {
		tst.addToListing(lst);
		int ts = lst.size()-1;
		int inx = lst.size();
		lst.add("");
		int th = lst.size();
		
		for (Instr instr : thn)
		{
			if (!instr.equals(this))
			{
				instr.addToListing(lst);
			}
		}
		
		int go_to = lst.size();
		lst.add("");
		int el = lst.size();
		
		for (Instr instr : els)
		{
			if (!instr.equals(this))
			{
				instr.addToListing(lst);
			}
		}
		
		int endIf = lst.size();
		lst.set(inx, "IF\t@" + ts + "\t@" + th + "\t@" + el);
		lst.set(go_to, "GOTO\t@" + endIf);
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		if (tst.exec(memory).getBool())
		{
			for (Instr instr : thn)
			{
				instr.exec(memory);
			}
		}
		else
		{
			for (Instr instr : els)
			{
				instr.exec(memory);
			}
		}
		return null;
	}

	@Override
	protected void generate_wat(WATGen watGen) {
		tst.generate_wat(watGen);
		watGen.output("if \n");
		for (Instr instr : thn)
		{
			instr.generate_wat(watGen);
		}
		watGen.output("else \n");
		for (Instr instr : els)
		{
			instr.generate_wat(watGen);
		}
		watGen.output("end \n");
	}

}
