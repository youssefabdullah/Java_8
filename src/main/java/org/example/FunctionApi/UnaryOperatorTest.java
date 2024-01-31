package org.example.FunctionApi;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = s -> s+" GG";
        System.out.println(unaryOperator.apply("Youssef"));

        BinaryOperator<String> binaryOperator = (s, s2) -> s+s2;
        System.out.println(binaryOperator.apply("youssef"," abdullah"));
    }
}
