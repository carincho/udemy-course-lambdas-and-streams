package com.debuggeando_ideas.reference_methods;

import java.util.function.Supplier;

public class ContructorMethodReference {


    public static void main(String[] args) {

        //Supplier<MyObject> supplier = () -> new MyObject();
        Supplier<MyObject> supplier = MyObject::new;
        System.out.println(supplier.get());
    }
}
