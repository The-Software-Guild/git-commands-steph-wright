/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.healthyhearts;

/**
 *
 * @author steph
 */
import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        int maxHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        
        double units = maxHeartRate / 100;
        int fiftyPercent = (int) units * 50;
        int eightyfivePercent = (int) units * 85;
        System.out.println("Your target HR zone is " + fiftyPercent + " - " + eightyfivePercent + " beats per minute.");
        
        
    }
}
