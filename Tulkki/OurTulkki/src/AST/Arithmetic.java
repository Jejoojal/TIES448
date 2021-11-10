package AST;

import java.util.Map;

public abstract class Arithmetic extends Value
{
	Value left;
	Value right;
	
	public Arithmetic(Value l, Value r)
	{
		left = l;
		right = r;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		left.typeCheck(tenv);
		right.typeCheck(tenv);
		Type leftType = left.type;
		Type rightType = right.type;
		if (leftType.isInt())
		{
			if (rightType.isInt())
			{
				type = rightType;
			}
			else if (rightType.isDouble())
			{
				type = rightType;
			}
		}
		else if (leftType.isDouble())
		{
			type = leftType;
		}
		else
		{
			//TODO: oikea virheilmoitus tähän
			System.out.println("left or right illegal type for arithmetic operations: " + leftType.toString() + " vs. " + rightType.toString());
		}
	}

	@Override
	public abstract Number evaluate(Map<String, Number> env);

	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}
}
