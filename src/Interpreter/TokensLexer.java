package Interpreter;// Generated from Tokens.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TokensLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, PRINTLN=2, IF=3, ELSE_IF=4, ELSE=5, INT=6, DOUBLE=7, AND=8, OR=9, 
		NOT=10, MAYORQ=11, MENORQ=12, MAYORIQ=13, MENORIQ=14, IGUAL=15, DIF=16, 
		SUM=17, RESTA=18, MULTI=19, DIV=20, ASIGNAR=21, LLAVE_ABIERTA=22, LLAVE_CERRADA=23, 
		PAR_ABIERTA=24, PAR_CERRADA=25, PTO_COMA=26, ID=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR", "PRINTLN", "IF", "ELSE_IF", "ELSE", "INT", "DOUBLE", "AND", "OR", 
			"NOT", "MAYORQ", "MENORQ", "MAYORIQ", "MENORIQ", "IGUAL", "DIF", "SUM", 
			"RESTA", "MULTI", "DIV", "ASIGNAR", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"PAR_ABIERTA", "PAR_CERRADA", "PTO_COMA", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'println'", "'if'", "'else if'", "'else'", null, null, 
			"'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "PRINTLN", "IF", "ELSE_IF", "ELSE", "INT", "DOUBLE", "AND", 
			"OR", "NOT", "MAYORQ", "MENORQ", "MAYORIQ", "MENORIQ", "IGUAL", "DIF", 
			"SUM", "RESTA", "MULTI", "DIV", "ASIGNAR", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"PAR_ABIERTA", "PAR_CERRADA", "PTO_COMA", "ID", "WS"
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


	public TokensLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokens.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\6\7Y\n\7\r\7\16\7Z\3\b\6\b^\n\b\r\b\16\b_\3\b\3"+
		"\b\6\bd\n\b\r\b\16\be\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\7\34\u0096\n\34\f\34\16\34\u0099\13"+
		"\34\3\35\6\35\u009c\n\35\r\35\16\35\u009d\3\35\3\35\2\2\36\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5?\3\2\2\2\7"+
		"G\3\2\2\2\tJ\3\2\2\2\13R\3\2\2\2\rX\3\2\2\2\17]\3\2\2\2\21g\3\2\2\2\23"+
		"j\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2"+
		"\37y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085"+
		"\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2"+
		"\63\u008f\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\29\u009b\3\2\2\2;<\7"+
		"x\2\2<=\7c\2\2=>\7t\2\2>\4\3\2\2\2?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2"+
		"CD\7v\2\2DE\7n\2\2EF\7p\2\2F\6\3\2\2\2GH\7k\2\2HI\7h\2\2I\b\3\2\2\2JK"+
		"\7g\2\2KL\7n\2\2LM\7u\2\2MN\7g\2\2NO\7\"\2\2OP\7k\2\2PQ\7h\2\2Q\n\3\2"+
		"\2\2RS\7g\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\f\3\2\2\2WY\t\2\2\2XW\3\2\2"+
		"\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\16\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\60\2\2bd\t\2\2\2cb\3\2\2\2de"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\20\3\2\2\2gh\7(\2\2hi\7(\2\2i\22\3\2\2\2"+
		"jk\7~\2\2kl\7~\2\2l\24\3\2\2\2mn\7#\2\2n\26\3\2\2\2op\7@\2\2p\30\3\2\2"+
		"\2qr\7>\2\2r\32\3\2\2\2st\7@\2\2tu\7?\2\2u\34\3\2\2\2vw\7>\2\2wx\7?\2"+
		"\2x\36\3\2\2\2yz\7?\2\2z{\7?\2\2{ \3\2\2\2|}\7#\2\2}~\7?\2\2~\"\3\2\2"+
		"\2\177\u0080\7-\2\2\u0080$\3\2\2\2\u0081\u0082\7/\2\2\u0082&\3\2\2\2\u0083"+
		"\u0084\7,\2\2\u0084(\3\2\2\2\u0085\u0086\7\61\2\2\u0086*\3\2\2\2\u0087"+
		"\u0088\7?\2\2\u0088,\3\2\2\2\u0089\u008a\7}\2\2\u008a.\3\2\2\2\u008b\u008c"+
		"\7\177\2\2\u008c\60\3\2\2\2\u008d\u008e\7*\2\2\u008e\62\3\2\2\2\u008f"+
		"\u0090\7+\2\2\u0090\64\3\2\2\2\u0091\u0092\7=\2\2\u0092\66\3\2\2\2\u0093"+
		"\u0097\t\3\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u00988\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\35"+
		"\2\2\u00a0:\3\2\2\2\b\2Z_e\u0097\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}