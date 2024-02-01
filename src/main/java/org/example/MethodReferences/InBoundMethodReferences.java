package org.example.MethodReferences;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class InBoundMethodReferences {
    public static void main(String[] args) {
        String name = "MR. Joe";

        Supplier<String> lowerL  = () -> name.toLowerCase();
        Supplier<String> lowerR  = name::toLowerCase;


        System.out.println(lowerL.get());
        System.out.println(lowerR.get());

        Predicate<String> predicate = s -> name.startsWith(s);
        Predicate<String> predicateR =name::startsWith;

        System.out.println(predicateR.test("MR"));
        System.out.println(predicate.test("Mr"));

    }
}
