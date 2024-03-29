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
		PREPROCESSNAME=1, ARGUMENT=2, STRING=3, POINTER=4, NUMBER=5, COMMENT=6, 
		ALPHA=7, BETA=8, DELTA=9, ZETA=10, ETA=11, LAMBDA=12, MU=13, XI=14, OMICRON=15, 
		PI=16, SIGMA=17, OMEGA=18, GAMMA=19, TAU=20, PHI=21, CHI=22, DASH=23, 
		SLASH=24, POUND=25, COLON=26, SEMICOLON=27, PIPE=28, TICK=29, QUOTE=30, 
		ARROW=31, LBRACKET=32, RBRACKET=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PREPROCESSNAME", "ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", 
			"ALPHA", "BETA", "DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICRON", 
			"PI", "SIGMA", "OMEGA", "GAMMA", "TAU", "PHI", "CHI", "DASH", "SLASH", 
			"POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", "ARROW", "LBRACKET", 
			"RBRACKET", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'Alpha'", "'Beta'", "'Delta'", 
			"'Zeta'", "'Eta'", "'Lambda'", "'Mu'", "'Xi'", "'Omicron'", "'Pi'", "'Sigma'", 
			"'Omega'", "'Gamma'", "'Tau'", "'Phi'", "'Chi'", "'-'", "'/'", "'#'", 
			"':'", "';'", "'|'", "'^'", "'\"'", "'->'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PREPROCESSNAME", "ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", 
			"ALPHA", "BETA", "DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICRON", 
			"PI", "SIGMA", "OMEGA", "GAMMA", "TAU", "PHI", "CHI", "DASH", "SLASH", 
			"POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", "ARROW", "LBRACKET", 
			"RBRACKET", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2I\n\2\r\2\16\2J\3\3\3\3\3\3\5\3P\n\3\3\4\3\4"+
		"\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\6\5\\\n\5\r\5\16\5]\3\5\3\5\3\6\6"+
		"\6c\n\6\r\6\16\6d\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\4Uj"+
		"\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$\3\2\5\4\2C\\aa\3\2\62;\5\2\13\f\17\17\"\"\2\u00e2\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3H\3\2\2\2\5"+
		"O\3\2\2\2\7Q\3\2\2\2\t[\3\2\2\2\13b\3\2\2\2\rf\3\2\2\2\17q\3\2\2\2\21"+
		"w\3\2\2\2\23|\3\2\2\2\25\u0082\3\2\2\2\27\u0087\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3\2\2\2!\u00a0\3\2\2\2#"+
		"\u00a3\3\2\2\2%\u00a9\3\2\2\2\'\u00af\3\2\2\2)\u00b5\3\2\2\2+\u00b9\3"+
		"\2\2\2-\u00bd\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5\3\2\2\2"+
		"\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf"+
		"\3\2\2\2?\u00d1\3\2\2\2A\u00d4\3\2\2\2C\u00d6\3\2\2\2E\u00d8\3\2\2\2G"+
		"I\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\4\3\2\2\2LP\5\7\4\2"+
		"MP\5\t\5\2NP\5\13\6\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\6\3\2\2\2QU\5=\37"+
		"\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2"+
		"\2\2XY\5=\37\2Y\b\3\2\2\2Z\\\5? \2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^_\3\2\2\2_`\5\13\6\2`\n\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2e\f\3\2\2\2fj\5\61\31\2gi\13\2\2\2hg\3\2\2\2il\3\2"+
		"\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\5\61\31\2no\3\2\2\2op\b"+
		"\7\2\2p\16\3\2\2\2qr\7C\2\2rs\7n\2\2st\7r\2\2tu\7j\2\2uv\7c\2\2v\20\3"+
		"\2\2\2wx\7D\2\2xy\7g\2\2yz\7v\2\2z{\7c\2\2{\22\3\2\2\2|}\7F\2\2}~\7g\2"+
		"\2~\177\7n\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\24\3\2\2\2\u0082"+
		"\u0083\7\\\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7c\2"+
		"\2\u0086\26\3\2\2\2\u0087\u0088\7G\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7c\2\2\u008a\30\3\2\2\2\u008b\u008c\7N\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7o\2\2\u008e\u008f\7d\2\2\u008f\u0090\7f\2\2\u0090\u0091\7c\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\7O\2\2\u0093\u0094\7w\2\2\u0094\34\3\2\2\2\u0095"+
		"\u0096\7Z\2\2\u0096\u0097\7k\2\2\u0097\36\3\2\2\2\u0098\u0099\7Q\2\2\u0099"+
		"\u009a\7o\2\2\u009a\u009b\7k\2\2\u009b\u009c\7e\2\2\u009c\u009d\7t\2\2"+
		"\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f \3\2\2\2\u00a0\u00a1\7R\2"+
		"\2\u00a1\u00a2\7k\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7"+
		"k\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8$"+
		"\3\2\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7i\2\2\u00ad\u00ae\7c\2\2\u00ae&\3\2\2\2\u00af\u00b0\7I\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4(\3\2\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7w\2"+
		"\2\u00b8*\3\2\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7"+
		"k\2\2\u00bc,\3\2\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2\60\3\2\2\2\u00c3\u00c4"+
		"\7\61\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6\64\3\2\2\2\u00c7\u00c8"+
		"\7<\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca8\3\2\2\2\u00cb\u00cc"+
		"\7~\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7`\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7"+
		"$\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\7@\2\2\u00d3@\3\2"+
		"\2\2\u00d4\u00d5\7]\2\2\u00d5B\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7D\3\2\2"+
		"\2\u00d8\u00d9\t\4\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b#\2\2\u00dbF\3"+
		"\2\2\2\t\2JOU]dj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}