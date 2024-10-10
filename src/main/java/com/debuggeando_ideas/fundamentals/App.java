package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class App {

    public static void main(String[] args) {

        //Programacion Generica
        ProductDB pdB = new ProductDB();
        EmployeeDB eDB = new EmployeeDB();

        System.out.println(pdB.getById(1L));
        System.out.println(eDB.getById(2L));


        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        //Clases anonimas

        DatabaseService<String>dbAnonimo = new DatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllRecords() {
                return List.of();
            }
        };
        System.out.println(dbAnonimo.getClass().getName());

    }

}
