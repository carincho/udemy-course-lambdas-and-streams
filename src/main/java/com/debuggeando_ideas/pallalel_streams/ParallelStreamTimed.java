package com.debuggeando_ideas.pallalel_streams;

import java.util.stream.IntStream;


/**
 *
 * Es mas rapido cuando se maneja mucha informacion
 */
public class ParallelStreamTimed {

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();

        IntStream.rangeClosed(1, 200000000).parallel().reduce(0, Integer::sum);

        Long endTime = System.currentTimeMillis();

        System.out.println("Total time paralelo:: " + (endTime - startTime));
    }
}
