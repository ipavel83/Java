package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = inputNumber("a");
        int b = inputNumber("b");
        printEquality(a, b);
        printOperations(a, b);
    }

    private static void printEquality(int a, int b) {
        if (Comparer.aIsBiggerThanB(a, b))
            System.out.println("a > b");
        else if (Comparer.aIsLessThanB(a, b))
            System.out.println("a < b");
        else
            System.out.println("a = b");
    }

    private static void printOperations(int a, int b) {
        System.out.println("a + b = " + Calculator.summ(a,b));
        System.out.println("a - b = " + Calculator.diff(a, b));
        System.out.println("a / b = " + Calculator.div(a, b));
        System.out.println("a * b = " + Calculator.mul(a, b));
    }

    private static int inputNumber(String name) {
        int a;
        while (true) {
            try {
                System.out.println("Введите целое число " + name + ":");
                a = inputIntegerFromConsole();
                return a;
            } catch (Exception e) {
                System.out.println("Число не корректно");
            }
        }
    }

    private static int inputIntegerFromConsole() throws Exception {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}