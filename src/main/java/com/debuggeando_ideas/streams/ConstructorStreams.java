package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConstructorStreams {

    public static void main(String[] args) {

        Stream<Videogame>myStream = Database.videogames.stream();

        myStream.forEach(System.out::println);

        System.out.println("---------");
        System.out.println("Arreglo directo");
        Integer[]myArray = {1,2,3,4,5,6,7,8,9};

        Stream<Integer>integerStream = Arrays.stream(myArray);

        integerStream.forEach(System.out::println);

        System.out.println("---------");
        System.out.println("Crear Stream forma arbitraria");

        Stream.of("Por que","la","vida","es","asi?").forEach(System.out::println);

        System.out.println("---------");
        System.out.println("Crear Stream numerico");

        DoubleStream myDoubleStream = DoubleStream.of(100.0, 200.1, 300.7,400.8);

        myDoubleStream.forEach(System.out::println);









    }
}
