package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Employee;
import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {


    public static void main(String[] args) {

        //LAMBDAS GENERICAS

        Printer<String> printString = s -> System.out.println("Objeto String:: " + s);
        Printer<Product> printProduct = product -> System.out.println("Objeto Producto:: " + product);
        Printer<Employee>printEmployee = employee -> System.out.println("Objeto Employee:: " + employee);

        printString.print("Este es un string");

        Product myProducto = new Product();
        myProducto.setId(123L);
        myProducto.setPrice(31999.0);
        myProducto.setName("Iphone 16 pro max");
        printProduct.print(myProducto);

        Employee empleado = new Employee();
        empleado.setDni("DIAO831010");
        empleado.setName("Oscar Guillermo");
        empleado.setSalary(40000.0);

        printEmployee.print(empleado);


    }
}
