package com.debuggeando_ideas.pallalel_streams;

import java.util.List;

public class ParallelStream {

    //-D java.util.concurrent.ForkJoinPool.common.parallelism=5 (Numero maximo de threads que queremos que utilice)
    //Se configura como argumento
    public static void main(String[] args) {

        List<Integer>numbers = List.of(1,2,3,4,5);

        numbers.parallelStream().forEach(n -> System.out.println(n + " -  " + Thread.currentThread().getName()));

    }
}
