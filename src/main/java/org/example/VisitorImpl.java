package org.example;

import org.example.antlr.IfElseBaseVisitor;
import org.example.antlr.IfElseParser;

public class VisitorImpl extends IfElseBaseVisitor<String> {
    private int block_cnt;

    public VisitorImpl() {
        block_cnt = 0;
    }

    @Override
    public String visitProgram(IfElseParser.ProgramContext ctx) {
        visit(ctx.statements());
        System.out.println("end:\n\tJMP end");
        return null;
    }

    @Override
    public String visitStatements(IfElseParser.StatementsContext ctx) {
        for (IfElseParser.StatementContext sc : ctx.statement())
            visit(sc);
        return null;
    }

    @Override
    public String visitStatement(IfElseParser.StatementContext ctx) {
        if (ctx.assignment() != null)
            visit(ctx.assignment());
        else
            visit(ctx.if_else());
        return null;
    }

    @Override
    public String visitAssignment(IfElseParser.AssignmentContext ctx) {
        visit(ctx.expression());
        String varName = ctx.IDENTIFIER().getText();
        System.out.printf("\tMOV %s, ax\n", varName);
        return null;
    }

    @Override
    public String visitIfElse(IfElseParser.IfElseContext ctx) {
        System.out.printf("; IF-ELSE BLOCK №%s\n", block_cnt);
        visit(ctx.condition());
        visit(ctx.statements(0)); // IF STATEMENTS
        System.out.printf("\tJMP endif%d\nelse%d:\n", block_cnt, block_cnt);
        visit(ctx.statements(1)); // ELSE STATEMENTS
        System.out.printf("endif%d:\n", block_cnt++);
        return null;
    }

    @Override
    public String visitCondition(IfElseParser.ConditionContext ctx) {
        StringBuilder sb = new StringBuilder();
        String expr1 = visit(ctx.operand(0));
        String expr2 = visit(ctx.operand(1));
        sb.append(String.format("\tCMP %s, %s\n", expr1, expr2));
        // ВНИМАНИЕ: происходит инверсия знака сравнения

        String jump_type = "";
        if (ctx.op.getType() == IfElseParser.EQ)
            jump_type = "JNE";
        else if (ctx.op.getType() == IfElseParser.NEQ)
            jump_type = "JE";
        else if (ctx.op.getType() == IfElseParser.GT)
            jump_type = "JLE";
        else if (ctx.op.getType() == IfElseParser.LT)
            jump_type = "JGE";
        else if (ctx.op.getType() == IfElseParser.GE)
            jump_type = "JL";
        else if (ctx.op.getType() == IfElseParser.LE)
            jump_type = "JG";

        sb.append(String.format("\t%s else%d", jump_type, block_cnt));
        System.out.println(sb);
        return null;
    }

    @Override
    public String visitSimpleExplession(IfElseParser.SimpleExplessionContext ctx) {
        String operand = visit(ctx.operand());
        System.out.printf("\tMOV ax, %s\n", operand);
        return null;
    }

    @Override
    public String visitLiteral(IfElseParser.LiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitArray(IfElseParser.ArrayContext ctx) {
        String ID = ctx.IDENTIFIER(0).getText();
        String index = ctx.index.getText();
        return String.format("[%s + %s]", ID, index);
    }

    @Override
    public String visitWrongIfElse(IfElseParser.WrongIfElseContext ctx) {
        System.err.println("ERROR! Missing condition for if-else block:");
        System.err.println(ctx.getText());
        return null;
    }

    @Override
    public String visitWrongArray(IfElseParser.WrongArrayContext ctx) {
        System.err.println("ERROR! Wrong array usage:");
        System.err.println(ctx.getText());
        return null;
    }

    @Override
    public String visitTwoOperandExpression(IfElseParser.TwoOperandExpressionContext ctx) {
        String operation = "";
        int opType = ctx.op.getType();
        if (opType == IfElseParser.AND)
            operation = "AND";
        else if (opType == IfElseParser.OR)
            operation = "OR";
        else if (opType == IfElseParser.ADD)
            operation = "ADD";
        else if (opType == IfElseParser.SUB)
            operation = "SUB";
        else if (opType == IfElseParser.MUL)
            operation = "MUL";
        else if (opType == IfElseParser.DIV)
            operation = "DIV";

        String operand1 = visit(ctx.operand(0));
        String operand2 = visit(ctx.operand(1));
        System.out.printf("\tMOV ax, %s\n", operand1);
        System.out.printf("\t%s ax, %s\n", operation, operand2);
        return null;
    }

    @Override
    public String visitBitwiseNot(IfElseParser.BitwiseNotContext ctx) {
        String operand = visit(ctx.operand());
        System.out.printf("\tMOV ax, %s\n", operand);
        System.out.print("\tNOT ax\n");
        return null;
    }

}
