// Generated from Wandlab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WandlabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
		ARGUMENT=1, STRING=2, POINTER=3, NUMBER=4, COMMENT=5, ALPHA=6, BETA=7, 
		DELTA=8, ZETA=9, ETA=10, LAMBDA=11, MU=12, XI=13, OMICORN=14, PI=15, SIGMA=16, 
		OMEGA=17, GAMMA=18, TAU=19, PHI=20, CHI=21, PREPROCESSNAME=22, PREPROCESSARG=23, 
		DASH=24, SLASH=25, POUND=26, COLON=27, SEMICOLON=28, PIPE=29, TICK=30, 
		QUOTE=31, ARROW=32, LBRACKET=33, RBRACKET=34, WS=35;
=======
		T__0=1, ARGUMENT=2, STRING=3, POINTER=4, ALPHA=5, BETA=6, DELTA=7, ZETA=8, 
		ETA=9, LAMBDA=10, MU=11, XI=12, OMICORN=13, PI=14, SIGMA=15, OMEGA=16, 
		GAMMA=17, TAU=18, PHI=19, CHI=20, PIPE=21, TICK=22, QUOTE=23, ARROW=24, 
		LBRACKET=25, RBRACKET=26, TEXT=27, NUMBER=28, WS=29;
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
	public static final int
		RULE_program = 0, RULE_operation = 1, RULE_op = 2, RULE_function = 3, 
		RULE_subop = 4, RULE_preprocessor_command = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operation", "op", "function", "subop", "preprocessor_command"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			null, null, null, null, null, null, "'Alpha'", "'Beta'", "'Delta'", "'Zeta'", 
			"'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicorn'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", null, null, "'-'", "'/'", 
			"'#'", "':'", "';'", "'|'", "'^'", "'\"'", "'->'", "'['", "']'"
=======
			null, "'-'", null, null, null, "'Alpha'", "'Beta'", "'Delta'", "'Zeta'", 
			"'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicorn'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", "'|'", "'^'", "'\"'", 
			"'->'", "'['", "']'"
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			null, "ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", "ALPHA", 
			"BETA", "DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", 
			"SIGMA", "OMEGA", "GAMMA", "TAU", "PHI", "CHI", "PREPROCESSNAME", "PREPROCESSARG", 
			"DASH", "SLASH", "POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", 
			"ARROW", "LBRACKET", "RBRACKET", "WS"
=======
			null, null, "ARGUMENT", "STRING", "POINTER", "ALPHA", "BETA", "DELTA", 
			"ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", "SIGMA", "OMEGA", 
			"GAMMA", "TAU", "PHI", "CHI", "PIPE", "TICK", "QUOTE", "ARROW", "LBRACKET", 
			"RBRACKET", "TEXT", "NUMBER", "WS"
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Wandlab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WandlabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
		public TerminalNode EOF() { return getToken(WandlabParser.EOF, 0); }
		public List<Preprocessor_commandContext> preprocessor_command() {
			return getRuleContexts(Preprocessor_commandContext.class);
		}
		public Preprocessor_commandContext preprocessor_command(int i) {
			return getRuleContext(Preprocessor_commandContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(WandlabParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(WandlabParser.DASH, i);
=======
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WandlabParser.EOF, 0); }
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(12);
				preprocessor_command();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << BETA) | (1L << DELTA) | (1L << ZETA) | (1L << ETA) | (1L << LAMBDA) | (1L << MU) | (1L << XI) | (1L << OMICORN) | (1L << PI) | (1L << SIGMA) | (1L << OMEGA))) != 0)) {
				{
				{
				setState(18);
				operation();
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DASH) {
					{
					{
					setState(19);
					match(DASH);
					setState(20);
					operation();
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(30);
=======
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12);
					sequence();
					}
					} 
				}
				setState(17);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(31);
=======
			setState(18);
			operation();
			setState(19);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
=======
	public static class SequenceContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitSequence(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			operation();
			setState(22);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
	public static class OperationContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public SubopContext subop() {
			return getRuleContext(SubopContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(33);
			op();
			setState(35);
=======
			setState(24);
			op();
			setState(26);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK) {
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(34);
=======
				setState(25);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				subop();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(WandlabParser.ALPHA, 0); }
		public TerminalNode BETA() { return getToken(WandlabParser.BETA, 0); }
		public TerminalNode DELTA() { return getToken(WandlabParser.DELTA, 0); }
		public List<TerminalNode> PIPE() { return getTokens(WandlabParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(WandlabParser.PIPE, i);
		}
		public List<TerminalNode> ARGUMENT() { return getTokens(WandlabParser.ARGUMENT); }
		public TerminalNode ARGUMENT(int i) {
			return getToken(WandlabParser.ARGUMENT, i);
		}
		public TerminalNode ZETA() { return getToken(WandlabParser.ZETA, 0); }
		public TerminalNode ETA() { return getToken(WandlabParser.ETA, 0); }
		public TerminalNode LAMBDA() { return getToken(WandlabParser.LAMBDA, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode MU() { return getToken(WandlabParser.MU, 0); }
		public TerminalNode XI() { return getToken(WandlabParser.XI, 0); }
		public TerminalNode OMICORN() { return getToken(WandlabParser.OMICORN, 0); }
		public TerminalNode PI() { return getToken(WandlabParser.PI, 0); }
		public TerminalNode SIGMA() { return getToken(WandlabParser.SIGMA, 0); }
		public TerminalNode OMEGA() { return getToken(WandlabParser.OMEGA, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(77);
=======
			setState(68);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(37);
=======
				setState(28);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ALPHA);
				}
				break;
			case BETA:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(38);
=======
				setState(29);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(BETA);
				}
				break;
			case DELTA:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(39);
				match(DELTA);
				setState(40);
				match(PIPE);
				setState(41);
=======
				setState(30);
				match(DELTA);
				setState(31);
				match(PIPE);
				setState(32);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case ZETA:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(42);
				match(ZETA);
				setState(43);
				match(PIPE);
				setState(44);
				match(ARGUMENT);
				setState(45);
				match(PIPE);
				setState(46);
=======
				setState(33);
				match(ZETA);
				setState(34);
				match(PIPE);
				setState(35);
				match(ARGUMENT);
				setState(36);
				match(PIPE);
				setState(37);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case ETA:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(47);
				match(ETA);
				setState(48);
				match(PIPE);
				setState(49);
				match(ARGUMENT);
				setState(50);
				match(PIPE);
				setState(51);
=======
				setState(38);
				match(ETA);
				setState(39);
				match(PIPE);
				setState(40);
				match(ARGUMENT);
				setState(41);
				match(PIPE);
				setState(42);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(52);
				match(LAMBDA);
				setState(53);
=======
				setState(43);
				match(LAMBDA);
				setState(44);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				function();
				}
				break;
			case MU:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(54);
				match(MU);
				setState(55);
				match(PIPE);
				setState(56);
				match(ARGUMENT);
				setState(57);
				match(PIPE);
				setState(58);
=======
				setState(45);
				match(MU);
				setState(46);
				match(PIPE);
				setState(47);
				match(ARGUMENT);
				setState(48);
				match(PIPE);
				setState(49);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(59);
				match(XI);
				setState(60);
				match(PIPE);
				setState(61);
				match(ARGUMENT);
				setState(62);
				match(PIPE);
				setState(63);
=======
				setState(50);
				match(XI);
				setState(51);
				match(PIPE);
				setState(52);
				match(ARGUMENT);
				setState(53);
				match(PIPE);
				setState(54);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case OMICORN:
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(64);
				match(OMICORN);
				setState(65);
				match(PIPE);
				setState(66);
=======
				setState(55);
				match(OMICORN);
				setState(56);
				match(PIPE);
				setState(57);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 10);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(67);
				match(PI);
				setState(68);
				match(PIPE);
				setState(69);
				match(ARGUMENT);
				setState(70);
				match(PIPE);
				setState(71);
=======
				setState(58);
				match(PI);
				setState(59);
				match(PIPE);
				setState(60);
				match(ARGUMENT);
				setState(61);
				match(PIPE);
				setState(62);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case SIGMA:
				enterOuterAlt(_localctx, 11);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(72);
				match(SIGMA);
				setState(73);
=======
				setState(63);
				match(SIGMA);
				setState(64);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				function();
				}
				break;
			case OMEGA:
				enterOuterAlt(_localctx, 12);
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(74);
				match(OMEGA);
				setState(75);
				match(PIPE);
				setState(76);
=======
				setState(65);
				match(OMEGA);
				setState(66);
				match(PIPE);
				setState(67);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(WandlabParser.LBRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(WandlabParser.RBRACKET, 0); }
		public List<TerminalNode> DASH() { return getTokens(WandlabParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(WandlabParser.DASH, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(79);
			match(LBRACKET);
			setState(80);
			operation();
			setState(85);
=======
			setState(70);
			match(LBRACKET);
			setState(78);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				{
				setState(81);
				match(DASH);
				setState(82);
=======
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						sequence();
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(77);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				operation();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(88);
=======

			setState(80);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubopContext extends ParserRuleContext {
		public TerminalNode TICK() { return getToken(WandlabParser.TICK, 0); }
		public TerminalNode GAMMA() { return getToken(WandlabParser.GAMMA, 0); }
		public TerminalNode PIPE() { return getToken(WandlabParser.PIPE, 0); }
		public TerminalNode ARGUMENT() { return getToken(WandlabParser.ARGUMENT, 0); }
		public TerminalNode TAU() { return getToken(WandlabParser.TAU, 0); }
		public TerminalNode PHI() { return getToken(WandlabParser.PHI, 0); }
		public TerminalNode CHI() { return getToken(WandlabParser.CHI, 0); }
		public SubopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterSubop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitSubop(this);
		}
	}

	public final SubopContext subop() throws RecognitionException {
		SubopContext _localctx = new SubopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subop);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
			setState(90);
			match(TICK);
			setState(99);
=======
			setState(82);
			match(TICK);
			setState(91);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(91);
				match(GAMMA);
				setState(92);
				match(PIPE);
				setState(93);
=======
				setState(83);
				match(GAMMA);
				setState(84);
				match(PIPE);
				setState(85);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(94);
				match(TAU);
				setState(95);
				match(PIPE);
				setState(96);
=======
				setState(86);
				match(TAU);
				setState(87);
				match(PIPE);
				setState(88);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(97);
=======
				setState(89);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(PHI);
				}
				break;
			case CHI:
				{
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
				setState(98);
=======
				setState(90);
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
				match(CHI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Preprocessor_commandContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(WandlabParser.POUND, 0); }
		public TerminalNode PREPROCESSNAME() { return getToken(WandlabParser.PREPROCESSNAME, 0); }
		public TerminalNode COLON() { return getToken(WandlabParser.COLON, 0); }
		public List<TerminalNode> PREPROCESSARG() { return getTokens(WandlabParser.PREPROCESSARG); }
		public TerminalNode PREPROCESSARG(int i) {
			return getToken(WandlabParser.PREPROCESSARG, i);
		}
		public TerminalNode SEMICOLON() { return getToken(WandlabParser.SEMICOLON, 0); }
		public List<TerminalNode> PIPE() { return getTokens(WandlabParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(WandlabParser.PIPE, i);
		}
		public Preprocessor_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterPreprocessor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitPreprocessor_command(this);
		}
	}

	public final Preprocessor_commandContext preprocessor_command() throws RecognitionException {
		Preprocessor_commandContext _localctx = new Preprocessor_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preprocessor_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(POUND);
			setState(102);
			match(PREPROCESSNAME);
			setState(103);
			match(COLON);
			setState(104);
			match(PREPROCESSARG);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(105);
				match(PIPE);
				setState(106);
				match(PREPROCESSARG);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
<<<<<<< HEAD:ANTLR/Wandlab/java/WandlabParser.java
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%u\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3"+
		"\3\3\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\7\5V\n\5"+
		"\f\5\16\5Y\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6f\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2\2\u0082\2\21\3\2\2\2\4#\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\n\\\3"+
		"\2\2\2\fg\3\2\2\2\16\20\5\f\7\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\36\3\2\2\2\23\21\3\2\2\2\24\31\5\4\3\2\25\26\7\32"+
		"\2\2\26\30\5\4\3\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\34\24\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#%\5\6"+
		"\4\2$&\5\n\6\2%$\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'P\7\b\2\2(P\7\t\2\2)*\7"+
		"\n\2\2*+\7\37\2\2+P\7\3\2\2,-\7\13\2\2-.\7\37\2\2./\7\3\2\2/\60\7\37\2"+
		"\2\60P\7\3\2\2\61\62\7\f\2\2\62\63\7\37\2\2\63\64\7\3\2\2\64\65\7\37\2"+
		"\2\65P\7\3\2\2\66\67\7\r\2\2\67P\5\b\5\289\7\16\2\29:\7\37\2\2:;\7\3\2"+
		"\2;<\7\37\2\2<P\7\3\2\2=>\7\17\2\2>?\7\37\2\2?@\7\3\2\2@A\7\37\2\2AP\7"+
		"\3\2\2BC\7\20\2\2CD\7\37\2\2DP\7\3\2\2EF\7\21\2\2FG\7\37\2\2GH\7\3\2\2"+
		"HI\7\37\2\2IP\7\3\2\2JK\7\22\2\2KP\5\b\5\2LM\7\23\2\2MN\7\37\2\2NP\7\3"+
		"\2\2O\'\3\2\2\2O(\3\2\2\2O)\3\2\2\2O,\3\2\2\2O\61\3\2\2\2O\66\3\2\2\2"+
		"O8\3\2\2\2O=\3\2\2\2OB\3\2\2\2OE\3\2\2\2OJ\3\2\2\2OL\3\2\2\2P\7\3\2\2"+
		"\2QR\7#\2\2RW\5\4\3\2ST\7\32\2\2TV\5\4\3\2US\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7$\2\2[\t\3\2\2\2\\e\7 \2\2]^\7\24"+
		"\2\2^_\7\37\2\2_f\7\3\2\2`a\7\25\2\2ab\7\37\2\2bf\7\3\2\2cf\7\26\2\2d"+
		"f\7\27\2\2e]\3\2\2\2e`\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\34"+
		"\2\2hi\7\30\2\2ij\7\35\2\2jo\7\31\2\2kl\7\37\2\2ln\7\31\2\2mk\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\36\2\2s\r\3\2\2"+
		"\2\n\21\31\36%OWeo";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5G\n\5"+
		"\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\5\6Q\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2k\2\21\3\2\2"+
		"\2\4\27\3\2\2\2\6\32\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fT\3\2\2\2\16\20\5"+
		"\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3"+
		"\2\2\2\23\21\3\2\2\2\24\25\5\6\4\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5"+
		"\6\4\2\30\31\7\3\2\2\31\5\3\2\2\2\32\34\5\b\5\2\33\35\5\f\7\2\34\33\3"+
		"\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36G\7\7\2\2\37G\7\b\2\2 !\7\t\2\2!\""+
		"\7\27\2\2\"G\7\4\2\2#$\7\n\2\2$%\7\27\2\2%&\7\4\2\2&\'\7\27\2\2\'G\7\4"+
		"\2\2()\7\13\2\2)*\7\27\2\2*+\7\4\2\2+,\7\27\2\2,G\7\4\2\2-.\7\f\2\2.G"+
		"\5\n\6\2/\60\7\r\2\2\60\61\7\27\2\2\61\62\7\4\2\2\62\63\7\27\2\2\63G\7"+
		"\4\2\2\64\65\7\16\2\2\65\66\7\27\2\2\66\67\7\4\2\2\678\7\27\2\28G\7\4"+
		"\2\29:\7\17\2\2:;\7\27\2\2;G\7\4\2\2<=\7\20\2\2=>\7\27\2\2>?\7\4\2\2?"+
		"@\7\27\2\2@G\7\4\2\2AB\7\21\2\2BG\5\n\6\2CD\7\22\2\2DE\7\27\2\2EG\7\4"+
		"\2\2F\36\3\2\2\2F\37\3\2\2\2F \3\2\2\2F#\3\2\2\2F(\3\2\2\2F-\3\2\2\2F"+
		"/\3\2\2\2F\64\3\2\2\2F9\3\2\2\2F<\3\2\2\2FA\3\2\2\2FC\3\2\2\2G\t\3\2\2"+
		"\2HP\7\33\2\2IK\5\4\3\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NL\3\2\2\2OQ\5\6\4\2PL\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\34\2\2S\13"+
		"\3\2\2\2T]\7\30\2\2UV\7\23\2\2VW\7\27\2\2W^\7\4\2\2XY\7\24\2\2YZ\7\27"+
		"\2\2Z^\7\4\2\2[^\7\25\2\2\\^\7\26\2\2]U\3\2\2\2]X\3\2\2\2][\3\2\2\2]\\"+
		"\3\2\2\2^\r\3\2\2\2\b\21\34FLP]";
>>>>>>> parent of 5ff3926 (Fixed grammar file and generated C# code):ANTLR/Wandlab/WandlabParser.java
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}