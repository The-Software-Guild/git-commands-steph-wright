/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorizer;

/**
 *
 * @author steph
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {
        // This program must ask the user for the number the program will factor.
        System.out.println("What number do you want to factor?");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // The program must print out the original number.
        System.out.println("The factors of " + x + " are:");
        
        // The program must print out each factor of the number
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("The factors of " + x + " are: ");
        for (int i: factors) {
            System.out.println(i + " ");
        }
        
        
        // The program must print out the total number of factors for the number.
        
        System.out.println(x + " has " + factors.size() + " factors.");
        
        // The program must print out whether or not the number is perfect.
        int sum = 0;
        for (int i: factors) {
            sum += i;
        }
        if (sum == x) {
            System.out.println(x + " is a perfect number.");
        } else {
            System.out.println(x + " is not a perfect number.");
        }
        
        // The program must print out whether or not the number is prime.
        if (factors.size() == 1) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not a prime number.");
        }
    }
}
