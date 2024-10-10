package com.debuggeando_ideas.optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import javax.xml.crypto.Data;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<Videogame>gtaOpt = Optional.ofNullable(null);


        System.out.println(gtaOpt.orElseThrow(()-> new RuntimeException("Videgame not found")));
    }
}
