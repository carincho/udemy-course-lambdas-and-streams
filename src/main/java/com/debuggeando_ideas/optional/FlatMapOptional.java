package com.debuggeando_ideas.optional;


import java.util.Optional;

/**
 *
 * FlatMap para optional funciona diferente cuando se es estricto con los null
 */
public class FlatMapOptional {

    public static void main(String[] args) {
        Movie movie = new Movie("Saw", 1153.40);
        Optional<Movie>movieOpt = Optional.of(movie);

        String movieName = movieOpt.flatMap(Movie::getName).get();

        System.out.println("Nombre de pelicula:: " + movieName);


    }
}
