package AST;

import java.util.Map;

import Module.LocalVar;
import Module.Module;

public abstract class ASTNode
{
	public Type type;
	public abstract void typeCheck(Map<String, Type> tenv);
	public abstract void eval(Map<String, Number> tenv);
	public abstract void generate(Module gen, Map<String, LocalVar> env);
}
