// Generated from OurLanguage.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, ID=16, WS=17, COMMENT=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'ELSE'", "';'", "'{'", "'<'", "'='", "'IF'", "'}'", "'>'", 
		"':='", "'PROGRAM'", "'('", "')'", "'FOR'", "'RETURN'", "','", "ID", "WS", 
		"COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_paramList = 1, RULE_code = 2, RULE_statement = 3, 
		RULE_condition = 4, RULE_value = 5;
	public static final String[] ruleNames = {
		"program", "paramList", "code", "statement", "condition", "value"
	};

	@Override
	public String getGrammarFileName() { return "OurLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OurLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__5);
			setState(13); match(ID);
			setState(14); match(T__4);
			setState(15); paramList();
			setState(16); match(T__3);
			setState(17); match(T__12);
			setState(18); code();
			setState(19); match(T__8);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OurLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OurLanguageParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21); match(ID);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22); match(T__0);
				setState(23); match(ID);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__2) | (1L << T__1) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); match(T__9);
				setState(34); match(T__4);
				setState(35); condition();
				setState(36); match(T__3);
				setState(37); match(T__12);
				setState(38); code();
				setState(39); match(T__8);
				{
				setState(40); match(T__14);
				setState(41); match(T__12);
				setState(42); code();
				setState(43); match(T__8);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(ID);
				setState(46); match(T__6);
				setState(47); value();
				setState(48); match(T__13);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); match(T__2);
				setState(51); match(T__4);
				setState(52); value();
				setState(53); match(T__3);
				setState(54); match(T__12);
				setState(55); code();
				setState(56); match(T__8);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); match(T__1);
				{
				setState(59); match(T__4);
				setState(60); value();
				setState(61); match(T__3);
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); value();
				setState(66); match(T__10);
				setState(67); value();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); value();
				setState(70); match(T__11);
				setState(71); value();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); value();
				setState(74); match(T__7);
				setState(75); value();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\4\6\4 \n\4\r\4\16\4!\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2"+
		"T\2\16\3\2\2\2\4\27\3\2\2\2\6\37\3\2\2\2\bA\3\2\2\2\nO\3\2\2\2\fQ\3\2"+
		"\2\2\16\17\7\f\2\2\17\20\7\22\2\2\20\21\7\r\2\2\21\22\5\4\3\2\22\23\7"+
		"\16\2\2\23\24\7\5\2\2\24\25\5\6\4\2\25\26\7\t\2\2\26\3\3\2\2\2\27\32\7"+
		"\22\2\2\30\31\7\21\2\2\31\33\7\22\2\2\32\30\3\2\2\2\33\34\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36 \5\b\5\2\37\36\3\2\2\2 !\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"\7\3\2\2\2#$\7\b\2\2$%\7\r\2\2%&\5\n\6\2&\'"+
		"\7\16\2\2\'(\7\5\2\2()\5\6\4\2)*\7\t\2\2*+\7\3\2\2+,\7\5\2\2,-\5\6\4\2"+
		"-.\7\t\2\2.B\3\2\2\2/\60\7\22\2\2\60\61\7\13\2\2\61\62\5\f\7\2\62\63\7"+
		"\4\2\2\63B\3\2\2\2\64\65\7\17\2\2\65\66\7\r\2\2\66\67\5\f\7\2\678\7\16"+
		"\2\289\7\5\2\29:\5\6\4\2:;\7\t\2\2;B\3\2\2\2<=\7\20\2\2=>\7\r\2\2>?\5"+
		"\f\7\2?@\7\16\2\2@B\3\2\2\2A#\3\2\2\2A/\3\2\2\2A\64\3\2\2\2A<\3\2\2\2"+
		"B\t\3\2\2\2CD\5\f\7\2DE\7\7\2\2EF\5\f\7\2FP\3\2\2\2GH\5\f\7\2HI\7\6\2"+
		"\2IJ\5\f\7\2JP\3\2\2\2KL\5\f\7\2LM\7\n\2\2MN\5\f\7\2NP\3\2\2\2OC\3\2\2"+
		"\2OG\3\2\2\2OK\3\2\2\2P\13\3\2\2\2QR\3\2\2\2R\r\3\2\2\2\6\34!AO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}