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

public class YourLifeInMovies {
    public static void main(String[] args) {
        // Ask for name
        System.out.println("What's your name?");
        
        // Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Get name
        String name = scanner.nextLine();
        
        // Ask for age
        System.out.println("Ok, " + name + ", what year were you born?");
        int birthYear = scanner.nextInt();
        
        // Make them feel old
        System.out.println("Well, " + name + "...");
        
        if (birthYear < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if (birthYear < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if (birthYear < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if (birthYear < 1975) {
            System.out.println("AND the original Jurassic Park release is closer to the first lunar landing than it is to today!");
        }
        if (birthYear < 1965) {
            System.out.println("And I am sorry to tell you that the MASH TV series has been around for almost a century.");
        } 
    }
}
