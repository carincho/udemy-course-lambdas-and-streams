package com.debuggeando_ideas.real_appplications;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/lambdas.txt");

        try(Stream<String>lines = Files.lines(path).onClose(() -> System.out.println("Conexion cerrada"))) {

            lines.forEach(System.out::println);


        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}
