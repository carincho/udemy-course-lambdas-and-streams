package com.debuggeando_ideas.validadores;

import com.debuggeando_ideas.real_appplications.Validator;
import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Objects;

public class Rules {



    private Rules() {}

    private final static Validator<Videogame, RuntimeException>isNull = v -> {

        if(Objects.isNull(v)) throw new IllegalArgumentException("Cant be null");
    };
    private final static Validator<Videogame, RuntimeException>validPrice = v -> {

        if(v.getPrice() < 20) throw new InvalidVideogameException("Price must be greater than 20");
    };

    private final static Validator<Videogame, RuntimeException>validConsole = v -> {

        if (!v.getConsole().equals(Console.XBOX)) throw new InvalidVideogameException("Console must be for XBOX");
    };
    private final static Validator<Videogame, RuntimeException>validReviews = v -> {

         if (v.getReviews().isEmpty()) throw new InvalidVideogameException("Reviews cannot be empty");
    };
    private final static Validator<Videogame, RuntimeException>validTotalSold = v -> {

         if (v.getTotalSold() < 10) throw new InvalidVideogameException("Total sold must be greater than 10");
    };
    private final static Validator<Videogame, RuntimeException>validDiscount = v -> {

        if(v.getIsDiscount()) throw new InvalidVideogameException("Videogame dont have discount");
    };

    public static List<Validator<Videogame, RuntimeException>>rules = List.of(
            isNull, validPrice, validConsole, validReviews, validDiscount, validTotalSold
    );

}
