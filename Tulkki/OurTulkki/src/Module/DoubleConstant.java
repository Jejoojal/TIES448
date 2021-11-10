package Module;

import java.util.ArrayList;

public class DoubleConstant extends Instr {

	String strvalue;
	
	public DoubleConstant(String value)
	{
		strvalue = value;
	}
	
	public boolean isDoubleConst() {
		return true;
	}
	
	public int type() {return 0;}
	
	@Override
	public void addToListing(ArrayList<String> lst) {
		lst.add("CONSTD\t" + this.strvalue);
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecDouble exec(ExecValue[] memory) {
		return new ExecDouble( Double.parseDouble(strvalue) );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.output("f32.const ");
		watgen.output(this.strvalue);
		watgen.output(" \n");
	}
}
