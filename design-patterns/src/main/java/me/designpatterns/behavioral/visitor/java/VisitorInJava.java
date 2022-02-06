package me.designpatterns.behavioral.visitor.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorInJava {

    public static void main(String[] args) throws IOException {
        Path startingDirectory = Path.of("/home/ubuntu/workspace/designPatterns/design-patterns");
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor("Triangle.java", startingDirectory);
        Files.walkFileTree(startingDirectory, searchFileVisitor);
    }
}
