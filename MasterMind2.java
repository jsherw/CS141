/* Conrad Motis
    6/7/2021
    BJP Programming Project Chapter 7, #3
 */
import java.util.*;
public class MasterMind2 {


        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);
            Random rand = new Random();

            System.out.println("Welcome to Mastermind!\n");

            boolean exit = false;
            boolean gameover = true;
            String targetNum = "";
            String userInput = "";

            while (!exit) {

                if (gameover) {
                    int newNum = rand.nextInt(10000);
                    targetNum = String.format("%04d",newNum);
                    System.out.println("Can you guess the 4 digit number?\n(enter 'q' to quit)");
                    gameover = false;
                }

                boolean validInput = false;

                while (!validInput) {

                    System.out.print("Guess: ");

                    userInput = scnr.nextLine();
                    System.out.println();

                    if (userInput.length() > 0) {
                        if (userInput.charAt(0) == 'q' || userInput.charAt(0) == 'Q') {
                            validInput = true;
                            exit = true;
                        }

                        if (userInput.length() == 4) {
                            validInput = true;
                            for (int i = 0; i < 4; ++i) {
                                if (!Character.isDigit(userInput.charAt(i))) {
                                    validInput = false;
                                }
                            }
                        }
                    }
                }


                int rightNum = 0;
                int rightSpot = 0;

                if (userInput.length() == 4) {
                    for (int i = 0; i < 4; ++i) {
                        if (userInput.charAt(i) == targetNum.charAt(i)) rightSpot++;
                    }
                    for (int i = 0; i < 4; ++i) {
                        for (int j = 0; j < 4; ++j) {
                            if (targetNum.charAt(i) == userInput.charAt(j)) {
                                rightNum++;
                                j = 4;
                            }
                        }
                    }


                    if (rightNum == 1) {
                        System.out.println("You guessed 1 correct number.");
                    } else System.out.println("You guessed " + rightNum + " correct numbers.");
                    if (rightSpot == 1) {
                        System.out.println("1 number is in the correct place.");
                    } else System.out.println(rightSpot + " numbers are in the correct place.");
                }

                if (rightSpot == 4) {
                    System.out.print("\nYou win!!!\n\nPress Enter to play again or type 'q' to quit:");
                    gameover = true;

                    userInput = scnr.nextLine();
                    System.out.println();

                    if (userInput.charAt(0) == 'q' || userInput.charAt(0) == 'Q') {
                        exit = true;
                    }
                }

                System.out.println();
            }
        }
}
