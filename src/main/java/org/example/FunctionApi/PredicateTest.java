package org.example.FunctionApi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        //use one object
        Predicate<Integer> predicate = integer -> integer < 0;
        System.out.println("Predicate" + predicate.test(1));
        System.out.println("Predicate" + predicate.test(-1));

        System.out.println("This number is even " + check(2, integer -> integer % 2 == 0));

        //use 2 object
        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;
        System.out.println("BiPredicate : youssef is length 8 ? : " +biPredicate.test("youssef",8));
        System.out.println("BiPredicate : youssef is length 7 ? : " +biPredicate.test("youssef",7));
    }

    public static <T> boolean check(T t, Predicate<T> lamda) {
        return lamda.test(t);
    }
}

