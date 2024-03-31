package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string a:");
        String a = inputString(in);
        System.out.println("Enter string b:");
        String b = inputString(in);
        printEquality(a, b);
        in.close();
    }

    private static void printEquality(String a, String b) {
        if (Comparer.isStringEquals(a, b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    private static String inputString(final Scanner in) {
        String s = "";
        if (in.hasNextLine())
             s = in.nextLine();
        return s;
    }
}