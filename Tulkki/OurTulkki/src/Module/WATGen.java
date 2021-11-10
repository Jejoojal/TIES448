package Module;

import java.util.ArrayList;

public class WATGen
{
	ArrayList<String> outputs = new ArrayList<String>();
	String name;
	
	public WATGen(String _name)
	{
		name = _name;
	}
	
	public void output(String str)
	{
		outputs.add(str);
	}
	
	public void id(String name)
	{
		output("$");
		output(name);
		output(" ");
	}
	
	public void module(Module mod)
	{
		output("(module ");
		func(name, mod);
		output("(export \"" + name + "\" (func $" + name + "))");
		output(")");
	}

	private void func(String fname, Module mod)
	{
		output("(func ");
		id(fname);
		if (mod.has_params()) param(mod);
		if (mod._return != null) returns(mod);
		if (mod.has_locals()) locals(mod);
		loop_locals(mod);
		for (Instr instr : mod.instructions())
		{
			instrF(instr);
		}
		output(") ");
	}

	public void localidx(int idx) {
		output(idx + "");
		output(" ");
	}

	private void param(Module mod) {
		if (mod.has_params()) {
			for (LocalVar p : mod.params())
			{
				output("(param ");
				type(p.type);
				this.output(") \n");
			}
			
		}
	}

	private void locals(Module mod) {
		if (mod.has_locals()) {
			output("\n");
			for (LocalVar p : mod.locals())
			{
				output("(");
				output("local ");
				type(p.type);
				output(")\n");
			}
		}
	}
	
	void loop_locals(Module mod)
	{
		if (mod.loopCount > 0)
		{
			for (int i = 0; i < mod.loopCount; i++)
			{
				output("(");
				output("local $i" + i + " i32");
				output(")\n");
			}
		}
	}
	
	private void type(int type)
	{
		switch(type)
		{
			case 0: output("f32");
					break;
			case 1: output("i32");
					break;
			default: System.out.println("ERROR");
					//virhe
					break;
		}
		
	}
	
	public void returns(Module mod)
	{
		this.output("(result f32) ");
	}
	
	public void instrF(Instr instr)
	{
		instr.generate_wat(this);
	}
	
	public String wat()
	{
		StringBuilder wat = new StringBuilder();
		for (String out : outputs)
		{
		    wat.append(out);
		}
		return wat.toString();
	}
}
