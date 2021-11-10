package AST;

import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public abstract class Condition extends ASTNode
{
	Value left;
	Value right;
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		left.typeCheck(tenv);
		right.typeCheck(tenv);
		
		Type leftType = left.type;
		Type rightType = right.type;
		
		if (!leftType.isInt() == rightType.isInt())
		{
			if (leftType.isDouble() == !rightType.isDouble())
			{
				//TODO: oikea virheilmoitus tänne tai pois kokonaan
				System.out.println("Error");
			}
		}
		
		this.type = new BoolType();
		
	}

	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}
	
	public abstract boolean evaluate(Map<String, Number> env);
	
	public abstract Instr generateCon(Module gen, Map<String, LocalVar> env);

}
