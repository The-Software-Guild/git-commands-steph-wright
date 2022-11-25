/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.height;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Height h1 = new Height();
        System.out.println("Enter first height in feet:");
        int h1Feet = sc.nextInt();
        h1.setFeet(h1Feet);
        System.out.println("Enter the remaining inches:");
        int h1Inches = sc.nextInt();
        h1.setInches(h1Inches);
        
        Height h2 = new Height();
        System.out.println("Enter second height in feet:");
        int h2Feet = sc.nextInt();
        h2.setFeet(h2Feet);
        System.out.println("Enter the remaining inches:");
        int h2Inches = sc.nextInt();
        h2.setInches(h2Inches);
        
        Height h3 = new Height();
        h3.addHeights(h1, h2);
        
        System.out.println("The sum of the two heights is: ");
        System.out.println(h3.getFeet()+  " feet and " + h3.getInches() +  " inches.");
    }
}
