package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;



public class StreamFinalOperator {


    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        //countOpetaror(videogames);
        //forEachOperator(videogames);
        //anyMatchOperator(videogames);
//        allMatchOperator(videogames);
//        noneMatchOperator(videogames);
//        findFirstOperator(videogames);
//        findFirstOperator(videogames);
//        reduceOperator(videogames);
//        maxOperator(videogames);
        minOperator(videogames);
    }

    static void countOpetaror (Stream<Videogame>videogames){

        System.out.println("Numero de elementos:: " + videogames.count());
    }

    static void forEachOperator (Stream<Videogame>videogames){

        System.out.println("Elementos:: ");
        videogames.forEach(System.out::println);
    }

    static void anyMatchOperator (Stream<Videogame>videogames){

        System.out.println("Operador AnyMatch:: ");
        boolean r = videogames.anyMatch(v -> v.getTotalSold() > 1);

        System.out.println(r);

    }
    static void allMatchOperator (Stream<Videogame>videogames){

        System.out.println("Operador allMatch:: ");
        boolean r = videogames.allMatch(v -> v.getTotalSold() > 150);

        System.out.println(r);

    }
    static void noneMatchOperator (Stream<Videogame>videogames){

        System.out.println("Operador noneMatch:: ");
        boolean r = videogames.noneMatch(v -> v.getReviews().isEmpty());

        System.out.println(r);

    }

    static void findFirstOperator (Stream<Videogame>videogames){

        System.out.println("Operador findFirst:: ");
       Optional<Videogame> r= videogames.findFirst();

        System.out.println(r);

    }
    static void findAnyOperator (Stream<Videogame>videogames){

        System.out.println("Operador findAny:: ");
       Optional<Videogame> r= videogames.findAny();

        System.out.println(r);

    }
    static void reduceOperator (Stream<Videogame>videogames){

        System.out.println("Operador reduce:: ");
       Optional<Integer> r= videogames.
               filter(Videogame::getIsDiscount).
               map(Videogame::getTotalSold).
               reduce(Integer::sum);
//                reduce((a, b) -> a + b);
        System.out.println(r);

    }

    static void maxOperator (Stream<Videogame>videogames){

        System.out.println("Operador max:: ");
        Optional<Videogame> r= videogames.max(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());

    }
    static void minOperator (Stream<Videogame>videogames){

        System.out.println("Operador min:: ");
        Optional<Videogame> r= videogames.min(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());

    }


}
