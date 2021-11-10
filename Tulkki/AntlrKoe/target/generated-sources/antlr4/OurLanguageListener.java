// Generated from OurLanguage.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OurLanguageParser}.
 */
public interface OurLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull OurLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull OurLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull OurLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull OurLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull OurLanguageParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull OurLanguageParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull OurLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull OurLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull OurLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull OurLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull OurLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull OurLanguageParser.ValueContext ctx);
}