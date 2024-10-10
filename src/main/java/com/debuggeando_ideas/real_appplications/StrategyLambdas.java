package com.debuggeando_ideas.real_appplications;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public class StrategyLambdas {

    public static void main(String[] args) {

        var product1 = Product.builder().
                id(1L).
                nameProduct("Bear").
                price(50.0).
                userType("Basic").
                build();

        var product2 = Product.builder().
                id(1L).
                nameProduct("Bear").
                price(50.0).
                userType("Plus").
                build();

        var product3 = Product.builder().
                id(1L).
                nameProduct("Bear").
                price(50.0).
                userType("Prime").
                build();

        var productos = List.of(product1, product2, product3);

        productos.forEach(p -> {

            switch (p.getUserType()) {
                case "Basic": p.setDiscountsStrategy(Strategies.basicDisCount);
                    break;
                case "Plus": p.setDiscountsStrategy(Strategies.plusDisCount);
                    break;
                case "Prime": p.setDiscountsStrategy(Strategies.primeDisCount);
                    break;

            }
        }
        );

        productos.forEach(p -> {
            System.out.println("Price: " + p.getPrice() + " UserType: " + p.getUserType() + "Discount:: " + p.getDiscountsStrategy().get(p.getPrice()));

        });

    }

}

@FunctionalInterface
interface ApplyDiscountsStrategy {

    Double get(Double price);

}

@Data
@ToString
@Builder
class Product {

    private Long id;
    private String userType;
    private String nameProduct;
    private Double price;
    private ApplyDiscountsStrategy discountsStrategy;
}

class Strategies {

    static ApplyDiscountsStrategy basicDisCount = p -> p * 0.02;
    static ApplyDiscountsStrategy plusDisCount = p -> p * 0.05;
    static ApplyDiscountsStrategy primeDisCount = p -> p * 0.08;

}
