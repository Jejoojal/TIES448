// Generated from OurLanguage.g4 by ANTLR 4.7.2
package OurLanguage;
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, DOUBLE=21, ID=22, WS=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_paramList = 1, RULE_code = 2, RULE_statement = 3, 
		RULE_condition = 4, RULE_value = 5, RULE_simpleValue = 6, RULE_simplestValue = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "paramList", "code", "statement", "condition", "value", "simpleValue", 
			"simplestValue"
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

	@Override
	public String getGrammarFileName() { return "OurLanguage.g4"; }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match(ID);
			setState(18);
			match(T__1);
			setState(19);
			paramList();
			setState(20);
			match(T__2);
			setState(21);
			match(T__3);
			setState(22);
			code();
			setState(23);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(25);
				match(ID);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(26);
					match(T__5);
					setState(27);
					match(ID);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class CodeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				statement();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForstmtContext extends StatementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ForstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfstmtContext extends StatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public IfstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdstmtContext extends StatementContext {
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterIdstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitIdstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitIdstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnstmtContext extends StatementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__6);
				setState(41);
				match(T__1);
				setState(42);
				condition();
				setState(43);
				match(T__2);
				setState(44);
				match(T__3);
				setState(45);
				code();
				setState(46);
				match(T__4);
				{
				setState(47);
				match(T__7);
				setState(48);
				match(T__3);
				setState(49);
				code();
				setState(50);
				match(T__4);
				}
				}
				break;
			case ID:
				_localctx = new IdstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__8);
				setState(54);
				value(0);
				setState(55);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new ForstmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__10);
				setState(58);
				match(T__1);
				setState(59);
				value(0);
				setState(60);
				match(T__2);
				setState(61);
				match(T__3);
				setState(62);
				code();
				setState(63);
				match(T__4);
				}
				break;
			case T__11:
				_localctx = new ReturnstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(T__11);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(66);
					match(T__1);
					setState(67);
					value(0);
					setState(68);
					match(T__2);
					}
				}

				setState(72);
				match(T__9);
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqconContext extends ConditionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EqconContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterEqcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitEqcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitEqcon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreatconContext extends ConditionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public GreatconContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterGreatcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitGreatcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitGreatcon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesconContext extends ConditionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LesconContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterLescon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitLescon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitLescon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new EqconContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				value(0);
				setState(76);
				match(T__12);
				setState(77);
				value(0);
				}
				break;
			case 2:
				_localctx = new LesconContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				value(0);
				setState(80);
				match(T__13);
				setState(81);
				value(0);
				}
				break;
			case 3:
				_localctx = new GreatconContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				value(0);
				setState(84);
				match(T__14);
				setState(85);
				value(0);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ValueContext {
		public Token op;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AddContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoarithContext extends ValueContext {
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public NoarithContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterNoarith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitNoarith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitNoarith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NoarithContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(90);
			simpleValue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddContext(new ValueContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(92);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93);
					((AddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
						((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(94);
					value(2);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SimpleValueContext extends ParserRuleContext {
		public SimpleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleValue; }
	 
		public SimpleValueContext() { }
		public void copyFrom(SimpleValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenContext extends SimpleValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParenContext(SimpleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends SimpleValueContext {
		public SimplestValueContext simplestValue() {
			return getRuleContext(SimplestValueContext.class,0);
		}
		public ConstContext(SimpleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends SimpleValueContext {
		public Token op;
		public List<SimpleValueContext> simpleValue() {
			return getRuleContexts(SimpleValueContext.class);
		}
		public SimpleValueContext simpleValue(int i) {
			return getRuleContext(SimpleValueContext.class,i);
		}
		public MulContext(SimpleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleValueContext simpleValue() throws RecognitionException {
		return simpleValue(0);
	}

	private SimpleValueContext simpleValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleValueContext _localctx = new SimpleValueContext(_ctx, _parentState);
		SimpleValueContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_simpleValue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				match(T__1);
				setState(102);
				value(0);
				setState(103);
				match(T__2);
				}
				break;
			case INT:
			case DOUBLE:
			case ID:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				simplestValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulContext(new SimpleValueContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_simpleValue);
					setState(108);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(109);
					((MulContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
						((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					simpleValue(4);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class SimplestValueContext extends ParserRuleContext {
		public SimplestValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplestValue; }
	 
		public SimplestValueContext() { }
		public void copyFrom(SimplestValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InttContext extends SimplestValueContext {
		public TerminalNode INT() { return getToken(OurLanguageParser.INT, 0); }
		public InttContext(SimplestValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterIntt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitIntt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitIntt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubletContext extends SimplestValueContext {
		public TerminalNode DOUBLE() { return getToken(OurLanguageParser.DOUBLE, 0); }
		public DoubletContext(SimplestValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterDoublet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitDoublet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitDoublet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdtContext extends SimplestValueContext {
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public IdtContext(SimplestValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterIdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitIdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurLanguageVisitor ) return ((OurLanguageVisitor<? extends T>)visitor).visitIdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplestValueContext simplestValue() throws RecognitionException {
		SimplestValueContext _localctx = new SimplestValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simplestValue);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new InttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubletContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(DOUBLE);
				}
				break;
			case ID:
				_localctx = new IdtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return value_sempred((ValueContext)_localctx, predIndex);
		case 6:
			return simpleValue_sempred((SimpleValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleValue_sempred(SimpleValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\5\3$\n\3\3\4\6"+
		"\4\'\n\4\r\4\16\4(\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5I\n\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6Z\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t\3\t\5"+
		"\tz\n\t\3\t\2\4\f\16\n\2\4\6\b\n\f\16\20\2\4\3\2\22\23\3\2\24\25\2\u0081"+
		"\2\22\3\2\2\2\4#\3\2\2\2\6&\3\2\2\2\bK\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16"+
		"l\3\2\2\2\20y\3\2\2\2\22\23\7\3\2\2\23\24\7\30\2\2\24\25\7\4\2\2\25\26"+
		"\5\4\3\2\26\27\7\5\2\2\27\30\7\6\2\2\30\31\5\6\4\2\31\32\7\7\2\2\32\3"+
		"\3\2\2\2\33 \7\30\2\2\34\35\7\b\2\2\35\37\7\30\2\2\36\34\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3\2\2\2#\33\3\2\2\2#$\3\2"+
		"\2\2$\5\3\2\2\2%\'\5\b\5\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7"+
		"\3\2\2\2*+\7\t\2\2+,\7\4\2\2,-\5\n\6\2-.\7\5\2\2./\7\6\2\2/\60\5\6\4\2"+
		"\60\61\7\7\2\2\61\62\7\n\2\2\62\63\7\6\2\2\63\64\5\6\4\2\64\65\7\7\2\2"+
		"\65L\3\2\2\2\66\67\7\30\2\2\678\7\13\2\289\5\f\7\29:\7\f\2\2:L\3\2\2\2"+
		";<\7\r\2\2<=\7\4\2\2=>\5\f\7\2>?\7\5\2\2?@\7\6\2\2@A\5\6\4\2AB\7\7\2\2"+
		"BL\3\2\2\2CH\7\16\2\2DE\7\4\2\2EF\5\f\7\2FG\7\5\2\2GI\3\2\2\2HD\3\2\2"+
		"\2HI\3\2\2\2IJ\3\2\2\2JL\7\f\2\2K*\3\2\2\2K\66\3\2\2\2K;\3\2\2\2KC\3\2"+
		"\2\2L\t\3\2\2\2MN\5\f\7\2NO\7\17\2\2OP\5\f\7\2PZ\3\2\2\2QR\5\f\7\2RS\7"+
		"\20\2\2ST\5\f\7\2TZ\3\2\2\2UV\5\f\7\2VW\7\21\2\2WX\5\f\7\2XZ\3\2\2\2Y"+
		"M\3\2\2\2YQ\3\2\2\2YU\3\2\2\2Z\13\3\2\2\2[\\\b\7\1\2\\]\5\16\b\2]c\3\2"+
		"\2\2^_\f\3\2\2_`\t\2\2\2`b\5\f\7\4a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2d\r\3\2\2\2ec\3\2\2\2fg\b\b\1\2gh\7\4\2\2hi\5\f\7\2ij\7\5\2\2jm\3"+
		"\2\2\2km\5\20\t\2lf\3\2\2\2lk\3\2\2\2ms\3\2\2\2no\f\5\2\2op\t\3\2\2pr"+
		"\5\16\b\6qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2"+
		"\2vz\7\26\2\2wz\7\27\2\2xz\7\30\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\21"+
		"\3\2\2\2\f #(HKYclsy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}