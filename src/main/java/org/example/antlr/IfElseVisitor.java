// Generated from C:/Projects/IdeaProjects/ts-lr5/grammars/IfElse.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IfElseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IfElseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IfElseParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(IfElseParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfElseParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(IfElseParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfElseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(IfElseParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfElseParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(IfElseParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(IfElseParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WrongIfElse}
	 * labeled alternative in {@link IfElseParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongIfElse(IfElseParser.WrongIfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfElseParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(IfElseParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExplession}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExplession(IfElseParser.SimpleExplessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoOperandExpression}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoOperandExpression(IfElseParser.TwoOperandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link IfElseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNot(IfElseParser.BitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(IfElseParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(IfElseParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WrongArray}
	 * labeled alternative in {@link IfElseParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongArray(IfElseParser.WrongArrayContext ctx);
}