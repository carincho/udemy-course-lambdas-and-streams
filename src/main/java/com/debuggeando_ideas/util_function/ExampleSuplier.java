package com.debuggeando_ideas.util_function;


import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

//Lo contrario a consumer
//Suplier provee Objetos no recibe nada
public class ExampleSuplier {

    static Supplier<Integer> random = () -> new Random().nextInt(100);
    static Supplier<MyProduct> productSupplier = () -> new MyProduct(31000, "IPhone 16");

    public static void main(String[] args) {
        System.out.println("Random1: " + random.get());
        System.out.println("Random2: " + random.get());
        System.out.println("Random3: " + random.get());

        System.out.println("My Producto:: " + productSupplier.get());
    }



}

