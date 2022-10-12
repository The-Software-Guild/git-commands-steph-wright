/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author steph
 */


public class SpaceRustlers {

    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        // Add in another if-else block that prints out: "Hurrah, we've got the grub! Hamburger party on Alpha Centauri!" if the aliens outnumber the cows, but if the cows equal or outnumber the aliens print out "Oh no! The herds got restless and took over! Looks like we're hamburger now!!"
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!" );
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
}

// What does the else if and if do? (Answer in a comment)
// if: if the condition is met, the code in the block runs
// else if: if the conidtion above is not met, it checks that condition and runs that block if the condtion is met

// If you remove the else from the else if, what does THAT do? 
// In this case it runs the same but it just means that in the even none of the conditions are filled, nothing will run

