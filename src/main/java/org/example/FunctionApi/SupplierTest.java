package org.example.FunctionApi;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());

        Supplier<LocalTime> timeSupplier = () -> LocalTime.now();
        System.out.println(timeSupplier.get());

        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get());
    }
}
