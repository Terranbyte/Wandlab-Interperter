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
		ARGUMENT=1, STRING=2, POINTER=3, NUMBER=4, COMMENT=5, ALPHA=6, BETA=7, 
		DELTA=8, ZETA=9, ETA=10, LAMBDA=11, MU=12, XI=13, OMICORN=14, PI=15, SIGMA=16, 
		OMEGA=17, GAMMA=18, TAU=19, PHI=20, CHI=21, PREPROCESSNAME=22, PREPROCESSARG=23, 
		DASH=24, SLASH=25, POUND=26, COLON=27, SEMICOLON=28, PIPE=29, TICK=30, 
		QUOTE=31, ARROW=32, LBRACKET=33, RBRACKET=34, WS=35;
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
			null, null, null, null, null, null, "'Alpha'", "'Beta'", "'Delta'", "'Zeta'", 
			"'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicorn'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", null, null, "'-'", "'/'", 
			"'#'", "':'", "';'", "'|'", "'^'", "'\"'", "'->'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", "ALPHA", 
			"BETA", "DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", 
			"SIGMA", "OMEGA", "GAMMA", "TAU", "PHI", "CHI", "PREPROCESSNAME", "PREPROCESSARG", 
			"DASH", "SLASH", "POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", 
			"ARROW", "LBRACKET", "RBRACKET", "WS"
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
			setState(15);
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
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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
			setState(33);
			op();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK) {
				{
				setState(34);
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
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(ALPHA);
				}
				break;
			case BETA:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(BETA);
				}
				break;
			case DELTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(DELTA);
				setState(40);
				match(PIPE);
				setState(41);
				match(ARGUMENT);
				}
				break;
			case ZETA:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(ZETA);
				setState(43);
				match(PIPE);
				setState(44);
				match(ARGUMENT);
				setState(45);
				match(PIPE);
				setState(46);
				match(ARGUMENT);
				}
				break;
			case ETA:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(ETA);
				setState(48);
				match(PIPE);
				setState(49);
				match(ARGUMENT);
				setState(50);
				match(PIPE);
				setState(51);
				match(ARGUMENT);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(LAMBDA);
				setState(53);
				function();
				}
				break;
			case MU:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(MU);
				setState(55);
				match(PIPE);
				setState(56);
				match(ARGUMENT);
				setState(57);
				match(PIPE);
				setState(58);
				match(ARGUMENT);
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				match(XI);
				setState(60);
				match(PIPE);
				setState(61);
				match(ARGUMENT);
				setState(62);
				match(PIPE);
				setState(63);
				match(ARGUMENT);
				}
				break;
			case OMICORN:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				match(OMICORN);
				setState(65);
				match(PIPE);
				setState(66);
				match(ARGUMENT);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 10);
				{
				setState(67);
				match(PI);
				setState(68);
				match(PIPE);
				setState(69);
				match(ARGUMENT);
				setState(70);
				match(PIPE);
				setState(71);
				match(ARGUMENT);
				}
				break;
			case SIGMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				match(SIGMA);
				setState(73);
				function();
				}
				break;
			case OMEGA:
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
				match(OMEGA);
				setState(75);
				match(PIPE);
				setState(76);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACKET);
			setState(80);
			operation();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(81);
				match(DASH);
				setState(82);
				operation();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
			setState(90);
			match(TICK);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(91);
				match(GAMMA);
				setState(92);
				match(PIPE);
				setState(93);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(94);
				match(TAU);
				setState(95);
				match(PIPE);
				setState(96);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(97);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(98);
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}