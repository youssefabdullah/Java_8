package org.example.FunctionApi;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String ,Integer> function = s -> s.length();
        System.out.println(function.apply("youssef"));
    }
}
