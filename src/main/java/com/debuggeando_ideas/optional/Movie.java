package com.debuggeando_ideas.optional;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class Movie {

    private String name;
    private  Double price;



    public Optional<String> getName() {
        return Optional.of(this.name);
    }

    public Optional<Double> getPrice() {
        return Optional.of(this.price);
    }
}
