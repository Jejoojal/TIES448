package AST;

import java.util.ArrayList;
import java.util.Map;

import Module.Instr;
import Module.LocalVar;
import Module.Module;

public class ForStatement extends ASTNode
{
	Value loop;
	ASTNode body;

	public ForStatement(Value _loop, ASTNode _body)
	{
		loop = _loop;
		body = _body;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		loop.typeCheck(tenv);
		if (!loop.type.isInt())
		{
			System.out.println("FOR loop expects int type. Real type was " + loop.type.toString());
			return;
		}
		body.typeCheck(tenv);
	}

	@Override
	public void eval(Map<String, Number> env)
	{
		int temp_loop = loop.evaluate(env).intValue();
		while (temp_loop > 0)
		{
			body.eval(env);
			temp_loop--;
		}
	}

	@Override
	public void generate(Module gen, Map<String, LocalVar> env)
	{
		ArrayList<Instr> for_body = gen.asCode(body, gen, env);
		gen.emitFor(loop.generateValue(gen, env), for_body);
	}

}
