/* James Sherwood (Team 7)
    6/7/2021
    BJP Practice Project Chapter 7, Problem #3
 */
import java.util.Random;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scnr = new Scanner(System.in);
        int win;
        int games = 0;

        System.out.println("BJP Programming Project Chapter 7, Problem #3. Mastermind.");
        System.out.println();

        //intro
        System.out.println("Hello! Let's play Mastermind!");
        System.out.println("I'm thinking of a number between 1000 and 9999.");
        System.out.println("Guess a 4 digit number, and I'll give you " +
                "hints to find the correct number!");

        System.out.println("Ready? y(es) or n(o)");
        char userInput = scnr.next().charAt(0);

        while (userInput == 'y' || userInput == 'Y') {
            int gameNum = ran.nextInt(10000);
            if (gameNum < 1000) {
                gameNum += 1000;
            }

            win = gameInitial(gameNum, scnr);
            games++;
            System.out.println("You've played " + games + " and you've won " + win + " times");
            System.out.println("Play again? y(es) or n(o).");
            userInput = scnr.next().charAt(0);

        }
    }

    public static int gameInitial(int gameNum, Scanner scnr) {
        System.out.println("number is " + gameNum); //to make demonstration easier.
        int[] gameArray = new int[4];
        int win = 0;
        int rightSpot = 0;

        for (int i = 3; i > -1; i--) {  //turning 4 digit input into array.
            gameArray[i] = gameNum % 10;
            gameNum /= 10;
        }

        System.out.println("Okay, I'm ready! Guess a 4 digit number.");

        int userNum = scnr.nextInt();

        while (rightSpot < 4) {
            //reset values each time through the loop
            rightSpot = 0;

            int[] userArray = new int[(int) Math.log10(userNum) + 1]; //creates an array equal to digits in user input.

            //checks that user array is correct length
            if (userArray.length == 4) {
                for (int i = 3; i > -1; i--) {
                    userArray[i] = userNum % 10;
                    userNum /= 10;
                }
                //checking which digits are correctly located
                for (int i = 0; i < gameArray.length; i++) {
                    if(userArray[i] == gameArray[i]){
                        rightSpot++;
                    }
                }
                //numberCheck method determines how many digits the user correctly guessed.
                System.out.println("You guessed " + numberCheck(userArray, gameArray)
                                + " digits correct. " + rightSpot
                                + " of your digits were in the correct place.");
                if (rightSpot == 4) { //win condition
                    System.out.println("You win!");
                    win++;
                } else {
                    System.out.println("Guess again: ");
                    userNum = scnr.nextInt();
                }
            } else {
                System.out.println("Please enter a 4 digit number");
                userNum = scnr.nextInt();
            }
        }
        return win;
    }

    //checks if any userNum appears in gameArray
    public static int numberCheck(int[] userNum, int[] gameArray) {
        int[] count = {1, 1, 1, 1};
        int[] tracker = {-1,-1,-1,-1};
        int matches =0;

        //determine duplicate numbers in user input to avoid over counting.
        if (userNum[0] == userNum[1]) {
            count[0]++;
        }
        if (userNum[0] == userNum[2]) {
            count[0]++;
        }
        if (userNum[0] == userNum[3]) {
            count[0]++;
        }
        if (count[0] < 4) {
            if (userNum[1] == userNum[2] && userNum[0] != userNum[2]) {
                count[1]++;
            }
            if (userNum[1] == userNum[3] && userNum[0] != userNum[3]) {
                count[1]++;
            }
        }
        if (count[1] < 3 && count[0] < 4) {
            if (userNum[2] == userNum[3] && userNum[0] != userNum[3]) {
                count[2]++;
            }

        }
        //determine if each userNum matches any num in the array.
        //tracker[i] assigns the index number of the matched number to the location it matched.
        if (userNum[0] == gameArray[0] || userNum[0] == gameArray[1] ||
                userNum[0] == gameArray[2] || userNum[0] == gameArray[3]){
            for (int i = 0; i < gameArray.length; i++){
                if (userNum[0] == gameArray[i]){
                    tracker[i] = 0;
                }
            }
        } if(userNum[1] == gameArray[0] || userNum[1] == gameArray[1] ||
                userNum[1] == gameArray[2] || userNum[0] == gameArray[3]){
            for (int i = 0; i < gameArray.length; i++) {
                if (userNum[1] == gameArray[i]) {
                    tracker[i] = 1;
                }
            }
        } if(userNum[2] == gameArray[0] || userNum[2] == gameArray[1] ||
                userNum[2] == gameArray[2] || userNum[2] == gameArray[3]){
            for (int i = 0; i < gameArray.length; i++) {
                if (userNum[2] == gameArray[i]) {
                    tracker[i] = 2;
                }
            }
        } if(userNum[3] == gameArray[0] || userNum[3] == gameArray[1] ||
                userNum[3] == gameArray[2] || userNum[3] == gameArray[3]){
            for (int i = 0; i < gameArray.length; i++) {
                if (userNum[3] == gameArray[i]) {
                    tracker[i] = 3;
                }
            }
        }
        //if any int in tracker[] is > -1, it's a match.
        for (int j : tracker) {
            if (j > -1) {
                matches++;
            }
        }
        return matches;
    }
}
