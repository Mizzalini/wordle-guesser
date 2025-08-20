## Objectives
* Create a command-line tool that successfully helps a user solve a Worlde puzzle by providing next-word suggestions.
* Implement an algorithm that consistently provides high-quality word suggestions to solve the puzzle in as few turns as possible.
* Design a simple and intuitive user interface that makes the tool easy to use for anyone familiar with the rules of Wordle.

## User Journey

1. Welcome and explain purpose (hit any key to continue).
2. Ask for last guess (leave empty for first word).
3. If last guess is given, ask for results.
4. Suggest next word.
5. Asks for results.
6. Repeat steps 4 & 5 until correct word is given.

## Feature List

1. Core Wordle Logic
    * Word list initialisation
        * Load a list of all valid 5-letter Wordle words.
        * Maintain this list in an efficient data structure.
    * Word filtering algorithm
        * Reduce the list of possible remaining words

2. Suggestion Algorithm
    * Initial optimal guess
        * Programatically determine or hardcode a statistically "best" starting word that maximises information gain.
    * Next best word selection heuristic
        * **Basic:** choose a random word from the remaining possible words.
        * **Intermediate:** select a word that contains the most frequent letters among the remaining possible words (to maximise the chance of hitting new letters).
        * **Advanced:** Implement an entropy-based or information theory algorithm to pick the word that is expected to eliminate the largest number of possibilities on average.

3. CLI
    * Welcome and instructions display
        * Display an initial welcome message, explain the purpose of the tool and instructions.
    * Dynamic input prompts
        * Ask for the number of previous guesses
        * Ask for the user's last guesses (if there are previous guesses) along with their results.
        * Prompt for confirmation to restart or continue.
    * Suggested word ouput
        * Display the programs next best word suggestion.
        * Provide feedback if no guesses remain (due to contradictory input).
    * Input validation
        * Validate that the guessed word fits Wordle constraints.
        * Validate that the result string is 5 characters long and contains only `g`, `y`, or `b`.
        * Handle cases where input is not a valid word.
    * Error handling
        * Provide clear error messages for invalid input.
        * Guide the user on how to correct their input.


## Requirements

| ID   | Title                                   | User Story                                                                                       | Acceptance Criteria (Summary)                                                                                                                                                                                                                 | MoSCoW | Effort |
|------|-----------------------------------------|--------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------|--------|
| R1   | Word List Initialization                | As a user, I want the program to know all valid Wordle words so it can make accurate suggestions. | Loads full word list from external file; stored in efficient structure (e.g., ArrayList/HashSet); accessible globally or via functions.                                                                                                      | Must   | 3      |
| R2   | Word Filtering Algorithm                | As a user, when I provide feedback, I want the program to eliminate impossible words.            | Correctly filters based on Wordle rules: Green = exact position, Yellow = must exist elsewhere, Black = eliminated unless also green/yellow; handles duplicates.                                                                              | Must   | 7      |
| R3   | Initial Optimal Guess                   | As a user starting, I want the program to suggest a strong first word.                           | On first guess (blank input), outputs predefined "best" word that exists in the loaded list.                                                                                                                                                   | Must   | 2      |
| R4   | Next Best Word Selection (Basic)        | As a user, I want any valid next word from the remaining list.                                   | Suggests word from filtered list (first or random); guaranteed valid.                                                                                                                                                                         | Must   | 2      |
| R5   | Next Best Word Selection (Intermediate) | As a user, I want a better word that reveals more info.                                          | Suggests word prioritizing frequent letters across remaining words; may use helper word even if not possible answer.                                                                                                                          | Should | 5      |
| R6   | Next Best Word Selection (Advanced)     | As a power user, I want the most optimal word via advanced scoring.                              | Uses entropy/information-theory scoring to maximize reduction in remaining list; suggests highest-scoring word.                                                                                                                               | Could  | 9      |
| R7   | Welcome & Instructions Display          | As a first-time user, I want a welcome message and clear instructions.                           | Displays welcome, explains result format (g/y/b), explains first guess input rules.                                                                                                                                                           | Must   | 1      |
| R8   | Dynamic Input Prompts                   | As a user, I want guided prompts each turn.                                                      | Prompts last guess (blank = first turn), prompts result after guess, offers restart/exit after game ends.                                                                                                                                      | Must   | 3      |
| R9   | Suggested Word Output                   | As a user, I want the program to clearly show the suggested word.                                | Outputs suggestion in readable format; if no possible words remain, informs user clearly.                                                                                                                                                      | Must   | 2      |
| R10  | Input Validation (Guess)                | As a user, I want mistakes in my guess flagged immediately.                                      | Rejects if guess not 5 letters, non-alphabetic, or not in valid word list; re-prompts until valid.                                                                                                                                             | Must   | 4      |
| R11  | Input Validation (Results)              | As a user, I want mistakes in results flagged immediately.                                       | Rejects if result string not 5 chars or contains invalid chars (only g/y/b allowed); re-prompts until valid.                                                                                                                                   | Must   | 3      |
| R12  | Error Handling & Guidance               | As a user, I want clear error feedback so I can continue easily.                                 | All errors are concise, user-friendly, suggest corrections; no crashes; program gracefully handles invalid inputs and re-prompts.                                                                                                             | Must   | 2      |
