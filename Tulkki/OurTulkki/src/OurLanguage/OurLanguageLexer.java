// Generated from OurLanguage.g4 by ANTLR 4.7.2
package OurLanguage;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, DOUBLE=21, ID=22, WS=23, COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "INT", "DOUBLE", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'('", "')'", "'{'", "'}'", "','", "'IF'", "'ELSE'", 
			"':='", "';'", "'FOR'", "'RETURN'", "'='", "'<'", "'>'", "'-'", "'+'", 
			"'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT", "DOUBLE", "ID", 
			"WS", "COMMENT"
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


	public OurLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OurLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25m\n\25\3\25\3\25\3\25\7\25"+
		"r\n\25\f\25\16\25u\13\25\5\25w\n\25\3\26\5\26z\n\26\3\26\3\26\3\26\7\26"+
		"\177\n\26\f\26\16\26\u0082\13\26\5\26\u0084\n\26\3\26\3\26\6\26\u0088"+
		"\n\26\r\26\16\26\u0089\3\27\6\27\u008d\n\27\r\27\16\27\u008e\3\27\7\27"+
		"\u0092\n\27\f\27\16\27\u0095\13\27\3\30\6\30\u0098\n\30\r\30\16\30\u0099"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a2\n\31\f\31\16\31\u00a5\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\u00a3\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\b\3\2//\3\2\62;\3\2\63;\3\2c|\4\2C\\c|\5\2\13\f\17\17\""+
		"\"\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2"+
		"\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23M\3\2\2\2\25P\3\2\2"+
		"\2\27R\3\2\2\2\31V\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3\2\2"+
		"\2#e\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)l\3\2\2\2+y\3\2\2\2-\u008c\3\2\2\2/"+
		"\u0097\3\2\2\2\61\u009d\3\2\2\2\63\64\7R\2\2\64\65\7T\2\2\65\66\7Q\2\2"+
		"\66\67\7I\2\2\678\7T\2\289\7C\2\29:\7O\2\2:\4\3\2\2\2;<\7*\2\2<\6\3\2"+
		"\2\2=>\7+\2\2>\b\3\2\2\2?@\7}\2\2@\n\3\2\2\2AB\7\177\2\2B\f\3\2\2\2CD"+
		"\7.\2\2D\16\3\2\2\2EF\7K\2\2FG\7H\2\2G\20\3\2\2\2HI\7G\2\2IJ\7N\2\2JK"+
		"\7U\2\2KL\7G\2\2L\22\3\2\2\2MN\7<\2\2NO\7?\2\2O\24\3\2\2\2PQ\7=\2\2Q\26"+
		"\3\2\2\2RS\7H\2\2ST\7Q\2\2TU\7T\2\2U\30\3\2\2\2VW\7T\2\2WX\7G\2\2XY\7"+
		"V\2\2YZ\7W\2\2Z[\7T\2\2[\\\7P\2\2\\\32\3\2\2\2]^\7?\2\2^\34\3\2\2\2_`"+
		"\7>\2\2`\36\3\2\2\2ab\7@\2\2b \3\2\2\2cd\7/\2\2d\"\3\2\2\2ef\7-\2\2f$"+
		"\3\2\2\2gh\7\61\2\2h&\3\2\2\2ij\7,\2\2j(\3\2\2\2km\t\2\2\2lk\3\2\2\2l"+
		"m\3\2\2\2mv\3\2\2\2nw\t\3\2\2os\t\4\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vo\3\2\2\2w*\3\2\2\2"+
		"xz\t\2\2\2yx\3\2\2\2yz\3\2\2\2z\u0083\3\2\2\2{\u0084\t\3\2\2|\u0080\t"+
		"\4\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0083"+
		"|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\60\2\2\u0086\u0088\t\3\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a,\3\2\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2"+
		"\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094.\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0096\u0098\t\7\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\30\2\2"+
		"\u009c\60\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f\u00a3"+
		"\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00aa\b\31\2\2\u00aa\62\3\2\2\2\16\2lsvy\u0080\u0083\u0089\u008e"+
		"\u0093\u0099\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}