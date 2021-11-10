package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Module.LocalVar;
import Module.Module;

public class VarDeclarations extends ASTNode 
{
	List<VarDeclaration> vars = new ArrayList<VarDeclaration>();
	
	public VarDeclarations(List<VarDeclaration> _vars)
	{
		vars = _vars;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(Map<String, Number> tenv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env) {
		// TODO Auto-generated method stub
		
	}

}
