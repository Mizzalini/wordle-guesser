package com.mizzalini;

/**
 * Stores user-specific data.
 */
public record UserData(int numberOfGuesses) {

    /**
     * Creates a new {@code UserData} instance.
     * 
     * @param numberOfGuesses the number of guesses the user has already made (0-4 inclusive)
     * @throws IllegalArgumentException if {@code numberOfGuesses} is outside the range 0-4
     */
    public UserData {
        if (numberOfGuesses < 0 || numberOfGuesses > 4) {
            throw new IllegalArgumentException("Number of guesses must be between 0 and 4 inclusive.");
        }
    }
}
