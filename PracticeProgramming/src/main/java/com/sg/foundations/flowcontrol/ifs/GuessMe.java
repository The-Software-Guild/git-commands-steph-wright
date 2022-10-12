/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author steph
 */
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        // Store a variable of your choice
        int myInt = 7;
        
        // Ask user to pick a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInt = scanner.nextInt();
        
        // Print out what the user entered
        System.out.println("You chose " + userInt + ".");
        
        // Control flow
        if (userInt == myInt) {
            System.out.println("Wow, nice guess! That was it!");
        }
        else if (userInt < myInt) {
            System.out.println("Ha, nice try - too low! I chose " + myInt + ".");
        }
        else {
            System.out.println("Too bad, way too high, I chose " + myInt + ".");
        }
    }
}
