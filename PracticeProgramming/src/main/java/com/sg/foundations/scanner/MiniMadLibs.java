/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

/**
 *
 * @author steph
 */
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("LETS PLAY MAD LIBS!");
        
        System.out.println("Noun:");
        String one = scanner.nextLine();
        
        System.out.println("Adjective:");
        String two = scanner.nextLine();
        
        System.out.println("Noun:");
        String three = scanner.nextLine();
        
        System.out.println("Number:");
        String four = scanner.nextLine();
        
        System.out.println("Adjective:");
        String five = scanner.nextLine();
        
        System.out.println("Plural noun:");
        String six = scanner.nextLine();
        
        System.out.println("Plural noun:");
        String seven = scanner.nextLine();
        
        System.out.println("Plural noun:");
        String eight = scanner.nextLine();
        
        System.out.println("Verb present tense");
        String nine = scanner.nextLine();
        
        System.out.println("Same verb but past tense");
        String ten = scanner.nextLine();
        
        System.out.println(one + ": the " + two + " frontier. "
                + "These are the voyages of the starship " + three +
                ". Its " + four + "-year mission: to explore strange "
                + five +  six + ", to seek out " + five + seven +
                " and " + five + eight + ", to boldly " + nine +
                " where no one has " + ten + " before.");
    }
}
