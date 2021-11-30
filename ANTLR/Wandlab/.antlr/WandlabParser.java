// Generated from c:\Users\fredr\source\repos\Wandlab\Wandlab interpreter\ANTLR\Wandlab\Wandlab.g4 by ANTLR 4.8
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
		T__0=1, ARGUMENT=2, STRING=3, POINTER=4, ALPHA=5, BETA=6, DELTA=7, ZETA=8, 
		ETA=9, LAMBDA=10, MU=11, XI=12, OMICORN=13, PI=14, SIGMA=15, OMEGA=16, 
		GAMMA=17, TAU=18, PHI=19, CHI=20, PIPE=21, TICK=22, QUOTE=23, ARROW=24, 
		LBRACKET=25, RBRACKET=26, TEXT=27, NUMBER=28, WS=29;
	public static final int
		RULE_program = 0, RULE_sequence = 1, RULE_operation = 2, RULE_op = 3, 
		RULE_function = 4, RULE_subop = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sequence", "operation", "op", "function", "subop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", null, null, null, "'Alpha'", "'Beta'", "'Delta'", "'Zeta'", 
			"'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicorn'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", "'|'", "'^'", "'\"'", 
			"'->'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ARGUMENT", "STRING", "POINTER", "ALPHA", "BETA", "DELTA", 
			"ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", "SIGMA", "OMEGA", 
			"GAMMA", "TAU", "PHI", "CHI", "PIPE", "TICK", "QUOTE", "ARROW", "LBRACKET", 
			"RBRACKET", "TEXT", "NUMBER", "WS"
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WandlabParser.EOF, 0); }
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
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
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(18);
			operation();
			setState(19);
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

	public static class SequenceContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
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
		enterRule(_localctx, 4, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			op();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK) {
				{
				setState(25);
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
		enterRule(_localctx, 6, RULE_op);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(ALPHA);
				}
				break;
			case BETA:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(BETA);
				}
				break;
			case DELTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(DELTA);
				setState(31);
				match(PIPE);
				setState(32);
				match(ARGUMENT);
				}
				break;
			case ZETA:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(ZETA);
				setState(34);
				match(PIPE);
				setState(35);
				match(ARGUMENT);
				setState(36);
				match(PIPE);
				setState(37);
				match(ARGUMENT);
				}
				break;
			case ETA:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(ETA);
				setState(39);
				match(PIPE);
				setState(40);
				match(ARGUMENT);
				setState(41);
				match(PIPE);
				setState(42);
				match(ARGUMENT);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(LAMBDA);
				setState(44);
				function();
				}
				break;
			case MU:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				match(MU);
				setState(46);
				match(PIPE);
				setState(47);
				match(ARGUMENT);
				setState(48);
				match(PIPE);
				setState(49);
				match(ARGUMENT);
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				match(XI);
				setState(51);
				match(PIPE);
				setState(52);
				match(ARGUMENT);
				setState(53);
				match(PIPE);
				setState(54);
				match(ARGUMENT);
				}
				break;
			case OMICORN:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				match(OMICORN);
				setState(56);
				match(PIPE);
				setState(57);
				match(ARGUMENT);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				match(PI);
				setState(59);
				match(PIPE);
				setState(60);
				match(ARGUMENT);
				setState(61);
				match(PIPE);
				setState(62);
				match(ARGUMENT);
				}
				break;
			case SIGMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(SIGMA);
				setState(64);
				function();
				}
				break;
			case OMEGA:
				enterOuterAlt(_localctx, 12);
				{
				setState(65);
				match(OMEGA);
				setState(66);
				match(PIPE);
				setState(67);
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
		public TerminalNode RBRACKET() { return getToken(WandlabParser.RBRACKET, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LBRACKET);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << BETA) | (1L << DELTA) | (1L << ZETA) | (1L << ETA) | (1L << LAMBDA) | (1L << MU) | (1L << XI) | (1L << OMICORN) | (1L << PI) | (1L << SIGMA) | (1L << OMEGA))) != 0)) {
				{
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
				operation();
				}
			}

			setState(80);
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
		enterRule(_localctx, 10, RULE_subop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TICK);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(83);
				match(GAMMA);
				setState(84);
				match(PIPE);
				setState(85);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(86);
				match(TAU);
				setState(87);
				match(PIPE);
				setState(88);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(89);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(90);
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

	public static final String _serializedATN =
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}