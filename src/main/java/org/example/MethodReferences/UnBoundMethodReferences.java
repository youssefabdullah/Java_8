package org.example.MethodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UnBoundMethodReferences {
    public static void main(String[] args) {

        Function<String,String> upperL = s -> s.toUpperCase();
        Function<String,String> upperR = String::toUpperCase;

        System.out.println(upperL.apply("youssef"));
        System.out.println(upperR.apply("youssef"));

        BiFunction<String,String,String> conncat = (s, s2) -> s.concat(s2);
        BiFunction<String,String,String> conncatR = String::concat;

        System.out.println(conncat.apply("youssef"," mazen"));

    }
}
