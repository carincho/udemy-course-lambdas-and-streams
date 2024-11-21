package com.debuggeando_ideas.lambdas;

import java.util.List;

public class AppLambdaFor {

    public static void main(String[] args) {

        List<String>paises = List.of("Mexico","Colombia","Argentina","Chile ","Uruguay");

        for(String p : paises){
            System.out.println("Pais for normal:: " + p);

        }

        paises.forEach(p -> System.out.println("Pais for lambda:: " + p.toUpperCase()));



    }
}
