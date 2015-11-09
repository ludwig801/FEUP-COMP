// Generated from C:/Users/Aleister/IdeaProjects/FEUP-COMP/src/LexerParserRules\JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMELIT=1, GROUPLIT=2, GROUPSLIT=3, NODELIT=4, LINKLIT=5, SOURCELIT=6, 
		TARGETLIT=7, VALUELIT=8, INT=9, DOUBLE=10, STRING=11, NAME=12, OPBR=13, 
		CLBR=14, OPSQBR=15, CLSQBR=16, COMMA=17, COLON=18, QUOTATION=19, EQUAL=20, 
		WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAMELIT", "GROUPLIT", "GROUPSLIT", "NODELIT", "LINKLIT", "SOURCELIT", 
		"TARGETLIT", "VALUELIT", "INT", "DOUBLE", "STRING", "NAME", "OPBR", "CLBR", 
		"OPSQBR", "CLSQBR", "COMMA", "COLON", "QUOTATION", "EQUAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'name'", "'group'", "'groups'", "'nodes'", "'links'", "'source'", 
		"'target'", "'value'", null, null, null, null, "'{'", "'}'", "'['", "']'", 
		"','", "':'", "'\"'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMELIT", "GROUPLIT", "GROUPSLIT", "NODELIT", "LINKLIT", "SOURCELIT", 
		"TARGETLIT", "VALUELIT", "INT", "DOUBLE", "STRING", "NAME", "OPBR", "CLBR", 
		"OPSQBR", "CLSQBR", "COMMA", "COLON", "QUOTATION", "EQUAL", "WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\na\n\n\r\n\16\nb\3\13\3\13"+
		"\3\13\3\13\3\f\6\fj\n\f\r\f\16\fk\3\r\6\ro\n\r\r\r\16\rp\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\6\26\u0084\n\26\r\26\16\26\u0085\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\6\3\2\62;\3\2c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u008c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\62\3\2"+
		"\2\2\78\3\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rK\3\2\2\2\17R\3\2\2\2\21Y\3\2"+
		"\2\2\23`\3\2\2\2\25d\3\2\2\2\27i\3\2\2\2\31n\3\2\2\2\33r\3\2\2\2\35t\3"+
		"\2\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0080\3\2"+
		"\2\2+\u0083\3\2\2\2-.\7p\2\2./\7c\2\2/\60\7o\2\2\60\61\7g\2\2\61\4\3\2"+
		"\2\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7q\2\2\65\66\7w\2\2\66\67\7r\2\2"+
		"\67\6\3\2\2\289\7i\2\29:\7t\2\2:;\7q\2\2;<\7w\2\2<=\7r\2\2=>\7u\2\2>\b"+
		"\3\2\2\2?@\7p\2\2@A\7q\2\2AB\7f\2\2BC\7g\2\2CD\7u\2\2D\n\3\2\2\2EF\7n"+
		"\2\2FG\7k\2\2GH\7p\2\2HI\7m\2\2IJ\7u\2\2J\f\3\2\2\2KL\7u\2\2LM\7q\2\2"+
		"MN\7w\2\2NO\7t\2\2OP\7e\2\2PQ\7g\2\2Q\16\3\2\2\2RS\7v\2\2ST\7c\2\2TU\7"+
		"t\2\2UV\7i\2\2VW\7g\2\2WX\7v\2\2X\20\3\2\2\2YZ\7x\2\2Z[\7c\2\2[\\\7n\2"+
		"\2\\]\7w\2\2]^\7g\2\2^\22\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2c\24\3\2\2\2de\5\23\n\2ef\7\60\2\2fg\5\23\n\2g\26\3\2\2"+
		"\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\30\3\2\2\2mo\t\4"+
		"\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\32\3\2\2\2rs\7}\2\2s\34"+
		"\3\2\2\2tu\7\177\2\2u\36\3\2\2\2vw\7]\2\2w \3\2\2\2xy\7_\2\2y\"\3\2\2"+
		"\2z{\7.\2\2{$\3\2\2\2|}\7<\2\2}&\3\2\2\2~\177\7$\2\2\177(\3\2\2\2\u0080"+
		"\u0081\7?\2\2\u0081*\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\26\2\2\u0088,\3\2\2\2\7\2bkp\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}