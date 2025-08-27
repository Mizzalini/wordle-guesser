package com.mizzalini;

import java.util.Scanner;

public class UserInterface {

    public void welcomePlayer() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printWelcomeMessage();

                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("i")) {
                        showInstructions(scanner);
                    }
                break;
            }
        }
    }

    private void printWelcomeMessage() {
        print("WELCOME TO THE WORDLE SOLVER!");
        print("I'm here to help you solve your daily Wordle puzzle. Just tell me your guesses and the results, and I'll suggest the next best word.");
        print("Type 'i' for instructions or press Enter to start the game.");
    }

    private void showInstructions(Scanner scanner) {
        print("HOW TO USE ME:");
        print("- For your first guess, leave the input BLANK. I'll suggest a starting word.");
        print("- Otherwise, give me your previous words one at a time. I'll then ask for the results using a simple code:");
        print("    - 'g' is for GREEN.");
        print("    - 'y' is for YELLOW.");
        print("    - 'b' is for BLACK.");
        print();
        print("For example, if you guessed RAISE and the 'A' was yellow, the 'I' was green, and the rest were grey, you would enter: 'bygbb'.");

        waitForUserToBegin(scanner);
    }

    private void waitForUserToBegin(Scanner scanner) {
        String input;
        do {
            print("Type 'OKAY' to begin!");
            input = scanner.nextLine().trim();
        } while (!input.equalsIgnoreCase("OKAY"));
    }

    private void print(String message) {
        System.out.println(message);
    }

    private void print() {
        System.out.println();
    }
}

