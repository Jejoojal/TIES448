// Generated from OurLanguage.g4 by ANTLR 4.7.2
package OurLanguage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OurLanguageParser}.
 */
public interface OurLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(OurLanguageParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(OurLanguageParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIdstmt(OurLanguageParser.IdstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIdstmt(OurLanguageParser.IdstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(OurLanguageParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(OurLanguageParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(OurLanguageParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(OurLanguageParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqcon(OurLanguageParser.EqconContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqcon(OurLanguageParser.EqconContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lescon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLescon(OurLanguageParser.LesconContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lescon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLescon(OurLanguageParser.LesconContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greatcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreatcon(OurLanguageParser.GreatconContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greatcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreatcon(OurLanguageParser.GreatconContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAdd(OurLanguageParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAdd(OurLanguageParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noarith}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNoarith(OurLanguageParser.NoarithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noarith}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNoarith(OurLanguageParser.NoarithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void enterParen(OurLanguageParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void exitParen(OurLanguageParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void enterConst(OurLanguageParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void exitConst(OurLanguageParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void enterMul(OurLanguageParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void exitMul(OurLanguageParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void enterIntt(OurLanguageParser.InttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void exitIntt(OurLanguageParser.InttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublet}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void enterDoublet(OurLanguageParser.DoubletContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublet}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void exitDoublet(OurLanguageParser.DoubletContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void enterIdt(OurLanguageParser.IdtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 */
	void exitIdt(OurLanguageParser.IdtContext ctx);
}