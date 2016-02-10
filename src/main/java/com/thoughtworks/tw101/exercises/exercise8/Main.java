package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        int randomNum = generator.nextInt(101);

        boolean userWin = false;
        ArrayList<Integer> userGuesses = new ArrayList<Integer>();
        while(!userWin) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a guess: ");
            try {
                int guess = Integer.parseInt(input.next());
                userGuesses.add(guess);
                if (guess == randomNum) {
                    System.out.println("You guessed right!");
                    for(int userGuess : userGuesses) {
                        System.out.println("You guessed: " + userGuess);
                    }
                    userWin = true;
                } else if (guess > randomNum) {
                    System.out.println("You guessed too high!");
                } else {
                    System.out.println("You guessed too low!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Sorry, we couldn't parse your input! Please try again.");
            }

        }
    }
}
