// Generated from C:/Projects/IdeaProjects/ts-lr5/grammars/IfElse.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfElseParser}.
 */
public interface IfElseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfElseParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IfElseParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IfElseParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(IfElseParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(IfElseParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IfElseParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IfElseParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IfElseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IfElseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(IfElseParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(IfElseParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WrongIfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterWrongIfElse(IfElseParser.WrongIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WrongIfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitWrongIfElse(IfElseParser.WrongIfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(IfElseParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(IfElseParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExplession}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExplession(IfElseParser.SimpleExplessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExplession}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExplession(IfElseParser.SimpleExplessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoOperandExpression}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTwoOperandExpression(IfElseParser.TwoOperandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoOperandExpression}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTwoOperandExpression(IfElseParser.TwoOperandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNot(IfElseParser.BitwiseNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNot(IfElseParser.BitwiseNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(IfElseParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(IfElseParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArray(IfElseParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArray(IfElseParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WrongArray}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterWrongArray(IfElseParser.WrongArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WrongArray}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitWrongArray(IfElseParser.WrongArrayContext ctx);
}