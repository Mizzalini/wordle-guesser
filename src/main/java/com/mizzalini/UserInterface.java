package com.mizzalini;

import java.util.Scanner;

public class UserInterface {

    public void welcomeMessage() {
        Scanner sc = new Scanner(System.in);

        print("WELCOME TO THE WORDLE SOLVER!");
        print("I'm here to help you solve your daily Wordle puzzle. Just tell me your guesses and the results, and I'll suggest the next best word.");

        print("Type 'i' if you need instructions. Leave it blank to get your next best word.");
        
        switch (sc.next()) {
            case "i":
                instructions(sc);
                break;
            default:
                print("GAME STARTED");
        }

        sc.close();
    }

    private void instructions(Scanner sc) {
        print("HOW TO USE ME:");
        print("- For your first guess, leave the input BLANK. I'll suggest a starting word.");
        print("- Otherwise, give me your previous words one at a time. I'll then ask for the results using a simple code:");
        print("    - 'g' is for GREEN.");
        print("    - 'y' is for YELLOW.");
        print("    - 'b' is for BLACK.");
        print();
        print("For example, if you guessed RAISE and the 'A' was yellow, the 'I' was green, and the rest were grey, you would enter: 'bygbb'.");
        print("Type 'OKAY' to begin!");

        // TODO: don't allow user to just press ENTER

        while (!(sc.next().toUpperCase().equals("OKAY"))) {
            print("Type 'OKAY' to begin!");
        }

        print("GAME STARTED");
    }

    private void print(String message) {
        System.out.println(message);
    }

    private void print() {
        System.out.println();
    }
}

