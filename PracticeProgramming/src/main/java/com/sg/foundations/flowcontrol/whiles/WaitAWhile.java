/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author steph
 */

public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}

// What happens if you change bedTime's value to 11?
// the loop continues until 11

// What about using bedTime's original value, but changing timeNow to 11?
// No output

// If you comment out timeNow++ at the end of the loop, what happens?
// Stays stuck on first time and loops forever causing runtime error