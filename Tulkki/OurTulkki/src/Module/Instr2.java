package Module;

import java.util.ArrayList;

public abstract class Instr2 extends Instr
{
	Instr left;
	Instr right;
	
	@Override
	public void addToListing(ArrayList<String> lst)
	{
		left.addToListing(lst);
		int l = lst.size() - 1;
		right.addToListing(lst);
		int r = lst.size() - 1;
		
		lst.add(mnemonic() + "\t@" + l + ",\t@" + r);
	}
	
}
