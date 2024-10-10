package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction {


    static Function<Integer, Integer> multiplica = n -> n *10;
    static Function<Integer, Integer> sumar = n -> n + 10;
    static Function<Integer, Integer>andThenMultiply = multiplica.andThen(sumar) ;//Concatena
    static Function<Integer, Integer>composeMultiply = multiplica.compose(sumar) ;//Combina funciones


    public static void main(String[] args) {

        System.out.println("Multiplicar: " + multiplica.apply(5));
        System.out.println("Sumar: " + sumar.apply(5));
        System.out.println("Andthen: " + andThenMultiply.apply(5));
        System.out.println("Compose: " + composeMultiply.apply(5));
    }
}
