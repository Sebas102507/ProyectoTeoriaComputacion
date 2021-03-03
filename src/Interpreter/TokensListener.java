package Interpreter;// Generated from Tokens.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TokensParser}.
 */
public interface TokensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TokensParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TokensParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokensParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TokensParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokensParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(TokensParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokensParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(TokensParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokensParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(TokensParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokensParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(TokensParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokensParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(TokensParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokensParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(TokensParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokensParser#operacionAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacionAritmetica(TokensParser.OperacionAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokensParser#operacionAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacionAritmetica(TokensParser.OperacionAritmeticaContext ctx);
}