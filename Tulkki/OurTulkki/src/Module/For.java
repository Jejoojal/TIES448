package Module;

import java.util.ArrayList;

public class For extends Instr {

	Instr loop;
	ArrayList<Instr> body;
	int index;
	
	public For(Instr _loop, ArrayList<Instr> _body, int _index)
	{
		loop = _loop;
		body = _body;
		index = _index;
	}
	
	@Override
	public void addToListing(ArrayList<String> lst) {
		loop.addToListing(lst);
		int loopi = lst.size()-1;
		int inx = lst.size();
		lst.add("");
		int bodyi = lst.size();
		
		for (Instr instr : body)
		{
			if (!instr.equals(this))
			{
				instr.addToListing(lst);
			}
		}
		
		int go_to = lst.size()-1;

		lst.set(inx, "FOR\t@" + loopi + "\t@" + bodyi);
		lst.set(go_to, "GOTO\t@" + inx);
	}

	@Override
	public String mnemonic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecValue exec(ExecValue[] memory) {
		int temp_loop = loop.exec(memory).getInt();
		
		while (temp_loop > 0)
		{
			for (Instr instr : body)
			{
				instr.exec(memory);
			}
			temp_loop--;
		}
		return null;
	}

	@Override
	protected void generate_wat(WATGen watgen) {
		
		loop.generate_wat(watgen);
		watgen.output("local.set $i" + index + "\n");
		
		watgen.output("block $b" + index + "\n");
		watgen.output("loop $l" + index + "\n");
		
		watgen.output("local.get $i" + index + "\n");
		watgen.output("i32.eqz\n");
		watgen.output("br_if $b" + index + "\n");
		
		watgen.output("local.get $i" + index + "\n");
		watgen.output("i32.const 1\n");
		watgen.output("i32.sub\n");
		watgen.output("local.set $i" + index + "\n");
		
		for (Instr instr : body)
		{
			instr.generate_wat(watgen);
		}
		watgen.output("br $l" + index + "\n");
		watgen.output("end\n");	//loop-end
		watgen.output("end\n");	//block-end
	}

}
