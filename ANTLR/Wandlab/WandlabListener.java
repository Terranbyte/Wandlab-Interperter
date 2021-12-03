// Generated from Wandlab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WandlabParser}.
 */
public interface WandlabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WandlabParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WandlabParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WandlabParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WandlabParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(WandlabParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(WandlabParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WandlabParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(WandlabParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(WandlabParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WandlabParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WandlabParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WandlabParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WandlabParser#subop}.
	 * @param ctx the parse tree
	 */
	void enterSubop(WandlabParser.SubopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#subop}.
	 * @param ctx the parse tree
	 */
	void exitSubop(WandlabParser.SubopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WandlabParser#preprocessor_command}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_command(WandlabParser.Preprocessor_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link WandlabParser#preprocessor_command}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_command(WandlabParser.Preprocessor_commandContext ctx);
}