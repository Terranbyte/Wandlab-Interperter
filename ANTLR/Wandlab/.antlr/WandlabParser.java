// Generated from c:\Users\fredrik.nikielhard\source\repos\Wandlab\Wandlab-Interperter\ANTLR\Wandlab\Wandlab.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		public SubopContext subop() {
			return getRuleContext(SubopContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK) {
				{
				setState(36);
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
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(ALPHA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(BETA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(DELTA);
				setState(42);
				match(PIPE);
				setState(43);
				match(ARGUMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(ZETA);
				setState(45);
				match(PIPE);
				setState(46);
				match(ARGUMENT);
				setState(47);
				match(PIPE);
				setState(48);
				match(ARGUMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(ETA);
				setState(50);
				match(PIPE);
				setState(51);
				match(ARGUMENT);
				setState(52);
				match(PIPE);
				setState(53);
				match(ARGUMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(THETA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				match(LAMBDA);
				setState(56);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(MU);
				setState(58);
				match(PIPE);
				setState(59);
				match(ARGUMENT);
				setState(60);
				match(PIPE);
				setState(61);
				match(ARGUMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				match(XI);
				setState(63);
				match(PIPE);
				setState(64);
				match(ARGUMENT);
				setState(65);
				match(PIPE);
				setState(66);
				match(ARGUMENT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(67);
				match(XI);
				setState(68);
				match(PIPE);
				setState(69);
				match(ARGUMENT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(70);
				match(OMICRON);
				setState(71);
				match(PIPE);
				setState(72);
				match(ARGUMENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				match(PI);
				setState(74);
				match(PIPE);
				setState(75);
				match(ARGUMENT);
				setState(76);
				match(PIPE);
				setState(77);
				match(ARGUMENT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				match(PI);
				setState(79);
				match(PIPE);
				setState(80);
				match(ARGUMENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				match(SIGMA);
				setState(82);
				function();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(83);
				match(OMEGA);
				setState(84);
				match(PIPE);
				setState(85);
				match(ARGUMENT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(86);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LBRACKET);
			setState(90);
			operation();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(91);
				match(DASH);
				setState(92);
				operation();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
	}

	public final SubopContext subop() throws RecognitionException {
		SubopContext _localctx = new SubopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TICK);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(101);
				match(GAMMA);
				setState(102);
				match(PIPE);
				setState(103);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(104);
				match(TAU);
				setState(105);
				match(PIPE);
				setState(106);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(107);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(108);
				match(CHI);
				setState(109);
				match(PIPE);
				setState(110);
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
	}

	public final Preprocessor_commandContext preprocessor_command() throws RecognitionException {
		Preprocessor_commandContext _localctx = new Preprocessor_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preprocessor_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(POUND);
			setState(114);
			match(PREPROCESSNAME);
			setState(115);
			match(COLON);
			setState(116);
			preprocessor_arg();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(117);
				match(PIPE);
				setState(118);
				preprocessor_arg();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
	}

	public final Preprocessor_argContext preprocessor_arg() throws RecognitionException {
		Preprocessor_argContext _localctx = new Preprocessor_argContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_preprocessor_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0083\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\7\2\37\n\2\f\2\16\2\""+
		"\13\2\3\2\3\2\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f"+
		"\16\2\2\2\u0093\2\23\3\2\2\2\4%\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\nf\3\2\2"+
		"\2\fs\3\2\2\2\16\u0080\3\2\2\2\20\22\5\f\7\2\21\20\3\2\2\2\22\25\3\2\2"+
		"\2\23\21\3\2\2\2\23\24\3\2\2\2\24 \3\2\2\2\25\23\3\2\2\2\26\33\5\4\3\2"+
		"\27\30\7\32\2\2\30\32\5\4\3\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2"+
		"\2\33\34\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\36\26\3\2\2\2\37\"\3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%\'"+
		"\5\6\4\2&(\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)Z\7\t\2\2*Z\7\n\2"+
		"\2+,\7\13\2\2,-\7\37\2\2-Z\7\4\2\2./\7\f\2\2/\60\7\37\2\2\60\61\7\4\2"+
		"\2\61\62\7\37\2\2\62Z\7\4\2\2\63\64\7\r\2\2\64\65\7\37\2\2\65\66\7\4\2"+
		"\2\66\67\7\37\2\2\67Z\7\4\2\28Z\7\16\2\29:\7\17\2\2:Z\5\b\5\2;<\7\20\2"+
		"\2<=\7\37\2\2=>\7\4\2\2>?\7\37\2\2?Z\7\4\2\2@A\7\21\2\2AB\7\37\2\2BC\7"+
		"\4\2\2CD\7\37\2\2DZ\7\4\2\2EF\7\21\2\2FG\7\37\2\2GZ\7\4\2\2HI\7\22\2\2"+
		"IJ\7\37\2\2JZ\7\4\2\2KL\7\23\2\2LM\7\37\2\2MN\7\4\2\2NO\7\37\2\2OZ\7\4"+
		"\2\2PQ\7\23\2\2QR\7\37\2\2RZ\7\4\2\2ST\7\24\2\2TZ\5\b\5\2UV\7\25\2\2V"+
		"W\7\37\2\2WZ\7\4\2\2XZ\7\25\2\2Y)\3\2\2\2Y*\3\2\2\2Y+\3\2\2\2Y.\3\2\2"+
		"\2Y\63\3\2\2\2Y8\3\2\2\2Y9\3\2\2\2Y;\3\2\2\2Y@\3\2\2\2YE\3\2\2\2YH\3\2"+
		"\2\2YK\3\2\2\2YP\3\2\2\2YS\3\2\2\2YU\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\7"+
		"#\2\2\\a\5\4\3\2]^\7\32\2\2^`\5\4\3\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7$\2\2e\t\3\2\2\2fq\7 \2\2gh\7\26\2\2h"+
		"i\7\37\2\2ir\7\4\2\2jk\7\27\2\2kl\7\37\2\2lr\7\4\2\2mr\7\30\2\2no\7\31"+
		"\2\2op\7\37\2\2pr\7\4\2\2qg\3\2\2\2qj\3\2\2\2qm\3\2\2\2qn\3\2\2\2r\13"+
		"\3\2\2\2st\7\34\2\2tu\7\3\2\2uv\7\35\2\2v{\5\16\b\2wx\7\37\2\2xz\5\16"+
		"\b\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177"+
		"\7\36\2\2\177\r\3\2\2\2\u0080\u0081\7\4\2\2\u0081\17\3\2\2\2\n\23\33 "+
		"\'Yaq{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}