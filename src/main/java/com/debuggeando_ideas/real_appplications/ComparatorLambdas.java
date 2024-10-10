package com.debuggeando_ideas.real_appplications;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(33,40,67,31,35,62);
        numbers.sort((a, b) -> a - b);

        System.out.println("Lista Numerica Ordenada:: " + numbers);

        List<String> nombres = Arrays.asList("Teresa","Guillermo","Oscar","Carolyn","Coral","Sharon", "Rubi");
       // nombres.sort((a, b) -> a.compareTo(b));
        nombres.sort(String::compareTo);

        System.out.println("Lista nombres Ordenada:: " + nombres);

        nombres.sort(Comparator.reverseOrder());

        System.out.println("Ahora al reves: " + nombres);

        List<Person>personas = Arrays.asList(new Person("Pedro", 50), new Person("Pablo", 10),new Person("Paco", 20),new Person("Pipo", 20));
        personas.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        System.out.println("Personas ordenadas:: " + personas);


    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;

}
