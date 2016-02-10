package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        int randomNum = generator.nextInt(101);

        boolean userWin = false;
        while(!userWin) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a guess: ");
            int guess = Integer.parseInt(input.next());
            if (guess == randomNum) {
                System.out.println("You guessed right!");
                userWin = true;
            } else if (guess > randomNum) {
                System.out.println("You guessed too high!");
            } else {
                System.out.println("You guessed too low!");
            }
        }
    }
}
