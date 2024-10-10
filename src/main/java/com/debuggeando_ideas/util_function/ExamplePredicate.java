package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {


    static Predicate<Integer> isGreaterThan100 = n -> n > 100;
    static Predicate<Integer> isLess10 = n -> n < 10;
    static Predicate<Integer> between10And100 = isGreaterThan100.or(isLess10);

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 10, 50 , 100, 150, 200));

        numbers.removeIf(between10And100.negate());

        System.out.println("Lista:: " + numbers );
    }


}
