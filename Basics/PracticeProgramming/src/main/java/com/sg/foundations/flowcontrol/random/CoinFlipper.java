/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

/**
 *
 * @author steph
 */

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        System.out.println("Ready, set, flip.....!!");
        
        // Flip the coin
        Random coinGenerator = new Random();
        float coinFlip = coinGenerator.nextFloat();
        
        // Result
        if (coinFlip > 0.5) {
            System.out.println("You got HEADS!");
        } else {
            System.out.println("You got TAILS!");
        }
        
    }
}
