package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by samanthastilson on 17/02/2016.
 */
public class RandomNumberGame {
    private Integer randomNum;

    public Integer randomNumberGenerator() {
        Random generator = new Random();
        Integer randomNum = generator.nextInt(101);
        return randomNum;
    }

    public RandomNumberGame() {
        this.randomNum = randomNumberGenerator();
    }

    public void playGame() {
        boolean userWin = false;
        ArrayList<Integer> userGuesses = new ArrayList<Integer>();
        while(!userWin) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a guess: ");
            try {
                int guess = Integer.parseInt(input.next());
                userGuesses.add(guess);
                if (guess == this.randomNum) {
                    System.out.println("You guessed right!");
                    for(int userGuess : userGuesses) {
                        System.out.println("You guessed: " + userGuess);
                    }
                    userWin = true;
                } else if (guess > this.randomNum) {
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
