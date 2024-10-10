package com.debuggeando_ideas.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;


/*
    La salida es Igual que el retorno entonces se puede usar UnaryOperator en lugar de Function
    hay Interfaces mas especificas para operar con primitivos.
 */
public class ExampleUnaryOperator {

    static Function<String, String>funToupper = String::toUpperCase;
    static UnaryOperator<String>unaryToUpper = String::toUpperCase;
    static UnaryOperator<Integer>int1 = n -> n*n;
    static IntUnaryOperator int2 = n -> n*n;

    public static void main(String[] args) {

        String arg = "lambda";

        System.out.println("Mayuscula:: " + funToupper.apply(arg));
        System.out.println("Mayuscula con UnaryOperator:: " + funToupper.apply(arg));
        System.out.println("Cuadrado con UnaryOperator:: " + int1.apply(3));
        System.out.println("Cuadrado con IntUnaryOperator:: " + int2.applyAsInt(5));

    }
}
