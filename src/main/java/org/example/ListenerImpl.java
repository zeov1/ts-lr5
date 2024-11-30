package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.antlr.IfElseBaseListener;
import org.example.antlr.IfElseParser;

import java.util.HashMap;
import java.util.Map;

public class ListenerImpl extends IfElseBaseListener {
    private Map<String, Integer> variables;

    public ListenerImpl() {
        variables = new HashMap<>();
    }

    @Override
    public void enterProgram(IfElseParser.ProgramContext ctx) {
        System.out.println("Вошли в программу");
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(IfElseParser.ProgramContext ctx) {
        System.out.println("Вышли из программы");
        super.exitProgram(ctx);
    }

    @Override
    public void enterStatements(IfElseParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(IfElseParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterStatement(IfElseParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(IfElseParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterAssignment(IfElseParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(IfElseParser.AssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        super.exitAssignment(ctx);
    }

    @Override
    public void enterIf_else(IfElseParser.If_elseContext ctx) {
        super.enterIf_else(ctx);
    }

    @Override
    public void exitIf_else(IfElseParser.If_elseContext ctx) {
        super.exitIf_else(ctx);
    }

    @Override
    public void enterCondition(IfElseParser.ConditionContext ctx) {
        super.enterCondition(ctx);
    }

    @Override
    public void exitCondition(IfElseParser.ConditionContext ctx) {
        super.exitCondition(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
