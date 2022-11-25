/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rockpaperscissors;

/**
 *
 * @author steph
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        boolean wantsToPlay = true;
        
        while (wantsToPlay) {
            int wins = 0 ;
            int ties = 0;
            int losses = 0;
            int rounds = 0;

            System.out.println("How many rounds do you want to play? Maximum 10.");
            Scanner scanner = new Scanner(System.in);
            int maxRounds = scanner.nextInt();
            if (rounds >= 1 || rounds <= 10) {
                // Do the number of rounds specified
                while (rounds < maxRounds) {
                    // Simulate a round
                    int userChoice = getUserChoice();
                    int computerChoice = getComputerChoice();
                    int result = compareChoices(userChoice, computerChoice);
                    switch (result) {
                        case 0:
                            ties++;
                            break;
                        case 1:
                            wins++;
                            break;
                        case -1:
                            losses++;
                            break;
                    }
                    rounds++;
                }
                // Print out ties wins and losses
                System.out.println("You won " + wins + " rounds.");
                System.out.println("You tied " + ties + " rounds.");
                System.out.println("You lost " + losses + " rounds.");

                // Declare winner
                declareWinner(wins, losses);

                // Ask if user wants to play again
                System.out.println("Want to play again? [y/n]");
                Scanner assessor = new Scanner(System.in);
                String answer = assessor.nextLine();
                if (answer.equals("n")) {
                    System.out.println("Thanks for playing!");
                    wantsToPlay = false;
                    break;
                }
                


            }
            // Print error message if 
            else {
                System.out.println("Error. Invalid input.");
            }
        }
    }
    // Get user's choice
    public static int getUserChoice() {
        System.out.println("Choose your fighter:");
        System.out.println("1) Rock     2) Paper    3) Scissors");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // Computer chooses
    public static int getComputerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
    // Compare computer and user's choices
    public static int compareChoices(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return 0;
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
                ) {
            return 1;
        } else {
            return -1;
        }
    }
    // Declare winner
    public static void declareWinner(int wins, int losses) {
        if (wins > losses) {
            System.out.println("You're the winner!");
        } else if (wins < losses) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("User and computer tied. No winner this time.");
        }
    }
    
    
}
