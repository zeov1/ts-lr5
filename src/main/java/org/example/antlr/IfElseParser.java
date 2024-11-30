// Generated from C:/Projects/IdeaProjects/ts-lr5/grammars/IfElse.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IfElseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IF=9, 
		ELSE=10, IDENTIFIER=11, CONSTANT=12, EQ=13, NEQ=14, GE=15, LE=16, GT=17, 
		LT=18, ASSIGN=19, AND=20, OR=21, NOT=22, ADD=23, SUB=24, MUL=25, DIV=26, 
		WS=27, LINE_COMMENT=28, NEWLINE=29;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_if_else = 4, RULE_condition = 5, RULE_expression = 6, RULE_operand = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "assignment", "if_else", "condition", 
			"expression", "operand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'[]'", "'if'", 
			"'else'", null, null, "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", 
			"'&'", "'|'", "'~'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "IDENTIFIER", 
			"CONSTANT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "ASSIGN", "AND", "OR", 
			"NOT", "ADD", "SUB", "MUL", "DIV", "WS", "LINE_COMMENT", "NEWLINE"
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
	public String getGrammarFileName() { return "IfElse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IfElseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IfElseParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitProgram(this);
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
			statements();
			setState(17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENTIFIER) {
				{
				{
				setState(19);
				statement();
				}
				}
				setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				if_else();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IfElseParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(IfElseParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IDENTIFIER);
			setState(30);
			match(ASSIGN);
			setState(31);
			expression();
			setState(32);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_elseContext extends ParserRuleContext {
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
	 
		public If_elseContext() { }
		public void copyFrom(If_elseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends If_elseContext {
		public TerminalNode IF() { return getToken(IfElseParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(IfElseParser.ELSE, 0); }
		public IfElseContext(If_elseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WrongIfElseContext extends If_elseContext {
		public TerminalNode IF() { return getToken(IfElseParser.IF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(IfElseParser.ELSE, 0); }
		public WrongIfElseContext(If_elseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterWrongIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitWrongIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitWrongIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_else);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(IF);
				setState(35);
				match(T__1);
				setState(36);
				condition();
				setState(37);
				match(T__2);
				setState(38);
				match(T__3);
				setState(39);
				statements();
				setState(40);
				match(T__4);
				setState(41);
				match(ELSE);
				setState(42);
				match(T__3);
				setState(43);
				statements();
				setState(44);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new WrongIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(IF);
				setState(47);
				match(T__3);
				setState(48);
				statements();
				setState(49);
				match(T__4);
				setState(50);
				match(ELSE);
				setState(51);
				match(T__3);
				setState(52);
				statements();
				setState(53);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode EQ() { return getToken(IfElseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(IfElseParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(IfElseParser.GT, 0); }
		public TerminalNode LT() { return getToken(IfElseParser.LT, 0); }
		public TerminalNode GE() { return getToken(IfElseParser.GE, 0); }
		public TerminalNode LE() { return getToken(IfElseParser.LE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			operand();
			setState(58);
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			operand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoOperandExpressionContext extends ExpressionContext {
		public Token op;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode AND() { return getToken(IfElseParser.AND, 0); }
		public TerminalNode OR() { return getToken(IfElseParser.OR, 0); }
		public TerminalNode ADD() { return getToken(IfElseParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(IfElseParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(IfElseParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(IfElseParser.DIV, 0); }
		public TwoOperandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterTwoOperandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitTwoOperandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitTwoOperandExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExplessionContext extends ExpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public SimpleExplessionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterSimpleExplession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitSimpleExplession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitSimpleExplession(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(IfElseParser.NOT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public BitwiseNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterBitwiseNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitBitwiseNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitBitwiseNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SimpleExplessionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				operand();
				}
				break;
			case 2:
				_localctx = new TwoOperandExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				operand();
				setState(63);
				((TwoOperandExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128974848L) != 0)) ) {
					((TwoOperandExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				operand();
				}
				break;
			case 3:
				_localctx = new BitwiseNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(NOT);
				setState(67);
				operand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends OperandContext {
		public Token index;
		public List<TerminalNode> IDENTIFIER() { return getTokens(IfElseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IfElseParser.IDENTIFIER, i);
		}
		public TerminalNode CONSTANT() { return getToken(IfElseParser.CONSTANT, 0); }
		public ArrayContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends OperandContext {
		public TerminalNode CONSTANT() { return getToken(IfElseParser.CONSTANT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IfElseParser.IDENTIFIER, 0); }
		public LiteralContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WrongArrayContext extends OperandContext {
		public Token index;
		public List<TerminalNode> IDENTIFIER() { return getTokens(IfElseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IfElseParser.IDENTIFIER, i);
		}
		public TerminalNode CONSTANT() { return getToken(IfElseParser.CONSTANT, 0); }
		public WrongArrayContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterWrongArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitWrongArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitWrongArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operand);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==CONSTANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(IDENTIFIER);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(72);
					match(T__5);
					setState(73);
					((ArrayContext)_localctx).index = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==CONSTANT) ) {
						((ArrayContext)_localctx).index = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(74);
					match(T__6);
					}
				}

				}
				break;
			case 3:
				_localctx = new WrongArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(77);
					match(IDENTIFIER);
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER || _la==CONSTANT) {
						{
						setState(78);
						((WrongArrayContext)_localctx).index = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==CONSTANT) ) {
							((WrongArrayContext)_localctx).index = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						match(T__6);
						}
					}

					}
					break;
				case 2:
					{
					setState(82);
					match(IDENTIFIER);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(83);
						match(T__5);
						setState(84);
						((WrongArrayContext)_localctx).index = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==CONSTANT) ) {
							((WrongArrayContext)_localctx).index = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(87);
					match(IDENTIFIER);
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(88);
						match(T__7);
						}
					}

					}
					break;
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006E\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007L\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Q\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007Z\b\u0007\u0003\u0007\\\b\u0007\u0003\u0007^\b\u0007"+
		"\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003"+
		"\u0001\u0000\r\u0012\u0002\u0000\u0014\u0015\u0017\u001a\u0001\u0000\u000b"+
		"\fd\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000\u0000"+
		"\u0000\b7\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\fD\u0001"+
		"\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002"+
		"\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001c\u0003\u0006"+
		"\u0003\u0000\u001a\u001c\u0003\b\u0004\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0005\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u000b\u0000\u0000\u001e\u001f\u0005\u0013\u0000"+
		"\u0000\u001f \u0003\f\u0006\u0000 !\u0005\u0001\u0000\u0000!\u0007\u0001"+
		"\u0000\u0000\u0000\"#\u0005\t\u0000\u0000#$\u0005\u0002\u0000\u0000$%"+
		"\u0003\n\u0005\u0000%&\u0005\u0003\u0000\u0000&\'\u0005\u0004\u0000\u0000"+
		"\'(\u0003\u0002\u0001\u0000()\u0005\u0005\u0000\u0000)*\u0005\n\u0000"+
		"\u0000*+\u0005\u0004\u0000\u0000+,\u0003\u0002\u0001\u0000,-\u0005\u0005"+
		"\u0000\u0000-8\u0001\u0000\u0000\u0000./\u0005\t\u0000\u0000/0\u0005\u0004"+
		"\u0000\u000001\u0003\u0002\u0001\u000012\u0005\u0005\u0000\u000023\u0005"+
		"\n\u0000\u000034\u0005\u0004\u0000\u000045\u0003\u0002\u0001\u000056\u0005"+
		"\u0005\u0000\u000068\u0001\u0000\u0000\u00007\"\u0001\u0000\u0000\u0000"+
		"7.\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000\u00009:\u0003\u000e\u0007"+
		"\u0000:;\u0007\u0000\u0000\u0000;<\u0003\u000e\u0007\u0000<\u000b\u0001"+
		"\u0000\u0000\u0000=E\u0003\u000e\u0007\u0000>?\u0003\u000e\u0007\u0000"+
		"?@\u0007\u0001\u0000\u0000@A\u0003\u000e\u0007\u0000AE\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0016\u0000\u0000CE\u0003\u000e\u0007\u0000D=\u0001\u0000"+
		"\u0000\u0000D>\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000E\r\u0001"+
		"\u0000\u0000\u0000F^\u0007\u0002\u0000\u0000GK\u0005\u000b\u0000\u0000"+
		"HI\u0005\u0006\u0000\u0000IJ\u0007\u0002\u0000\u0000JL\u0005\u0007\u0000"+
		"\u0000KH\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L^\u0001\u0000"+
		"\u0000\u0000MP\u0005\u000b\u0000\u0000NO\u0007\u0002\u0000\u0000OQ\u0005"+
		"\u0007\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\\\u0001\u0000\u0000\u0000RU\u0005\u000b\u0000\u0000ST\u0005\u0006\u0000"+
		"\u0000TV\u0007\u0002\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\\\u0001\u0000\u0000\u0000WY\u0005\u000b\u0000\u0000XZ\u0005"+
		"\b\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\"+
		"\u0001\u0000\u0000\u0000[M\u0001\u0000\u0000\u0000[R\u0001\u0000\u0000"+
		"\u0000[W\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]F\u0001\u0000"+
		"\u0000\u0000]G\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000\n\u0016\u001b7DKPUY[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}