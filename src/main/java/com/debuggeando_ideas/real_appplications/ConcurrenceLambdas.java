package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*

Runnable no regresa nada se hace en segundo plano
Callable si regresa valor
 */

public class ConcurrenceLambdas {

    static Runnable printerSum = () -> {

      long num = 0L;
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i<100000;i++) {

            num += i;
        }

        System.out.println("total: " + num);

    };

    static Callable<Long> getSum = () ->{
        long num = 0L;
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i<100000;i++) {

            num += i;
        }

        System.out.println("total: " + num);

        return num;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Thread.currentThread().getName());
        var exec = Executors.newSingleThreadExecutor();
        exec.submit(printerSum);

        var result = exec.submit(getSum);

        System.out.println("Result:: " + result.get());
    }
}
