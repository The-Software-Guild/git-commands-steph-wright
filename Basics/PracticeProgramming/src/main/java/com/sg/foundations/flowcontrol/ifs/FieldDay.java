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

public class FieldDay {
    public static void main(String[] args) {
        String team;
        
        // Prompt for name
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your last name?");
        String name = scanner.nextLine();
        
        // Compare strings
        if (name.compareTo("Baggins") < 0) {
            team = "Red Dragons";
        } else if (name.compareTo("Baggins") > 0 && name.compareTo("Dresden") < 0) {
            team = "Dark Wizards";
        } else if (name.compareTo("Dresden") > 0 && name.compareTo("Howl") < 0) {
            team = "Moving Castles";
        } else if (name.compareTo("Howl") > 0 && name.compareTo("Potter") < 0) {
            team = "Golden Snitches";
        } else if (name.compareTo("Potter") > 0 && name.compareTo("Vimes") < 0) {
            team = "Night Guards";
        } else {
            team = "Black Holes";
        }
        
        // Announce
        System.out.println("Aha! You're on the team " + team + "!");
        System.out.println("Good luck in the games!");
        
    }
}
