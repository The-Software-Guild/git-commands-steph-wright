/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.luckysevens;

/**
 *
 * @author steph
 */
import java.util.Scanner;
import java.util.Random;

public class LuckySevens {

    public static void main(String[] args) {
        // The program first asks the user how many dollars they have to bet
        System.out.println("How many dollars do you have to bet?");
        Scanner scanner = new Scanner(System.in);
        int dollars = scanner.nextInt();
        int rounds = 0;
        int maxDollars = 0;
        int roundsWhenMax = 0;
        
        while (dollars > 0) {
            // Increment rounds
            rounds++;
            
            // Roll two dice
            Random random = new Random();
            int roll1 = random.nextInt(6) +1;
            int roll2 = random.nextInt(6) +1;
            int result = roll1 + roll2;

            // Check result
            if (result == 7) {
                dollars += 4;
            } else {
                dollars--;
            }
            
            // Check if dollars is highest
            if (dollars > maxDollars) {
                maxDollars = dollars;
                roundsWhenMax = rounds;
            }  
        }
        announceBroke(rounds);
        announceHindsight(roundsWhenMax, maxDollars);
        
    }
    
    public static void announceBroke(int rounds) {
        System.out.println("You are broke after " + rounds + " rounds.");
    }
    
    public static void announceHindsight(int roundsWhenMax, int maxDollars) {
        System.out.println("You should have quit after " + roundsWhenMax + " rounds when you had $" + maxDollars +".");
    }
    
}
