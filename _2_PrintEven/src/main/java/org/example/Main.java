package org.example;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> listOfEvenIntegers = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(toList());

        System.out.println(listOfEvenIntegers);
}}