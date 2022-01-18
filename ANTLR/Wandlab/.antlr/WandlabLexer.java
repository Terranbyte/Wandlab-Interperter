// Generated from c:\Users\fredrik.nikielhard\source\repos\Wandlab\Wandlab-Interperter\ANTLR\Wandlab\Wandlab.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARGUMENT", "STRING", "POINTER", "NUMBER", "COMMENT", "ALPHA", "BETA", 
			"DELTA", "ZETA", "ETA", "LAMBDA", "MU", "XI", "OMICORN", "PI", "SIGMA", 
			"OMEGA", "GAMMA", "TAU", "PHI", "CHI", "PREPROCESSNAME", "PREPROCESSARG", 
			"DASH", "SLASH", "POUND", "COLON", "SEMICOLON", "PIPE", "TICK", "QUOTE", 
			"ARROW", "LBRACKET", "RBRACKET", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\7\3Q\n\3\f\3\16\3"+
		"T\13\3\3\3\3\3\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\3\5\6\5`\n\5\r\5\16\5a\3"+
		"\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\6\27\u00c0\n\27\r\27\16\27\u00c1\3\30\3\30\5\30\u00c6\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\4Rg\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\3\2\62;\4"+
		"\2C\\aa\5\2\13\f\17\17\"\"\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3L\3\2\2\2\5N\3\2\2\2\7X\3\2\2\2\t"+
		"_\3\2\2\2\13c\3\2\2\2\rn\3\2\2\2\17t\3\2\2\2\21y\3\2\2\2\23\177\3\2\2"+
		"\2\25\u0084\3\2\2\2\27\u0088\3\2\2\2\31\u008f\3\2\2\2\33\u0092\3\2\2\2"+
		"\35\u0095\3\2\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a6\3\2\2\2%\u00ac"+
		"\3\2\2\2\'\u00b2\3\2\2\2)\u00b6\3\2\2\2+\u00ba\3\2\2\2-\u00bf\3\2\2\2"+
		"/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67"+
		"\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2"+
		"\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2IM\5\5"+
		"\3\2JM\5\7\4\2KM\5\t\5\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\4\3\2\2\2NR\5"+
		"? \2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3"+
		"\2\2\2UV\5? \2V\6\3\2\2\2WY\5A!\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\\\3\2\2\2\\]\5\t\5\2]\b\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2b\n\3\2\2\2cg\5\63\32\2df\13\2\2\2ed\3\2\2\2fi\3\2\2"+
		"\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\63\32\2kl\3\2\2\2lm\b\6"+
		"\2\2m\f\3\2\2\2no\7C\2\2op\7n\2\2pq\7r\2\2qr\7j\2\2rs\7c\2\2s\16\3\2\2"+
		"\2tu\7D\2\2uv\7g\2\2vw\7v\2\2wx\7c\2\2x\20\3\2\2\2yz\7F\2\2z{\7g\2\2{"+
		"|\7n\2\2|}\7v\2\2}~\7c\2\2~\22\3\2\2\2\177\u0080\7\\\2\2\u0080\u0081\7"+
		"g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u0086\7v\2\2\u0086\u0087\7c\2\2\u0087\26\3\2\2\2\u0088\u0089"+
		"\7N\2\2\u0089\u008a\7c\2\2\u008a\u008b\7o\2\2\u008b\u008c\7d\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7c\2\2\u008e\30\3\2\2\2\u008f\u0090\7O\2\2\u0090"+
		"\u0091\7w\2\2\u0091\32\3\2\2\2\u0092\u0093\7Z\2\2\u0093\u0094\7k\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7o\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c\7p\2\2"+
		"\u009c\36\3\2\2\2\u009d\u009e\7R\2\2\u009e\u009f\7k\2\2\u009f \3\2\2\2"+
		"\u00a0\u00a1\7U\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4"+
		"\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"$\3\2\2\2\u00ac\u00ad\7I\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7o\2\2\u00af"+
		"\u00b0\7o\2\2\u00b0\u00b1\7c\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7V\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7w\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7R\2\2\u00b7"+
		"\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7E\2\2\u00bb"+
		"\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd,\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2.\3\2\2\2\u00c3\u00c6\5\5\3\2\u00c4\u00c6\5\t\5\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8"+
		"\62\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7%\2\2\u00cc"+
		"\66\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0"+
		":\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7`\2\2\u00d4>"+
		"\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9B\3\2\2\2\u00da\u00db\7]\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7"+
		"_\2\2\u00ddF\3\2\2\2\u00de\u00df\t\4\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\b$\2\2\u00e1H\3\2\2\2\n\2LRZag\u00c1\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}