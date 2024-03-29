//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from .\Wandlab.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419


using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IWandlabListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class WandlabBaseListener : IWandlabListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProgram([NotNull] WandlabParser.ProgramContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProgram([NotNull] WandlabParser.ProgramContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.operation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOperation([NotNull] WandlabParser.OperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.operation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOperation([NotNull] WandlabParser.OperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.op"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp([NotNull] WandlabParser.OpContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.op"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp([NotNull] WandlabParser.OpContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.function"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunction([NotNull] WandlabParser.FunctionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.function"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunction([NotNull] WandlabParser.FunctionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.subop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSubop([NotNull] WandlabParser.SubopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.subop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSubop([NotNull] WandlabParser.SubopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.preprocessor_command"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPreprocessor_command([NotNull] WandlabParser.Preprocessor_commandContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.preprocessor_command"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPreprocessor_command([NotNull] WandlabParser.Preprocessor_commandContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="WandlabParser.preprocessor_arg"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPreprocessor_arg([NotNull] WandlabParser.Preprocessor_argContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="WandlabParser.preprocessor_arg"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPreprocessor_arg([NotNull] WandlabParser.Preprocessor_argContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
