package Module;

import java.util.ArrayList;

public abstract class Instr1 extends Instr
{
	Instr instr;
	
	public Instr1(Instr _instr)
	{
		instr = _instr;
		System.out.println(instr);
	}

	@Override
	public void addToListing(ArrayList<String> lst)
	{
		instr.addToListing(lst);
		int n = lst.size() - 1;
		lst.add(mnemonic() + "\t@" + n);
	}
}
