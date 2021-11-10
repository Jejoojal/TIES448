// Generated from OurLanguage.g4 by ANTLR 4.7.2
package OurLanguage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OurLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OurLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(OurLanguageParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdstmt(OurLanguageParser.IdstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(OurLanguageParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(OurLanguageParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqcon(OurLanguageParser.EqconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lescon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLescon(OurLanguageParser.LesconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greatcon}
	 * labeled alternative in {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreatcon(OurLanguageParser.GreatconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(OurLanguageParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noarith}
	 * labeled alternative in {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoarith(OurLanguageParser.NoarithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(OurLanguageParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(OurLanguageParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link OurLanguageParser#simpleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(OurLanguageParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntt(OurLanguageParser.InttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublet}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublet(OurLanguageParser.DoubletContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idt}
	 * labeled alternative in {@link OurLanguageParser#simplestValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt(OurLanguageParser.IdtContext ctx);
}