package org.example.MethodReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethodReferences {
    public static void main(String[] args) {
        Consumer<List<Integer>>consumer=list -> Collections.sort(list);
        Consumer<List<Integer>>consumerR=Collections::sort;

        List<Integer> list = Arrays.asList(5,4,3,5,2,1);
        consumerR.accept(list);
        System.out.println(list);

    }
}
