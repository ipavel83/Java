package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter int a:");
        int a = inputInt();
        System.out.println("Enter int b:");
        int b = inputInt();
        printEquality(a, b);
    }

    private static void printEquality(int a, int b) {
        if (a > b)
            System.out.println("a > b");
        else if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a = b");
    }

    private static int inputInt() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}