package com.debuggeando_ideas.util_function;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

    public static void main(String[] args) {

        ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Oscar", 40 ));

        System.out.println("Objeto Serializado:: " + Arrays.toString( objectSerialized.toByteArray()));

        Person objectDes = desarializer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));

        System.out.println("Objeto deserializado:: " + objectDes);

    }

    //Serializar
    static Function<Person, ByteArrayOutputStream>serializer = p -> {

        ByteArrayOutputStream inMemoryBytes  =  new ByteArrayOutputStream();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)){ //try with resources de java 8, ObjectOutputStrem es un objetopara hacer un String de flujo de datos de salida
            outputStream.writeObject(p);
            outputStream.flush();

            //si no hacemos un try with resources tendriamos que hacer un close
            //Todos los objetos que usan la interface autocloseable se cierran automaticamente

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return inMemoryBytes;
    };

    //deserializar

    static Function<ByteArrayInputStream, Person> desarializer = bais -> {

        try (ObjectInputStream input = new ObjectInputStream(bais)){ //try with resources de java 8, ObjectOutputStrem es un objetopara hacer un String de flujo de datos de salida

            return (Person)input.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());

        }

    };


}
