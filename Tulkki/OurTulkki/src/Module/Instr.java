package Module;

import java.util.ArrayList;

public abstract class Instr
{
	public boolean isIntConst() {
		return false;
	}
	public boolean isDoubleConst() {
		return false;
	}
	public abstract void addToListing(ArrayList<String> lst);
	public abstract String mnemonic();
	public abstract ExecValue exec(ExecValue[] memory);
	protected abstract void generate_wat(WATGen watGen);
}
