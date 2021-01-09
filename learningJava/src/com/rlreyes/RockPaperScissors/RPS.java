package com.rlreyes.RockPaperScissors;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main (String [] args) {
        //User Scanner + Random number
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        //variables
        int user;
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int cpuScore = 0;
        int userScore = 0;
        boolean play = true;

        // do-while loop;
            do  {
                //random number test
                int randomNum = rand.nextInt(3);
                int computer = randomNum;

                //Computer asks user for input
                System.out.println("Rock, Paper, or Scissors?");
                String userInput = scanner.nextLine();

                //options for user's pick and computers pick
                switch (userInput.toLowerCase()) {
                    case "rock":
                        System.out.println("You chose rock");
                        user = 0;
                        if (computer == 0) {
                            System.out.println("CPU picks rock too, it is a draw");
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 1) {
                            System.out.println("CPU picks paper, sorry you lose");
                            cpuScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 2) {
                            System.out.println("CPU picks scissors, you win!");
                            userScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        }
                        break;
                    case "paper":
                        System.out.println("You chose paper");
                        user = 1;
                        if (computer == 0) {
                            System.out.println("CPU picks rock, you win!");
                            userScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 1) {
                            System.out.println("CPU picks paper too, draw!");
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 2) {
                            System.out.println("CPU picks scissors, you lose!");
                            cpuScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        }
                        break;
                    case "scissors":
                        System.out.println("You chose scissors");
                        user = 2;
                        if (computer == 0) {
                            System.out.println("CPU picks rock, you lose");
                            cpuScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 1) {
                            System.out.println("CPU picks paper, you win!");
                            userScore++;
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        } else if (computer == 2) {
                            System.out.println("CPU picks scissors too, it is a draw!");
                            System.out.println("user: " + userScore + " " + "cpu: " + cpuScore);
                        }
                        break;
                    default:
                        System.out.println("You didn't choose anything");
                }

                //when cpu or user gets to 3 points
                if (cpuScore == 3) {
                    cpuScore = 0;
                    userScore = 0;
                    System.out.println("Computer wins, play again?");
                    String playAgain = scanner.nextLine();
                    if (playAgain.toLowerCase().equals("no")) {
                        System.out.println("thanks for playing");
                        play = false;
                    }
                } else if (userScore == 3) {
                    cpuScore = 0;
                    userScore = 0;
                    System.out.println("You win! Play again?");
                    String playAgain = scanner.nextLine();
                    if (playAgain.toLowerCase().equals("no")) {
                        System.out.println("thanks for playing");
                        play = false;
                    }
                }
            } while (play);
        }


}
