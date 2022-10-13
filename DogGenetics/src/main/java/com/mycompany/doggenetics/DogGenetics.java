/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.doggenetics;

/**
 *
 * @author steph
 */
import static java.lang.Math.round;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        // Prompt for name
        System.out.println("What is your dog's name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        // Generate percentages
        // Create a random distribution
        int[] distribution = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            distribution[i] = random.nextInt(10) + 1;
        }
        // Use distribution to generate percentages
        int sum = 0;
        for (int x: distribution) {
            sum += x;
        }
        
        double units = 100 / sum;
        
        int[] percentages = new int[5];
        
                
        for (int x = 0; x < 5; x++) {
            percentages[x] = (int) (distribution[x] * units);
        }
        
        // Create array of dog breeds 
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic Rednosed Asian Pug", 
        "Common Cur", "King Doberman"}; 
        
        // Produce report
        System.out.println("Well then, I have this highly reliable report on " 
                + name + "'s prestigious background right here.");
        
        System.out.println(name + " is:");
        
        for (int i = 0; i < 5; i++){
            System.out.println(percentages[i] + "% " + breeds[i]);
        }
        
        System.out.println("Wow, that's QUITE the dog!");
    }
}
