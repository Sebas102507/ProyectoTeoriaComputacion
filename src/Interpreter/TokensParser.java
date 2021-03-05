package Interpreter;// Generated from gramatica.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TokensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, PRINTLN=2, IF=3, ELSE_IF=4, ELSE=5, INT=6, DOUBLE=7, AND=8, OR=9, 
		NOT=10, MAYORQ=11, MENORQ=12, MAYORIQ=13, MENORIQ=14, IGUAL=15, DIF=16, 
		SUM=17, RESTA=18, MULTI=19, DIV=20, ASIGNAR=21, LLAVE_ABIERTA=22, LLAVE_CERRADA=23, 
		PAR_ABIERTA=24, PAR_CERRADA=25, PTO_COMA=26, ID=27, WS=28;
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_operacionAritmetica = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sentence", "declaracion", "asignacion", "operacionAritmetica"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TokensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << DOUBLE) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				sentence();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SentenceContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OperacionAritmeticaContext operacionAritmetica() {
			return getRuleContext(OperacionAritmeticaContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				operacionAritmetica(0);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TokensParser.VAR, 0); }
		public TerminalNode ID() { return getToken(TokensParser.ID, 0); }
		public TerminalNode PTO_COMA() { return getToken(TokensParser.PTO_COMA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(VAR);
			setState(22);
			match(ID);
			setState(23);
			match(PTO_COMA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TokensParser.VAR, 0); }
		public TerminalNode ID() { return getToken(TokensParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(TokensParser.ASIGNAR, 0); }
		public TerminalNode PTO_COMA() { return getToken(TokensParser.PTO_COMA, 0); }
		public TerminalNode INT() { return getToken(TokensParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(TokensParser.DOUBLE, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		int _la;
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(VAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(ID);
				setState(27);
				match(ASIGNAR);
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				match(PTO_COMA);
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

	public static class OperacionAritmeticaContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TokensParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(TokensParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(TokensParser.ID, 0); }
		public List<OperacionAritmeticaContext> operacionAritmetica() {
			return getRuleContexts(OperacionAritmeticaContext.class);
		}
		public OperacionAritmeticaContext operacionAritmetica(int i) {
			return getRuleContext(OperacionAritmeticaContext.class,i);
		}
		public TerminalNode SUM() { return getToken(TokensParser.SUM, 0); }
		public TerminalNode RESTA() { return getToken(TokensParser.RESTA, 0); }
		public TerminalNode MULTI() { return getToken(TokensParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(TokensParser.DIV, 0); }
		public OperacionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).enterOperacionAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TokensListener ) ((TokensListener)listener).exitOperacionAritmetica(this);
		}
	}

	public final OperacionAritmeticaContext operacionAritmetica() throws RecognitionException {
		return operacionAritmetica(0);
	}

	private OperacionAritmeticaContext operacionAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionAritmeticaContext _localctx = new OperacionAritmeticaContext(_ctx, _parentState);
		OperacionAritmeticaContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_operacionAritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionAritmetica);
					setState(35);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(36);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << RESTA) | (1L << MULTI) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(37);
					operacionAritmetica(2);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return operacionAritmetica_sempred((OperacionAritmeticaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacionAritmetica_sempred(OperacionAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3"+
		"\5\3\26\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5!\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\2\3\n\7\2\4\6\b\n\2\5\3\2\b\t\4"+
		"\2\b\t\35\35\3\2\23\26\2-\2\17\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b \3"+
		"\2\2\2\n\"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2"+
		"\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\26\5\6\4\2\23\26\5\b\5\2"+
		"\24\26\5\n\6\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\5\3\2\2\2"+
		"\27\30\7\3\2\2\30\31\7\35\2\2\31\32\7\34\2\2\32\7\3\2\2\2\33!\7\3\2\2"+
		"\34\35\7\35\2\2\35\36\7\27\2\2\36\37\t\2\2\2\37!\7\34\2\2 \33\3\2\2\2"+
		" \34\3\2\2\2!\t\3\2\2\2\"#\b\6\1\2#$\t\3\2\2$*\3\2\2\2%&\f\3\2\2&\'\t"+
		"\4\2\2\')\5\n\6\4(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\13\3\2\2\2"+
		",*\3\2\2\2\6\17\25 *";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}