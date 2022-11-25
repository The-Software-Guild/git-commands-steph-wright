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
import java.util.Scanner;

public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();
        
        // prompt for number of sides
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does a  die have?");
        int sides = scanner.nextInt();
        
        
        // Roll die to generate a number between 1 - #sides
        int rollResult = diceRoller.nextInt(sides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        }
        
        if (rollResult == sides + 1) {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}