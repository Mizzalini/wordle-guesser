package com.mizzalini;

public class Game {

    UserInterface ui = new UserInterface();

    public void welcomePlayer() {
        ui.welcomePlayer();
    }

    public void startGame() {
        System.out.println("GAME STARTED");
    }
}
