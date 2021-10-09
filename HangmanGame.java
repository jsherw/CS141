/* James Sherwood (Team 7)
6/6/2021
BJP Programming Projects, Chapter 7 #2 (Hangman)
 */
import java.util.*;

public class HangmanGame {
    public static void main(String[] args) {
        int games = 0;
        int wins = 0;
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'};
        char[] reset = Arrays.copyOf(letters, letters.length);

        // Array with potential words to be used in the game
        String[] randWord = {"program", "coding", "computer", "laptop",
                    "application", "virus", "java", "arrays", "matrix",
                    "buffer"};
        System.out.println("BJP Chapter 7, #2 \"Hangman Game\"");
        System.out.println();

        System.out.println("Would you like to play a game? \n " +
                            "(Enter 'y' for yes" + " or 'n' for no.)");

        char userInput = scnr.next().charAt(0);

        while (userInput == 'y' || userInput == 'Y') {
            String gameWord = randWord[rand.nextInt(10)];
            games++;
            wins = gameInitialize(gameWord, letters, scnr);
            System.arraycopy(reset, 0, letters, 0, reset.length);
            System.out.println("Play Again? 'y'(es) or 'n'(o)?");
            userInput = scnr.next().charAt(0);
        }
        if (games > 1 && (wins == 0 || wins > 1)) {
            System.out.println("Thank you for playing! You played "
                                + games + " games and you won " + wins + " times.");
        } else if ((games == 1 && wins == 0)) {
            System.out.println("Thank you for playing! You played "
                                + games + " game and you won " + wins + " time.");
        } else {
            System.out.println("Thank you for playing! You played "
                                + games + " games and you won " + wins + " time.");
        }
    }

    //Method to turn word into an array of letters, and give user hints/instructions.
    public static int gameInitialize(String word, char[] letters, Scanner scnr) {
        int incorrect = 5;
        int right = 0;
        int wins = 0;
        char[] eachLetter = new char[word.length()];
        char[] correct = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            eachLetter[i] = word.charAt(i);
            correct[i] = '_';
        }
        System.out.println("The word I'm thinking of has " + word.length() + " letters.");
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(correct[i] + " ");
        }
        System.out.println();


        while (incorrect > 0 && right < word.length()) {
            System.out.println("Guess a letter! " +
                             "\nYou have " + incorrect + " wrong guesses remaining.");

            char userGuess = scnr.next().charAt(0);
            userGuess = Character.toLowerCase(userGuess);

            if (letterCheck(userGuess, letters) > 0) {
                if (wordCheck(userGuess, eachLetter) > 0) {
                    for (int i = 0; i < word.length(); i++) {
                        if (userGuess == eachLetter[i]) {
                            correct[i] = eachLetter[i];
                            right++;
                        }
                        System.out.print(correct[i]);
                    }
                    System.out.println();
                } else {
                    incorrect--;
                }
            } else if (letterCheck(userGuess, letters) < 1) {
                System.out.println("That letter has already been guessed, or is invalid.");
            }
            System.out.println("The remaining letters are: ");
            System.out.println(Arrays.toString(letters));
            System.out.println();
        }
        if (right == word.length()) {
            System.out.println("You win!");
            wins++;
        } else if (incorrect == 0) {
            System.out.println("Game Over! The word was " + Arrays.toString(eachLetter));
        }
        return wins;
    }

    //checks if letter has been selected already. >= 0 is a valid choice
    public static int letterCheck(char userGuess, char[] letters) {
        int count = 0;
        int placeHolder = 0;

        for (int i = 0; i < letters.length; i++) {
            if (userGuess == letters[i]) {
                placeHolder = i;
                count++;
            }
        }
        letters[placeHolder] = '_';
        if (count == 0) {
            return -1;
        } else {
            return 1;
        }
    }

    //checks if userGuess is found in the word.
    public static int wordCheck(char userGuess, char[] eachLetter) {
        int count = 0;
        for (char c : eachLetter) {
            if (userGuess == c) {
                count++;
            }
        }
        if (count > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}