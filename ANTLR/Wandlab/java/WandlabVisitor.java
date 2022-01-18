// Generated from .\Wandlab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WandlabParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WandlabVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WandlabParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WandlabParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WandlabParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(WandlabParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WandlabParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(WandlabParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WandlabParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(WandlabParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WandlabParser#subop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubop(WandlabParser.SubopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WandlabParser#preprocessor_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_command(WandlabParser.Preprocessor_commandContext ctx);
}