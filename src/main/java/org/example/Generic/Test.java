package org.example.Generic;

import java.util.function.Predicate;

//Use this annotation to write only one abstract Method in interface
@FunctionalInterface
interface Evaluate<T>{
    boolean isNegative(T t);
}
public class Test {
    public static void main(String[] args) {

        Evaluate<Integer> evaluate = integer -> integer<0;
        System.out.println("Evaluate " + evaluate.isNegative(-1));
        System.out.println("Evaluate " + evaluate.isNegative(1));

    }
    public static <T> boolean check(T t,Predicate<T> lamda){
        return lamda.test(t);
    }
}
