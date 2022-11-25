/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author steph
 */
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        // prompt user
        System.out.println("How much FizzBuzz?");
        Scanner scanner = new Scanner(System.in);
        int stop = scanner.nextInt();
        
        for (int i = 0; i <= stop; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!");
    }
}
