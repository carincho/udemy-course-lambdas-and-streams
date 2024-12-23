package com.debuggeando_ideas.util_function;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleConsumer {

    public static void main(String[] args) {
        Set<Integer>nums = Set.of(1,2,3,4,5);

        List<Integer>squares = new LinkedList<>();

        nums.forEach(n ->  squares.add(n*n));

        System.out.println("Cuadrados:: " + squares);

        Map<Boolean, String> map = Map.of(true, "Esto es verdadero", false, "Esto es Falso");
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
