package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.antlr.IfElseLexer;
import org.example.antlr.IfElseParser;


public class Main {
    public static void main(String[] args) {
        String content = "if (a > b) { c = 5 + a; } else {} c = d[30];";
        CharStream stream = CharStreams.fromString(content);

        IfElseLexer lexer = new IfElseLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        IfElseParser parser = new IfElseParser(tokens);
        ParseTree tree = parser.program();

        System.out.println("Сгенерировано дерево:");
        System.out.println(tree.toStringTree(parser));

//        ParseTreeWalker walker = new ParseTreeWalker();
//        ListenerImpl listener = new ListenerImpl();
//
//        walker.walk(listener, tree);

        VisitorImpl visitor = new VisitorImpl();
        System.out.println("RESULT:");
        visitor.visit(tree);
    }
}