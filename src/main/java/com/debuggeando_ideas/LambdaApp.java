package com.debuggeando_ideas;

public class LambdaApp {

    public static void main(String[] args) {
        Math resta = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        System.out.println("Resta clase anonima: " + resta.execute(5.0, 3.0));

        Math multiplica = (a, b) -> a*b;
        Math div = (a, b) -> {
            return  a/b;
        };

        System.out.println("Multiplica lambda: " + multiplica.execute(5.0, 3.0));
        System.out.println("Division lambda: " + div.execute(15.0, 3.0));
        System.out.println("suma metodo default: " + div.sum(20.0, 20.0));

        //LAMBDA FOR



    }

}
