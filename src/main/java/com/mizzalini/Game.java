package com.mizzalini;

import java.util.Scanner;

/**
 * Main game class that handles the game flow.
 */
public class Game {

    private final UserInterface ui;

    /**
     * Constructs a new {@code Game} instance.
     */
    public Game() {
        this.ui = new UserInterface(new Scanner(System.in));
    }

    /**
     * Starts the game by welcoming the player and initiating the game loop.
     */
    public void run() {
        ui.welcomePlayer();
        startGame();
    }

    // TODO: continue to implement
    private void startGame() {
        int numberOfGuesses = ui.getNumberOfGuesses();
        UserData userData = new UserData(numberOfGuesses);

        ui.print("Starting game with " + userData.numberOfGuesses() + " guesses already made...");
    }
}
