// Generated from .\Wandlab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WandlabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ARGUMENT=2, STRING=3, POINTER=4, NUMBER=5, ALPHA=6, BETA=7, DELTA=8, 
		ZETA=9, ETA=10, LAMBDA=11, MU=12, XI=13, OMICORN=14, PI=15, SIGMA=16, 
		OMEGA=17, GAMMA=18, TAU=19, PHI=20, CHI=21, PIPE=22, TICK=23, QUOTE=24, 
		ARROW=25, LBRACKET=26, RBRACKET=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ARGUMENT", "STRING", "POINTER", "NUMBER", "ALPHA", "BETA", "DELTA", 
			"ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", "SIGMA", "OMEGA", 
			"GAMMA", "TAU", "PHI", "CHI", "PIPE", "TICK", "QUOTE", "ARROW", "LBRACKET", 
			"RBRACKET", "WS"
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


	public WandlabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wandlab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\5\3"+
		"A\n\3\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\6\5M\n\5\r\5\16\5N\3"+
		"\5\3\5\3\6\6\6T\n\6\r\6\16\6U\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3F\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3"+
		"\2\4\3\2\62;\5\2\13\f\17\17\"\"\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7B\3\2\2\2\t"+
		"L\3\2\2\2\13S\3\2\2\2\rW\3\2\2\2\17]\3\2\2\2\21b\3\2\2\2\23h\3\2\2\2\25"+
		"m\3\2\2\2\27q\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2\2\2\37\u0086\3\2"+
		"\2\2!\u0089\3\2\2\2#\u008f\3\2\2\2%\u0095\3\2\2\2\'\u009b\3\2\2\2)\u009f"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2"+
		"\63\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;<\7"+
		"/\2\2<\4\3\2\2\2=A\5\7\4\2>A\5\t\5\2?A\5\13\6\2@=\3\2\2\2@>\3\2\2\2@?"+
		"\3\2\2\2A\6\3\2\2\2BF\5\61\31\2CE\13\2\2\2DC\3\2\2\2EH\3\2\2\2FG\3\2\2"+
		"\2FD\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\61\31\2J\b\3\2\2\2KM\5\63\32\2LK"+
		"\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\13\6\2Q\n\3\2\2\2"+
		"RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\f\3\2\2\2WX\7C\2\2"+
		"XY\7n\2\2YZ\7r\2\2Z[\7j\2\2[\\\7c\2\2\\\16\3\2\2\2]^\7D\2\2^_\7g\2\2_"+
		"`\7v\2\2`a\7c\2\2a\20\3\2\2\2bc\7F\2\2cd\7g\2\2de\7n\2\2ef\7v\2\2fg\7"+
		"c\2\2g\22\3\2\2\2hi\7\\\2\2ij\7g\2\2jk\7v\2\2kl\7c\2\2l\24\3\2\2\2mn\7"+
		"G\2\2no\7v\2\2op\7c\2\2p\26\3\2\2\2qr\7N\2\2rs\7c\2\2st\7o\2\2tu\7d\2"+
		"\2uv\7f\2\2vw\7c\2\2w\30\3\2\2\2xy\7O\2\2yz\7w\2\2z\32\3\2\2\2{|\7Z\2"+
		"\2|}\7k\2\2}\34\3\2\2\2~\177\7Q\2\2\177\u0080\7o\2\2\u0080\u0081\7k\2"+
		"\2\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7p\2\2\u0085\36\3\2\2\2\u0086\u0087\7R\2\2\u0087\u0088\7k\2\2\u0088 "+
		"\3\2\2\2\u0089\u008a\7U\2\2\u008a\u008b\7k\2\2\u008b\u008c\7i\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\"\3\2\2\2\u008f\u0090\7Q\2\2\u0090"+
		"\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092\u0093\7i\2\2\u0093\u0094\7c\2\2"+
		"\u0094$\3\2\2\2\u0095\u0096\7I\2\2\u0096\u0097\7c\2\2\u0097\u0098\7o\2"+
		"\2\u0098\u0099\7o\2\2\u0099\u009a\7c\2\2\u009a&\3\2\2\2\u009b\u009c\7"+
		"V\2\2\u009c\u009d\7c\2\2\u009d\u009e\7w\2\2\u009e(\3\2\2\2\u009f\u00a0"+
		"\7R\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7E\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7k\2\2\u00a6,\3\2\2\2\u00a7\u00a8"+
		"\7~\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7`\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\7$\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7@\2\2\u00af\64"+
		"\3\2\2\2\u00b0\u00b1\7]\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\35\2\2"+
		"\u00b7:\3\2\2\2\7\2@FNU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}