package com.mizzalini;

import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void welcomePlayer() {
        printWelcomeMessage();
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("i")) {
                showInstructions();
            }
    }

    public int getNumberOfGuesses() {
        int numberOfGuesses = 0;

        while (true) {
            print("How many guesses have you made already?");
            String input = scanner.nextLine().trim();
            
            try {
                numberOfGuesses = Integer.parseInt(input);

                if (numberOfGuesses < 0 || numberOfGuesses > 4) {
                    print("You must enter a valid number between 0 and 4 inclusive.");
                    print("Please try again");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                print("You must enter a valid number between 0 and 4 inclusive.");
                print("Please try again");
            }
        }

        return numberOfGuesses;
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void print() {
        System.out.println();
    }

    private void printWelcomeMessage() {
        print("WELCOME TO THE WORDLE SOLVER!");
        print("I'll help you solve your daily Wordle.");
        print("Type 'i' for instructions or press Enter to start.");
    }

    private void showInstructions() {
        print("HOW TO USE ME:");
        print("- First guess: leave blank, I'll suggest a starting word.");
        print("- Then enter your guess + feedback (g=green, y=yellow, b=black).");
        print("Example: 'RAISE' -> feedback 'bygbb'");
        waitForUserToBegin();
    }

    private void waitForUserToBegin() {
        String input;
        do {
            print("Type 'OKAY' to begin!");
            input = scanner.nextLine().trim();
        } while (!input.equalsIgnoreCase("OKAY"));
    }
}

