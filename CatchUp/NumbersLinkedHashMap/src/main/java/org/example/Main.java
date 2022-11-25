package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Number> tenNumbers = new LinkedHashSet<Number>();

        /*
        this accepts 10 numbers as input.
        alternatively, to ensure set is 10 numbers long, use while (tenNumbers.size() < 10) {}
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number:");
            int num = scanner.nextInt();
            Number number = new Number(i, num);
            tenNumbers.add(number);
        }

        System.out.println(tenNumbers);

        for (Number n: tenNumbers) {
            System.out.println(n);
        }

    }
}