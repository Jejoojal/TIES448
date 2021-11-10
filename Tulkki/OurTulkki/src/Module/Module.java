package Module;

import java.util.ArrayList;
import java.util.Map;

import AST.ASTNode;

public class Module
{
	//constants
	public final int DOUBLE_TYPE = 0;
	public final int INT_TYPE = 1;
	
	ArrayList<LocalVar> locals = new ArrayList<LocalVar>();
	ArrayList<Instr> instr_forest = new ArrayList<Instr>();
	int memory_size = 100;
	int num_params = 0;
	LocalVar _return = null;
	int loopCount = 0;	
	
	public Module() {}
	
	public Number run(String[] args)
	{
		if (num_params != args.length)
		{
			System.out.println("Params: " + num_params + ", Args: " + args.length);
			//virheilmoitus
		}
		
		ExecValue[] memory = new ExecValue[memory_size];
		
		for (int i = 0; i < args.length; i++)
		{
			if (strIsDouble(args[i]))
			{
				double argd = Double.parseDouble(args[i]);
				memory[i] = new ExecDouble(argd);
			}
			else
			{
				int argi = Integer.parseInt(args[i]);
				memory[i] = new ExecInt(argi);
			}
		}
		
		for (Instr root : instr_forest)
		{
			root.exec(memory);
		}
		
		if (memory[memory.length-1].isInt())
		{
			return memory[memory.length-1].getInt();
		}
		else if (memory[memory.length-1].isDouble())
		{
			return memory[memory.length-1].getDouble();
		}
		else if (memory[memory.length-1].isNull())
		{
			return null;
		}
		
		//TODO: virheilmoitus tänne
		System.out.println("Return error!!!!");
		return 0;//memory[_return.inx];
	}
	
	private boolean strIsDouble(String string)
	{
		return string.contains(".");
	}

	public ArrayList<String> listing()
	{
		ArrayList<String> rv = new ArrayList<String>();
		
		for (Instr root : instr_forest)
		{
			root.addToListing(rv);
		}
		
		/*for (Instr root : instr_forest)
		{
			root.setReturn(rv);
		}*/
		memory_size = rv.size() + num_params + 10;
		return rv;
	}

	public LocalVar addParamI(String name)
	{
		return addParam(name, INT_TYPE);
	}

	public LocalVar addParam(String name, int type)
	{
		LocalVar v = addLocalVar(name, type);
		num_params++;
		return v;
	}

	public LocalVar addLocalVar(String name, int type)
	{
		LocalVar lv = new LocalVar(name, locals.size(), type);
		locals.add(lv);
		return lv;
	}

	public LocalVar addParamD(String name)
	{
		return addParam(name, DOUBLE_TYPE);
	}
	
	public LtI emitLtI(Instr left, Instr right)
	{
		return new LtI(left, right);
	}

	public LocalVar returnVar() {
		if (_return == null) _return = addLocalVar("RETURN", DOUBLE_TYPE);
		return _return;
	}

	public Instr emitIntToDouble(Instr instr)
	{
		return new IntToDouble(instr);
	}

	public Instr emitAddI(Instr l, Instr r)
	{
		// TODO Auto-generated method stub
		return new AddI(l, r);
	}

	public Instr emitAddD(Instr l, Instr r)
	{
		return new AddD(l, r);
	}

	public Instr emitIntegerConstant(String value)
	{
		return new IntegerConstant(value);
	}

	public Instr emitSubI(Instr l, Instr r) {
		return new SubI(l, r);
	}

	public Instr emitSubD(Instr l, Instr r)
	{
		return new SubD(l, r);
	}

	public Instr emitMulI(Instr l, Instr r) {
		return new MulI(l, r);
	}

	public Instr emitMulD(Instr l, Instr r) {
		return new MulD(l, r);
	}

	public Instr emitDivD(Instr l, Instr r)
	{
		return new DivD(l, r);
	}
	
	/*
	public Instr emitDivI(Instr l, Instr r)
	{
		return new DivI(l, r);
	}
	*/

	public void emitStoreD(LocalVar x, Instr instr)
	{
		instr_forest.add(new StoreD(x, instr));
	}

	public Instr emitLoad(LocalVar localVar)
	{
		return new Load(localVar);
	}

	public Instr emitLtD(Instr l, Instr r)
	{
		return new LtD(l, r);
	}

	public Instr emitGtI(Instr l, Instr r)
	{
		return new GtI(l, r);
	}

	public Instr emitGtD(Instr l, Instr r) {
		return new GtD(l,r);
	}

	public Instr emitEtI(Instr l, Instr r) {
		return new EtI(l, r);
	}

	public Instr emitEtD(Instr l, Instr r) {
		return new EtD(l, r);
	}

	public void emitStoreI(LocalVar x, Instr instr) {
		instr_forest.add(new StoreI(x, instr));
	}

	public ArrayList<Instr> asCode(ASTNode emitter, Module gen, Map<String, LocalVar> env)
	{
		int start = instr_forest.size();
		emitter.generate(gen, env);
		int end = instr_forest.size();
		
		ArrayList<Instr> instr_grove = new ArrayList<Instr>(instr_forest.subList(start, end));
		
		instr_forest.removeIf(a -> instr_grove.contains(a));
		
		return instr_grove;
	}

	public void emitIf(Instr tr, ArrayList<Instr> th, ArrayList<Instr> el)
	{
		instr_forest.add(new If(tr, th, el));
	}

	public void emitFor(Instr loop, ArrayList<Instr> body)
	{
		instr_forest.add(new For(loop, body, loopCount));
		loopCount++;
	}

	public boolean has_params()
	{
		return num_params > 0;
	}

	public ArrayList<LocalVar> params() {
		ArrayList<LocalVar> newList = new ArrayList<LocalVar>(locals.subList(0, num_params));
		return newList;
	}

	public boolean has_locals() {
		return num_params < locals.size();
	}

	public ArrayList<LocalVar> locals() {
		ArrayList<LocalVar> newList = new ArrayList<LocalVar>(locals.subList(num_params, locals.size()));
		return newList;
	}
	
	public ArrayList<Instr> instructions()
	{
		return instr_forest;
	}

	public boolean hasReturn()
	{
		return _return != null;
	}

	public void emitReturn(LocalVar x, Instr instr)
	{
		instr_forest.add(new Return(instr, x));
	}

	public Instr emitDoubleConstant(String value) {
		return new DoubleConstant(value);
	}
	
	public String watgen(String name)
	{
		WATGen gen = new WATGen(name);
		gen.module(this);
		return gen.wat();
	}

	public Instr emitDoubleToInt(Instr instr)
	{
		return new DoubleToInteger(instr);
	}

}
