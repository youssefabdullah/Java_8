package org.example.FunctionApi;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        Consumer<String> stringConsumer1 =System.out::println;

        stringConsumer.accept("Youssef");

    }
}
