/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author steph
 */
import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getColour(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColour(); // call color method again here
        int weight = getNum(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = getNum(10, 20); // call number method,
            // with a range between 10 - 20
        int number = getNum(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = getNum(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    // Method that returns a randomly chosen colour
    public static String getColour() {
        // String array
        String[] colours = {"blue", "red", "green", "yellow", "orange"};
        
        // Random object and number
        Random random = new Random();
        int choice = random.nextInt(colours.length);
        
        //Return a colour
        return colours[choice];
        
    }
    
    // Method that returns a randomly chosen animal
    public static String getAnimal() {
        // String array
        String[] animals = {"cat", "dog", "mouse", "parrot", "hamster"};
        
        // Random object and number
        Random random = new Random();
        int choice = random.nextInt(animals.length);
        
        //Return a colour
        return animals[choice];
        
    }
    
    // Method that returns a random integer chosen from a range
    public static int getNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}