
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import AST.ASTNode;
import AST.OurASTVisitor;
import AST.Program;
import AST.Type;
import OurLanguage.OurLanguageLexer;
import OurLanguage.OurLanguageParser;
import Module.LocalVar;
import Module.Module;
 
public class MainApp 
{
	public static void main( String[] args )
    {
    	String input = args[0];
    	
    	String[] args2 = Arrays.copyOfRange(args, 1, args.length);
    	System.out.println(args2);
    	
        try {
    	CharStream charstream =
    			CharStreams.fromFileName(input);
    	
        OurLanguageLexer lexer = new OurLanguageLexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        OurLanguageParser parser = new OurLanguageParser(commonTokenStream);
        ParseTree tree = parser.program();
        OurASTVisitor visitor = new OurASTVisitor();
        ASTNode ast = visitor.visit(tree);
        Map<String, Type> tenv = new HashMap<String, Type>();
        ast.typeCheck(tenv);
        System.out.println("AST is " + ast);
        System.out.println("Typing Env is " + tenv);
        Program prog = (Program) ast;
        Map<String, Number> env = new HashMap<String, Number>();
        
        System.out.println("Result: " + prog.run(env, args2));
        System.out.println("ENV is " + env);
        
        Module mod = new Module();
        
        Map<String, LocalVar> genv = new HashMap<String, LocalVar>();
        ast.generate(mod, genv);
        System.out.println("Module is " + mod);
        ArrayList<String> list = mod.listing();
        System.out.println("List size is " + list.size());
        
        for (String str : list)
        {
        	System.out.println(str);
        }
        
        Number output = mod.run(args2);
        System.out.println("output: " + output);
        if (output != null)
        {
        	if (!output.equals(prog.run(env, args2)))
        		System.out.println("Test run failed");
        }
        else
        {
        	if (prog.run(env, args2) != null)
        	{
        		System.out.println("Test run failed; both should be null");
        	}
        }
        
        String wat = mod.watgen(prog.name);
        System.out.println(wat);
        createFile(wat, prog.name);
        
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	static void createFile(String data, String name) throws IOException
	{
		PrintWriter printer = null;
		try {
			printer = new PrintWriter(new FileWriter(name + ".txt"));
			printer.print(data);
			printer.close();
		}
		catch (IOException ex) {
			throw ex;
		}
	}
}