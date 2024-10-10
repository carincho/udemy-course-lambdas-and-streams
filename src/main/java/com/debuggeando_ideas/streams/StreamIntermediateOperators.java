package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * Operadores intermedios regresan otro stream
 */
public class StreamIntermediateOperators {


    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

//        distinctOperatorø(videogames);
//         limitOperator(videogames);
//            skipOperator(videogames);
//        filterOperator(videogames);
//        mapOperator(videogames);
//        flatMapOperator(videogames);
//        mapVsFlatMapOperator(videogames);
//        peekOperator(videogames);
//        sortOperator(videogames);
//        takeWhileOperator(videogames);
//        dropWhileOperator(videogames);

        debugStream(videogames);
    }

    static void distinctOperator (Stream<Videogame>videogame) {

        System.out.println("Operador Distinct:: ");

        System.out.println(videogame.distinct().count());


    }

    /**
     *
     * Regresa los primeros 5 elementos
     */
    static void limitOperator (Stream<Videogame>videogame) {

        System.out.println("Operador Limit:: ");

        List<Videogame> r = videogame.limit(5).collect(Collectors.toList());

       r.forEach(System.out::println);


    }

    /*
    Se salta los primeros 15
     */
    static void skipOperator (Stream<Videogame>videogame) {

        System.out.println("Operador skip:: ");

        List<Videogame> r = videogame.skip(15).collect(Collectors.toList());

       r.forEach(System.out::println);

    }
    static void filterOperator (Stream<Videogame>videogame) {

        System.out.println("Operador filter:: ");

        List<Videogame> r = videogame.filter( v -> v.getPrice() > 12.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);

    }

static void mapOperator (Stream<Videogame>videogame) {

        System.out.println("Operador Map:: ");

        List<BasicVideogame> r = videogame.map(v -> {

                    return BasicVideogame.builder()
                            .name(v.getName())
                            .price(v.getPrice())
                            .console(v.getConsole())
                            .build();
                }
                ).collect(Collectors.toList());


        List<String>titles = r.stream()
                .map(BasicVideogame::getName)
                .collect(Collectors.toList());

        r.forEach(System.out::println);
        System.out.println("-------------");
        System.out.println("titles");

        titles.forEach(System.out::println);

    }
    static void flatMapOperator (Stream<Videogame>videogame) {

        System.out.println("Operador FlatMap:: ");

        List<Review> r = videogame.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());

        System.out.println(r);

    }

    static void mapVsFlatMapOperator (Stream<Videogame>videogame) {

            System.out.println("Operador Map Vs FlatMap:: ");

    //        var totalReviews = videogame.map(v -> v.getReviews().size()).collect(Collectors.toList()); //Con map
            var totalReviews = videogame.flatMap(v -> v.getReviews().stream()).count(); //con flat map
    //        var totalReviews = videogame.mapToLong(v -> v.getReviews().size()).sum(); //con mapLong

    //        System.out.println(totalReviews.size());
            System.out.println(totalReviews);

        }
        static void peekOperator (Stream<Videogame>videogame) {


            System.out.println("Operador peek:: ");
            videogame.peek(v->v.setName("")).forEach(System.out::println);

        }

        static void sortOperator (Stream<Videogame>videogame) {


            System.out.println("Operador sort:: ");

            List<Videogame>listSorted = videogame.sorted(Comparator.comparingInt(v -> v.getReviews().size())).collect(Collectors.toList());

            listSorted.forEach(System.out::println);

        }

        // A veces es recomendado ordenar la lista
       // Tome todos antes que se cumpla el predicado
        static void takeWhileOperator (Stream<Videogame>videogame) {


            System.out.println("Operador takeWhile:: ");

            List<Videogame> r = videogame
                    .sorted(Comparator.comparing(Videogame::getName))
                    .takeWhile(v -> !v.getName().startsWith("M"))
                    .collect(Collectors.toList());

            r.forEach(System.out::println);

        }

        // A veces es recomendado ordenar la lista
       // borra todos hasta que se cumpla el predicado
        static void dropWhileOperator (Stream<Videogame>videogame) {


            System.out.println("Operador dropWhile:: ");

            List<Videogame> r = videogame
                    .sorted(Comparator.comparing(Videogame::getName))
                    .dropWhile(v -> !v.getName().startsWith("M"))
                    .collect(Collectors.toList());

            r.forEach(System.out::println);

        }

        static void debugStream (Stream<Videogame>videogame) {


            var myArray = videogame
                    .distinct()
                    .sorted(Comparator.comparing(Videogame::getTotalSold))
                    .flatMap(video -> video.getReviews().stream())
                            .map(Review::getComment)
                            .filter(c -> c.contains("best"))
                            .map("Good comment: " ::concat)
                            .toArray();

        }





}
