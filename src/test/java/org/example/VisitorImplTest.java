package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.antlr.IfElseLexer;
import org.example.antlr.IfElseParser;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VisitorImplTest {
    @Test
    public void test() throws IOException {
        List<Path> inputFiles = Files.list(Paths.get("src/test/resources/input/")).toList();
        for (int i = 0; i < inputFiles.size(); i++) {
            Path inputFilePath = inputFiles.get(i);
            String outputFilePath = "src/test/resources/output/result" + (i + 1);

            FileOutputStream fos = new FileOutputStream(outputFilePath);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);

            String content = Files.readString(inputFilePath);
            content = content.replace("\r", "");

            CharStream stream = CharStreams.fromString(content);

            IfElseLexer lexer = new IfElseLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);

            IfElseParser parser = new IfElseParser(tokens);
            ParseTree tree = parser.program();

            VisitorImpl visitor = new VisitorImpl();
            visitor.visit(tree);
        }
    }
}