/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author steph
 */
import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        
        int timesTold = 1;
        
        Random random = new Random();
        double randomValue = random.nextDouble();
        double chance = 0.0;
        
        do {
            timesTold++;
            System.out.println("Clean your room!! (x" + timesTold + ")" );
            chance += 0.1;
            if (timesTold == 7) {
                System.out.println("YOU'RE GROUNDED");
                break;
            }
            if (randomValue <= chance) {
                System.out.println("FINE, I'LL CLEAN MY ROOM.");
            }
        } 
        while (randomValue > chance);
    }
}
