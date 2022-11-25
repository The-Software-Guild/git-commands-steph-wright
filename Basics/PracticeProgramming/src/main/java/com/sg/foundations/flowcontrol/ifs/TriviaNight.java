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

public class TriviaNight {
    public static void main(String[] args) {
        System.out.println("It's TRIVIA NIGHT! Let's go!");
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        

        // Q1
        System.out.println("Pop sensation ABBA come from which country?");
        System.out.println("1) Denmark   2) Sweden   3) Norway");
        
        int answer1 = scanner.nextInt();
        
        if (answer1 == 2) {
            score ++;
        }
        
        
        // Q2
        System.out.println("Which female singer won a grammy for best new artist in 1985?");
        System.out.println("1) Cyndi Lauper   2) Madonna   3) Kate Bush");
        
        int answer2 = scanner.nextInt();
        
        if (answer2 == 1) {
            score ++;
        }
        
        
        // Q3
        System.out.println("Which Beatle wrote the hit song 'Something'?");
        System.out.println("1) John   2) Paul   3) George");
        
        int answer3 = scanner.nextInt();
        
        if (answer3 == 3) {
            score ++;
        }
        
        // Score announcement
        if (score == 3) {
            System.out.println("Full marks! You got all 3 correct.");
        } else if (score == 2) {
            System.out.println("Not bad! You got 2 out of 3 correct.");
        } else if (score == 1) {
            System.out.println("Nice try. You got 1 out of 3 correct.");
        } else {
            System.out.println("You need to revise your music history! 0/3.");
        }
        
        
    }
    
}
