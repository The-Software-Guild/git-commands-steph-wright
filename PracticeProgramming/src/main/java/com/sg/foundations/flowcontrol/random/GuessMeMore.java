/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

/**
 *
 * @author steph
 */
import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {
    public static void main(String[] args) {
        int guess = 500;
                
        // Generate number
        Random numberGenerator = new Random();
        int myNum = numberGenerator.nextInt(201) - 100;
                
        // Prompt user
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        Scanner guesser = new Scanner(System.in);
            
        while (guess != myNum){
            guess = guesser.nextInt();
        
            // Display
            System.out.println("Your guess: " + guess);

            // Compare 
            if (guess == myNum) {
                System.out.println("Wow, nice guess! That was it!");
                break;
            } else if (guess > myNum) {
                System.out.println("Ha, nice try - too high! Try again!");
            } else {
                System.out.println("Ha, nice try - too low! Try again!");
            }
        }
    }
}
