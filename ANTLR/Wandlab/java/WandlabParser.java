// Generated from .\Wandlab.g4 by ANTLR 4.9.3
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
		PREPROCESSNAME=1, ARGUMENT=2, STRING=3, POINTER=4, NUMBER=5, COMMENT=6, 
		ALPHA=7, BETA=8, DELTA=9, ZETA=10, ETA=11, THETA=12, LAMBDA=13, MU=14, 
		XI=15, OMICRON=16, PI=17, SIGMA=18, OMEGA=19, GAMMA=20, TAU=21, PHI=22, 
		CHI=23, DASH=24, SLASH=25, POUND=26, COLON=27, SEMICOLON=28, PIPE=29, 
		TICK=30, QUOTE=31, ARROW=32, LBRACKET=33, RBRACKET=34, WS=35;
	public static final int
		RULE_program = 0, RULE_operation = 1, RULE_op = 2, RULE_function = 3, 
		RULE_subop = 4, RULE_preprocessor_command = 5, RULE_preprocessor_arg = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operation", "op", "function", "subop", "preprocessor_command", 
			"preprocessor_arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'Alpha'", "'Beta'", "'Delta'", 
			"'Zeta'", "'Eta'", "'Theta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicron'", 
			"'Pi'", "'Sigma'", "'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", "'-'", 
			"'/'", "'#'", "':'", "';'", "'|'", "'^'", "'\"'", "'->'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PREPROCESSNAME", "ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", 
			"ALPHA", "BETA", "DELTA", "ZETA", "ETA", "THETA", "LAMBDA", "MU", "XI", 
			"OMICRON", "PI", "SIGMA", "OMEGA", "GAMMA", "TAU", "PHI", "CHI", "DASH", 
			"SLASH", "POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", "ARROW", 
			"LBRACKET", "RBRACKET", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(14);
				preprocessor_command();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << BETA) | (1L << DELTA) | (1L << ZETA) | (1L << ETA) | (1L << THETA) | (1L << LAMBDA) | (1L << MU) | (1L << XI) | (1L << OMICRON) | (1L << PI) | (1L << SIGMA) | (1L << OMEGA))) != 0)) {
				{
				{
				setState(20);
				operation();
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DASH) {
					{
					{
					setState(21);
					match(DASH);
					setState(22);
					operation();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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

	public static class OperationContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<SubopContext> subop() {
			return getRuleContexts(SubopContext.class);
		}
		public SubopContext subop(int i) {
			return getRuleContext(SubopContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			op();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TICK) {
				{
				{
				setState(36);
				subop();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode THETA() { return getToken(WandlabParser.THETA, 0); }
		public TerminalNode LAMBDA() { return getToken(WandlabParser.LAMBDA, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode MU() { return getToken(WandlabParser.MU, 0); }
		public TerminalNode XI() { return getToken(WandlabParser.XI, 0); }
		public TerminalNode OMICRON() { return getToken(WandlabParser.OMICRON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ALPHA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(BETA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(DELTA);
				setState(45);
				match(PIPE);
				setState(46);
				match(ARGUMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(DELTA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(ZETA);
				setState(49);
				match(PIPE);
				setState(50);
				match(ARGUMENT);
				setState(51);
				match(PIPE);
				setState(52);
				match(ARGUMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(ETA);
				setState(54);
				match(PIPE);
				setState(55);
				match(ARGUMENT);
				setState(56);
				match(PIPE);
				setState(57);
				match(ARGUMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				match(THETA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				match(LAMBDA);
				setState(60);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				match(MU);
				setState(62);
				match(PIPE);
				setState(63);
				match(ARGUMENT);
				setState(64);
				match(PIPE);
				setState(65);
				match(ARGUMENT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(66);
				match(XI);
				setState(67);
				match(PIPE);
				setState(68);
				match(ARGUMENT);
				setState(69);
				match(PIPE);
				setState(70);
				match(ARGUMENT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				match(XI);
				setState(72);
				match(PIPE);
				setState(73);
				match(ARGUMENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
				match(OMICRON);
				setState(75);
				match(PIPE);
				setState(76);
				match(ARGUMENT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(77);
				match(PI);
				setState(78);
				match(PIPE);
				setState(79);
				match(ARGUMENT);
				setState(80);
				match(PIPE);
				setState(81);
				match(ARGUMENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(82);
				match(PI);
				setState(83);
				match(PIPE);
				setState(84);
				match(ARGUMENT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(85);
				match(SIGMA);
				setState(86);
				function();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(87);
				match(OMEGA);
				setState(88);
				match(PIPE);
				setState(89);
				match(ARGUMENT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(90);
				match(OMEGA);
				}
				break;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LBRACKET);
			setState(94);
			operation();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(95);
				match(DASH);
				setState(96);
				operation();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitSubop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubopContext subop() throws RecognitionException {
		SubopContext _localctx = new SubopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TICK);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(105);
				match(GAMMA);
				setState(106);
				match(PIPE);
				setState(107);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(108);
				match(TAU);
				setState(109);
				match(PIPE);
				setState(110);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(111);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(112);
				match(CHI);
				setState(113);
				match(PIPE);
				setState(114);
				match(ARGUMENT);
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
		public List<Preprocessor_argContext> preprocessor_arg() {
			return getRuleContexts(Preprocessor_argContext.class);
		}
		public Preprocessor_argContext preprocessor_arg(int i) {
			return getRuleContext(Preprocessor_argContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitPreprocessor_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_commandContext preprocessor_command() throws RecognitionException {
		Preprocessor_commandContext _localctx = new Preprocessor_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preprocessor_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(POUND);
			setState(118);
			match(PREPROCESSNAME);
			setState(119);
			match(COLON);
			setState(120);
			preprocessor_arg();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(121);
				match(PIPE);
				setState(122);
				preprocessor_arg();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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

	public static class Preprocessor_argContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(WandlabParser.ARGUMENT, 0); }
		public Preprocessor_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).enterPreprocessor_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WandlabListener ) ((WandlabListener)listener).exitPreprocessor_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WandlabVisitor ) return ((WandlabVisitor<? extends T>)visitor).visitPreprocessor_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_argContext preprocessor_arg() throws RecognitionException {
		Preprocessor_argContext _localctx = new Preprocessor_argContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_preprocessor_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ARGUMENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\7\2\37\n\2\f\2\16\2\""+
		"\13\2\3\2\3\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\7\5d\n\5\f\5"+
		"\16\5g\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6v\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2\u0098\2\23\3\2\2\2\4%\3\2\2\2\6]\3\2"+
		"\2\2\b_\3\2\2\2\nj\3\2\2\2\fw\3\2\2\2\16\u0084\3\2\2\2\20\22\5\f\7\2\21"+
		"\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24 \3\2\2\2\25\23"+
		"\3\2\2\2\26\33\5\4\3\2\27\30\7\32\2\2\30\32\5\4\3\2\31\27\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\36\26"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2"+
		"\2\3$\3\3\2\2\2%)\5\6\4\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,^\7\t\2\2-^\7\n\2\2./\7\13\2\2/\60\7\37"+
		"\2\2\60^\7\4\2\2\61^\7\13\2\2\62\63\7\f\2\2\63\64\7\37\2\2\64\65\7\4\2"+
		"\2\65\66\7\37\2\2\66^\7\4\2\2\678\7\r\2\289\7\37\2\29:\7\4\2\2:;\7\37"+
		"\2\2;^\7\4\2\2<^\7\16\2\2=>\7\17\2\2>^\5\b\5\2?@\7\20\2\2@A\7\37\2\2A"+
		"B\7\4\2\2BC\7\37\2\2C^\7\4\2\2DE\7\21\2\2EF\7\37\2\2FG\7\4\2\2GH\7\37"+
		"\2\2H^\7\4\2\2IJ\7\21\2\2JK\7\37\2\2K^\7\4\2\2LM\7\22\2\2MN\7\37\2\2N"+
		"^\7\4\2\2OP\7\23\2\2PQ\7\37\2\2QR\7\4\2\2RS\7\37\2\2S^\7\4\2\2TU\7\23"+
		"\2\2UV\7\37\2\2V^\7\4\2\2WX\7\24\2\2X^\5\b\5\2YZ\7\25\2\2Z[\7\37\2\2["+
		"^\7\4\2\2\\^\7\25\2\2],\3\2\2\2]-\3\2\2\2].\3\2\2\2]\61\3\2\2\2]\62\3"+
		"\2\2\2]\67\3\2\2\2]<\3\2\2\2]=\3\2\2\2]?\3\2\2\2]D\3\2\2\2]I\3\2\2\2]"+
		"L\3\2\2\2]O\3\2\2\2]T\3\2\2\2]W\3\2\2\2]Y\3\2\2\2]\\\3\2\2\2^\7\3\2\2"+
		"\2_`\7#\2\2`e\5\4\3\2ab\7\32\2\2bd\5\4\3\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7$\2\2i\t\3\2\2\2ju\7 \2\2kl\7\26\2"+
		"\2lm\7\37\2\2mv\7\4\2\2no\7\27\2\2op\7\37\2\2pv\7\4\2\2qv\7\30\2\2rs\7"+
		"\31\2\2st\7\37\2\2tv\7\4\2\2uk\3\2\2\2un\3\2\2\2uq\3\2\2\2ur\3\2\2\2v"+
		"\13\3\2\2\2wx\7\34\2\2xy\7\3\2\2yz\7\35\2\2z\177\5\16\b\2{|\7\37\2\2|"+
		"~\5\16\b\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\36\2\2\u0083\r\3\2\2\2"+
		"\u0084\u0085\7\4\2\2\u0085\17\3\2\2\2\n\23\33 )]eu\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}