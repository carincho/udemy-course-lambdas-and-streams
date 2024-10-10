package com.debuggeando_ideas.collectors;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduceFunction {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

//        avg(videogames);
//        sum(videogames);
        join(videogames);
    }

    static void avg(Stream<Videogame> stream) {

        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));

        System.out.println("Promedio: " + avg);
    }

    static void sum(Stream<Videogame> stream) {

        IntSummaryStatistics sum = stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));

        System.out.println("Sum: " + sum.getSum());
        System.out.println("Max: " + sum.getMax());
        System.out.println("Min: " + sum.getMin());
        System.out.println("Avg: " + sum.getAverage());
    }


    static  void join(Stream<Videogame> stream) {

        String string = stream
                .map(Videogame::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(string);


    }
}
