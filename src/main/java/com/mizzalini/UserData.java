package com.mizzalini;

public record UserData(int numberOfGuesses) {
    public UserData {
        if (numberOfGuesses < 0 || numberOfGuesses > 4) {
            throw new IllegalArgumentException("Number of guesses must be between 0 and 4 inclusive.");
        }
    }
}
