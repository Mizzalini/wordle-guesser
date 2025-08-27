package com.mizzalini;

import java.util.Scanner;

public class Game {

    private final UserInterface ui;

    public Game() {
        this.ui = new UserInterface(new Scanner(System.in));
    }

    public void run() {
        ui.welcomePlayer();
        startGame();
    }

    private void startGame() {
        int numberOfGuesses = ui.getNumberOfGuesses();
        UserData userData = new UserData(numberOfGuesses);

        ui.print("Starting game with " + userData.numberOfGuesses() + " guesses already made...");
    }
}
