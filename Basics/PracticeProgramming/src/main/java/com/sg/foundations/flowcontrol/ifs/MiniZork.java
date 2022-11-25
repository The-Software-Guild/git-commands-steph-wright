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

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you live. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
            System.out.println("You find a letter!");
            System.out.println("It says: 'You lost the game.'");
            }
        } else if (action.equals("go to the house")) {
        System.out.println("The house is huge and beautiful. You can see a garden, and the gate is open.");
        System.out.println("Break into house or enter garden?");
        action = userInput.nextLine();
        
        if (action.equals("break into house")) {
            System.out.println("The house contains many ornaments.");
            System.out.println("Steal ornament or admire ornament?");
            action = userInput.nextLine();
            
            if (action.equals("steal ornament")) {
                System.out.println("You are arrested for breaking and entering.");
            } else if (action.equals("admire ornament")) {
                System.out.println("You feel a sense of calm that is soon overtaken by panic and leave the house before anyone notices");
                System.out.println("It was worth it.");
            }
        } else if (action.equals("enter garden")) {
            System.out.println("In the garden there is a pond.");
            System.out.println("Watch the fishes or jump in?");
            action = userInput.nextLine();
            
            if (action.equals("watch the fishes")) {
                System.out.println("Aren't they lovely?");
            } else if (action.equals("jump in")) {
                System.out.println("You splash around happily, but the audience hear ominous music");
                System.out.println("You are eaten by a shark.");
            }
        }
        }
    }
}
