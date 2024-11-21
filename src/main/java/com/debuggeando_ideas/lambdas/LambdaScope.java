package com.debuggeando_ideas.lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LambdaScope {

    public static void main(String[] args) {

        //Num fuera del alcance de la lambda no se puede alterar variable fuera de la expresion lambda
        //la expresion lambda va a ejecutarse en un hilo aparte referencia Atomica puede estar diferentes hilos
        // en una expresion concurrente

        //Moidificar una variable fuera de la expresion lambda pero no es muy comun


        AtomicInteger num = new AtomicInteger(10);

        /**
         *  AtomicReference<Persona> otra forma de hacerlo para cualquier objeto
         */


        IntStream.range(1, 10).forEach(i -> num.set(num.get() + i));

        System.out.println(num.get());

    }


}
