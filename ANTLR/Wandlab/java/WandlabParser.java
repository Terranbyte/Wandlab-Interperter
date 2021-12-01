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
		T__0=1, ARGUMENT=2, STRING=3, POINTER=4, NUMBER=5, ALPHA=6, BETA=7, DELTA=8, 
		ZETA=9, ETA=10, LAMBDA=11, MU=12, XI=13, OMICORN=14, PI=15, SIGMA=16, 
		OMEGA=17, GAMMA=18, TAU=19, PHI=20, CHI=21, PIPE=22, TICK=23, QUOTE=24, 
		ARROW=25, LBRACKET=26, RBRACKET=27, WS=28;
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
			null, "'-'", null, null, null, null, "'Alpha'", "'Beta'", "'Delta'", 
			"'Zeta'", "'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicorn'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", "'|'", "'^'", "'\"'", 
			"'->'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ARGUMENT", "STRING", "POINTER", "NUMBER", "ALPHA", "BETA", 
			"DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", "SIGMA", 
			"OMEGA", "GAMMA", "TAU", "PHI", "CHI", "PIPE", "TICK", "QUOTE", "ARROW", 
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
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << BETA) | (1L << DELTA) | (1L << ZETA) | (1L << ETA) | (1L << LAMBDA) | (1L << MU) | (1L << XI) | (1L << OMICORN) | (1L << PI) | (1L << SIGMA) | (1L << OMEGA))) != 0)) {
				{
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
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
			setState(26);
			operation();
			setState(27);
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
		enterRule(_localctx, 4, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			op();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK) {
				{
				setState(30);
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
		enterRule(_localctx, 6, RULE_op);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(ALPHA);
				}
				break;
			case BETA:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(BETA);
				}
				break;
			case DELTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(DELTA);
				setState(36);
				match(PIPE);
				setState(37);
				match(ARGUMENT);
				}
				break;
			case ZETA:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(ZETA);
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
			case ETA:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(ETA);
				setState(44);
				match(PIPE);
				setState(45);
				match(ARGUMENT);
				setState(46);
				match(PIPE);
				setState(47);
				match(ARGUMENT);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(LAMBDA);
				setState(49);
				function();
				}
				break;
			case MU:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				match(MU);
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
			case XI:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(XI);
				setState(56);
				match(PIPE);
				setState(57);
				match(ARGUMENT);
				setState(58);
				match(PIPE);
				setState(59);
				match(ARGUMENT);
				}
				break;
			case OMICORN:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				match(OMICORN);
				setState(61);
				match(PIPE);
				setState(62);
				match(ARGUMENT);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				match(PI);
				setState(64);
				match(PIPE);
				setState(65);
				match(ARGUMENT);
				setState(66);
				match(PIPE);
				setState(67);
				match(ARGUMENT);
				}
				break;
			case SIGMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				match(SIGMA);
				setState(69);
				function();
				}
				break;
			case OMEGA:
				enterOuterAlt(_localctx, 12);
				{
				setState(70);
				match(OMEGA);
				setState(71);
				match(PIPE);
				setState(72);
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
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LBRACKET);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << BETA) | (1L << DELTA) | (1L << ZETA) | (1L << ETA) | (1L << LAMBDA) | (1L << MU) | (1L << XI) | (1L << OMICORN) | (1L << PI) | (1L << SIGMA) | (1L << OMEGA))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						sequence();
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(82);
				operation();
				}
			}

			setState(85);
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
		enterRule(_localctx, 10, RULE_subop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TICK);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(88);
				match(GAMMA);
				setState(89);
				match(PIPE);
				setState(90);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(91);
				match(TAU);
				setState(92);
				match(PIPE);
				setState(93);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(94);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(95);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\"\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\6\5\6V\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2\2q\2\27\3\2\2\2\4\34\3\2\2\2\6\37\3\2\2\2\bK\3\2\2\2\nM\3\2"+
		"\2\2\fY\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2"+
		"\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\26\5\6\4\2\25\21\3\2\2"+
		"\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2"+
		"\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\5\6\4\2\35\36\7\3\2\2\36\5\3\2\2\2"+
		"\37!\5\b\5\2 \"\5\f\7\2! \3\2\2\2!\"\3\2\2\2\"\7\3\2\2\2#L\7\b\2\2$L\7"+
		"\t\2\2%&\7\n\2\2&\'\7\30\2\2\'L\7\4\2\2()\7\13\2\2)*\7\30\2\2*+\7\4\2"+
		"\2+,\7\30\2\2,L\7\4\2\2-.\7\f\2\2./\7\30\2\2/\60\7\4\2\2\60\61\7\30\2"+
		"\2\61L\7\4\2\2\62\63\7\r\2\2\63L\5\n\6\2\64\65\7\16\2\2\65\66\7\30\2\2"+
		"\66\67\7\4\2\2\678\7\30\2\28L\7\4\2\29:\7\17\2\2:;\7\30\2\2;<\7\4\2\2"+
		"<=\7\30\2\2=L\7\4\2\2>?\7\20\2\2?@\7\30\2\2@L\7\4\2\2AB\7\21\2\2BC\7\30"+
		"\2\2CD\7\4\2\2DE\7\30\2\2EL\7\4\2\2FG\7\22\2\2GL\5\n\6\2HI\7\23\2\2IJ"+
		"\7\30\2\2JL\7\4\2\2K#\3\2\2\2K$\3\2\2\2K%\3\2\2\2K(\3\2\2\2K-\3\2\2\2"+
		"K\62\3\2\2\2K\64\3\2\2\2K9\3\2\2\2K>\3\2\2\2KA\3\2\2\2KF\3\2\2\2KH\3\2"+
		"\2\2L\t\3\2\2\2MU\7\34\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RT\3\2\2\2SQ\3\2\2\2TV\5\6\4\2UQ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7"+
		"\35\2\2X\13\3\2\2\2Yb\7\31\2\2Z[\7\24\2\2[\\\7\30\2\2\\c\7\4\2\2]^\7\25"+
		"\2\2^_\7\30\2\2_c\7\4\2\2`c\7\26\2\2ac\7\27\2\2bZ\3\2\2\2b]\3\2\2\2b`"+
		"\3\2\2\2ba\3\2\2\2c\r\3\2\2\2\t\21\27!KQUb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}