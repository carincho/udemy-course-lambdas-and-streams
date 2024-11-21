package com.debuggeando_ideas.validadores;

import com.debuggeando_ideas.real_appplications.Validator;
import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Objects;

public class ValidatorApp {

    public static void main(String[] args) {

        var videogame1 = Database.videogames.get(0);
        var videogame2 = Database.videogames.get(2);
        var videogame3 = Database.videogames.get(3);
        var videogame4 = Database.videogames.get(4);

//        isValidVideogame(videogame1);

        Validator.applyRules(Rules.rules, null);

        System.out.println("Valid videogame");
    }

    private static void isValidVideogame(Videogame videogame) {

        if(Objects.isNull(videogame)) {
            throw new IllegalArgumentException("Cant be null");
        } else {
            if(videogame.getPrice() < 20) {
                throw new InvalidVideogameException("Price must be greater than 20");
            } else if (!videogame.getConsole().equals(Console.XBOX)) {
                throw new InvalidVideogameException("Console must be for XBOX");
            } else if (videogame.getReviews().isEmpty()) {
                throw new InvalidVideogameException("Reviews cannot be empty");
            } else if (videogame.getTotalSold() < 10) {
                throw new InvalidVideogameException("Total sold must be greater than 10");
            } else if(videogame.getIsDiscount()) {
                throw new InvalidVideogameException("Videogame dont have discount");
            } else if(videogame.getName().equals("halo")) {
                throw new InvalidVideogameException("Videgame have to be halo");

            }
        }
        System.out.println("Valid videogame");
    }


}