/* James Sherwood
    5/18/2021
    BJP Programming Problems: Ch. 5, Problem #3
 */
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // variables for tracking user data.
        int userNum;
        int totalGuess = 0;
        int gamesPlayed = 0;


        System.out.println("BJP Chapter 5, Problem #3: Guessing Game");
        System.out.println();
        System.out.println("Let's play a game! I'm thinking of an integer between 1 and 100, can you guess it?\n" +
                "Type \"quit\" to stop playing.");

        userNum = getGuess(scnr);
        gameMechanics(userNum, scnr, totalGuess, gamesPlayed);

    }
    //Takes int within correct parameters, compares to random number, reports result.
    public static void gameMechanics(int userNum, Scanner scnr, int totalGuess, int gamesPlayed){
        //generate random int 1 - 100, stores in correctNum.
        Random random = new Random();
        //variable declaration
        int correctNum = random.nextInt(100) + 1;
        int guessNum = 1;
        if (userNum != -1) {
            // gives hints for incorrect guesses.
            while (userNum != correctNum) {
                if (userNum > correctNum) {
                    System.out.println("Too high, think smaller!");
                } else {
                    System.out.println("Too low, think bigger!");
                }
                userNum = getGuess(scnr);
                guessNum++;
            }
            System.out.println("You got it! It only took you " + guessNum + " " + "attempts this game!");
            totalGuess += guessNum;
            gamesPlayed++;
            System.out.print("Would you like to play again? Type \"yes\"");
            if (scnr.next().equalsIgnoreCase("yes")) {
                userNum = getGuess(scnr);
                gameMechanics(userNum, scnr, totalGuess, gamesPlayed);
            } else {
                System.out.println("You played " + gamesPlayed + " games, with a total of "
                                    + totalGuess + " guesses.");
                avgGuesses(totalGuess, gamesPlayed);
            }
        } else {
            System.out.println("You played " + gamesPlayed + " games.");
            avgGuesses(totalGuess, gamesPlayed);
        }
    }
    //takes total guesses and divides by total games played.
    public static void avgGuesses(int totalGuesses, int totalGames) {
        double avgGuesses = (double)totalGuesses / (double)totalGames;
        if (totalGames > 0) {
            System.out.printf("On average, it took you %.1f attempts to guess correctly.", avgGuesses);
        }
    }

    //evaluates if user integer is within the proper range
    public static int getGuess(Scanner scnr){
        int guess = getInt(scnr, "Your guess? ");
        if (guess == -1) {
            return -1; // value to quit program.
        } else {
            while (guess < 1 || guess > 100) {
                if (guess < 1) {
                    System.out.println("Number must be greater than 0.");
                } else {
                    System.out.println("Number must be less than 101.");
                }
                guess = getInt(scnr, "Your guess? ");
            }
        }
        return guess; //value will be between 1 and 100.
    }

    //Prompts the user for an integer, evaluates whether input is an integer or not.
    public static int getInt(Scanner scnr, String prompt) {
        System.out.print(prompt);
        while (!scnr.hasNextInt()) {
            String invalidInput = scnr.nextLine();
            if (invalidInput.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                return -1; //value to quit program.
            } else {
                System.out.println("Try again with an integer (non-decimal) between 1 and 100!");
                System.out.print(prompt);
            }
        }
        int userInt = scnr.nextInt();
        if (userInt == -1) {
            System.out.println("Number must be greater than 0.");
            getGuess(scnr);
        }
        return userInt;
    }
}