// Generated from C:/Projects/IdeaProjects/ANTLR-tutorial/grammars/IfElse.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IF=8, ELSE=9, 
		IDENTIFIER=10, CONSTANT=11, EQ=12, NEQ=13, GE=14, LE=15, GT=16, LT=17, 
		ASSIGN=18, AND=19, OR=20, NOT=21, ADD=22, SUB=23, MUL=24, DIV=25, WS=26, 
		LINE_COMMENT=27, NEWLINE=28;
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
			null, "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", 
			null, null, "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", "'&'", 
			"'|'", "'~'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IF", "ELSE", "IDENTIFIER", 
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
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfElseVisitor ) return ((IfElseVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_else);
		try {
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
			setState(46);
			operand();
			setState(47);
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SimpleExplessionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				operand();
				}
				break;
			case 2:
				_localctx = new TwoOperandExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				operand();
				setState(52);
				((TwoOperandExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64487424L) != 0)) ) {
					((TwoOperandExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				operand();
				}
				break;
			case 3:
				_localctx = new BitwiseNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(NOT);
				setState(56);
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

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operand);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
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
				setState(60);
				match(IDENTIFIER);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(61);
					match(T__5);
					setState(62);
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
					setState(63);
					match(T__6);
					}
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
		"\u0004\u0001\u001cE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006:\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007A\b\u0007\u0003\u0007C\b\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\f\u0011\u0002\u0000\u0013"+
		"\u0014\u0016\u0019\u0001\u0000\n\u000bB\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000"+
		"\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b\"\u0001\u0000\u0000\u0000"+
		"\n.\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000eB\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000"+
		"\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0015\u0003\u0004"+
		"\u0002\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000"+
		"\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0019\u001c\u0003\u0006\u0003\u0000\u001a\u001c\u0003\b\u0004"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005\n\u0000\u0000"+
		"\u001e\u001f\u0005\u0012\u0000\u0000\u001f \u0003\f\u0006\u0000 !\u0005"+
		"\u0001\u0000\u0000!\u0007\u0001\u0000\u0000\u0000\"#\u0005\b\u0000\u0000"+
		"#$\u0005\u0002\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005\u0003\u0000\u0000"+
		"&\'\u0005\u0004\u0000\u0000\'(\u0003\u0002\u0001\u0000()\u0005\u0005\u0000"+
		"\u0000)*\u0005\t\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0003\u0002\u0001"+
		"\u0000,-\u0005\u0005\u0000\u0000-\t\u0001\u0000\u0000\u0000./\u0003\u000e"+
		"\u0007\u0000/0\u0007\u0000\u0000\u000001\u0003\u000e\u0007\u00001\u000b"+
		"\u0001\u0000\u0000\u00002:\u0003\u000e\u0007\u000034\u0003\u000e\u0007"+
		"\u000045\u0007\u0001\u0000\u000056\u0003\u000e\u0007\u00006:\u0001\u0000"+
		"\u0000\u000078\u0005\u0015\u0000\u00008:\u0003\u000e\u0007\u000092\u0001"+
		"\u0000\u0000\u000093\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":\r\u0001\u0000\u0000\u0000;C\u0007\u0002\u0000\u0000<@\u0005\n\u0000"+
		"\u0000=>\u0005\u0006\u0000\u0000>?\u0007\u0002\u0000\u0000?A\u0005\u0007"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000"+
		"C\u000f\u0001\u0000\u0000\u0000\u0005\u0016\u001b9@B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}