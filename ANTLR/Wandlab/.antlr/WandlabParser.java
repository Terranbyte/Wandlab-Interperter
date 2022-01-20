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
			setState(88);
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
				match(DELTA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(ZETA);
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(ETA);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				match(THETA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				match(LAMBDA);
				setState(57);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(MU);
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
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				match(XI);
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				match(XI);
				setState(69);
				match(PIPE);
				setState(70);
				match(ARGUMENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(71);
				match(OMICRON);
				setState(72);
				match(PIPE);
				setState(73);
				match(ARGUMENT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				match(PI);
				setState(75);
				match(PIPE);
				setState(76);
				match(ARGUMENT);
				setState(77);
				match(PIPE);
				setState(78);
				match(ARGUMENT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				match(PI);
				setState(80);
				match(PIPE);
				setState(81);
				match(ARGUMENT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				match(SIGMA);
				setState(83);
				function();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(84);
				match(OMEGA);
				setState(85);
				match(PIPE);
				setState(86);
				match(ARGUMENT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(87);
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
			setState(90);
			match(LBRACKET);
			setState(91);
			operation();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(92);
				match(DASH);
				setState(93);
				operation();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
			setState(101);
			match(TICK);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMA:
				{
				setState(102);
				match(GAMMA);
				setState(103);
				match(PIPE);
				setState(104);
				match(ARGUMENT);
				}
				break;
			case TAU:
				{
				setState(105);
				match(TAU);
				setState(106);
				match(PIPE);
				setState(107);
				match(ARGUMENT);
				}
				break;
			case PHI:
				{
				setState(108);
				match(PHI);
				}
				break;
			case CHI:
				{
				setState(109);
				match(CHI);
				setState(110);
				match(PIPE);
				setState(111);
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
			setState(114);
			match(POUND);
			setState(115);
			match(PREPROCESSNAME);
			setState(116);
			match(COLON);
			setState(117);
			preprocessor_arg();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(118);
				match(PIPE);
				setState(119);
				preprocessor_arg();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
			setState(127);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\7\2\37\n\2\f\2\16\2\""+
		"\13\2\3\2\3\2\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b"+
		"\n\f\16\2\2\2\u0095\2\23\3\2\2\2\4%\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\ng"+
		"\3\2\2\2\ft\3\2\2\2\16\u0081\3\2\2\2\20\22\5\f\7\2\21\20\3\2\2\2\22\25"+
		"\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24 \3\2\2\2\25\23\3\2\2\2\26\33\5"+
		"\4\3\2\27\30\7\32\2\2\30\32\5\4\3\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\36\26\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2"+
		"\2%\'\5\6\4\2&(\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)[\7\t\2\2*[\7"+
		"\n\2\2+,\7\13\2\2,-\7\37\2\2-[\7\4\2\2.[\7\13\2\2/\60\7\f\2\2\60\61\7"+
		"\37\2\2\61\62\7\4\2\2\62\63\7\37\2\2\63[\7\4\2\2\64\65\7\r\2\2\65\66\7"+
		"\37\2\2\66\67\7\4\2\2\678\7\37\2\28[\7\4\2\29[\7\16\2\2:;\7\17\2\2;[\5"+
		"\b\5\2<=\7\20\2\2=>\7\37\2\2>?\7\4\2\2?@\7\37\2\2@[\7\4\2\2AB\7\21\2\2"+
		"BC\7\37\2\2CD\7\4\2\2DE\7\37\2\2E[\7\4\2\2FG\7\21\2\2GH\7\37\2\2H[\7\4"+
		"\2\2IJ\7\22\2\2JK\7\37\2\2K[\7\4\2\2LM\7\23\2\2MN\7\37\2\2NO\7\4\2\2O"+
		"P\7\37\2\2P[\7\4\2\2QR\7\23\2\2RS\7\37\2\2S[\7\4\2\2TU\7\24\2\2U[\5\b"+
		"\5\2VW\7\25\2\2WX\7\37\2\2X[\7\4\2\2Y[\7\25\2\2Z)\3\2\2\2Z*\3\2\2\2Z+"+
		"\3\2\2\2Z.\3\2\2\2Z/\3\2\2\2Z\64\3\2\2\2Z9\3\2\2\2Z:\3\2\2\2Z<\3\2\2\2"+
		"ZA\3\2\2\2ZF\3\2\2\2ZI\3\2\2\2ZL\3\2\2\2ZQ\3\2\2\2ZT\3\2\2\2ZV\3\2\2\2"+
		"ZY\3\2\2\2[\7\3\2\2\2\\]\7#\2\2]b\5\4\3\2^_\7\32\2\2_a\5\4\3\2`^\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2f\t\3\2\2"+
		"\2gr\7 \2\2hi\7\26\2\2ij\7\37\2\2js\7\4\2\2kl\7\27\2\2lm\7\37\2\2ms\7"+
		"\4\2\2ns\7\30\2\2op\7\31\2\2pq\7\37\2\2qs\7\4\2\2rh\3\2\2\2rk\3\2\2\2"+
		"rn\3\2\2\2ro\3\2\2\2s\13\3\2\2\2tu\7\34\2\2uv\7\3\2\2vw\7\35\2\2w|\5\16"+
		"\b\2xy\7\37\2\2y{\5\16\b\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\7\36\2\2\u0080\r\3\2\2\2\u0081\u0082\7\4"+
		"\2\2\u0082\17\3\2\2\2\n\23\33 \'Zbr|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}