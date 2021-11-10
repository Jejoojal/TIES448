package Module;

import java.util.ArrayList;

public class IntegerConstant extends Instr {

	String strvalue;
	
	public IntegerConstant(String value)
	{
		strvalue = value;
	}
	
	@Override
	public boolean isIntConst() {return true;}
	public int type() {return 1;}
	
	@Override
	public void addToListing(ArrayList<String> lst) {
		lst.add("CONSTI\t" + this.strvalue);
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecInt exec(ExecValue[] memory) {
		return new ExecInt( Integer.parseInt(strvalue) );
	}
	
	@Override
	public void generate_wat(WATGen watgen) {
		watgen.output("i32.const ");
		watgen.output(this.strvalue);
		watgen.output(" \n");
	}

}
