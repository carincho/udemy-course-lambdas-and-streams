package com.debuggeando_ideas.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {
        BiFunction<String, String, String>normalizerFunction = (s1, s2) -> s1.toUpperCase() + "-" + s2.toLowerCase();

        System.out.println("BiFunction:: " + normalizerFunction.apply("hola", "CARINCHO"));

        BinaryOperator<String>normalizer = (s1, s2) -> s1.toUpperCase() + "-" + s2.toLowerCase();

        System.out.println("BinaryOperator:: " + normalizer.apply("hola", "CARINCHO"));

    }
}
