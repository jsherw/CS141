/* Conrad Motis (Team 7) 
    5/9/2021 
    BJP Programming Projects, Chapter 4 Problem #8 (Caesar Cipher) 
    */

import java.util.*;

public class Caesar {

    public static void main(String[] args) {

        // print out section and problem
        System.out.print("Chapter 4 Problem #8 (Caesar Cipher)\n\n");

        Scanner scnr = new Scanner(System.in);

        // original message to encode
        String originalMessage;
        // rotate each character by....
        int keyNumber;
        // message after encoding
        String outputMessage = "";

        // receive inputs
        System.out.print("Your message? ");
        originalMessage = scnr.nextLine();
        System.out.print("Encoding key? ");
        keyNumber = scnr.nextInt();

        /* Separate keys for letters or numbers and scale keys to be within range 
           This doesn't alter output, just makes ASCII math easier */

        // make sure key for letter is within -26 to 26 range to prevent ASCII issues
        int letterKey = keyNumber;
        while (Math.abs(letterKey) > 26) letterKey += -(Math.signum(letterKey) * 26);
        // make sure key for numbers is within -10 to 10 range to prevent ASCII issues
        int numberKey = keyNumber;
        while (Math.abs(numberKey) > 10) numberKey += -(Math.signum(numberKey) * 10);

        // loop each character from message, alter as needed, restack into output string
        for (int i = 0; i < originalMessage.length(); i++) {

            // for unprocessed character
            char unprocessedChar = originalMessage.charAt(i);
            // for storing processed character
            char tempContainer;

            if (Character.isLetter(unprocessedChar)) { // if character is a letter

                // offset letter by letterKey amount, must typecast for math to work
                tempContainer = (char)((int)unprocessedChar + letterKey);

                // check if original character was capital or lowercase
                if (unprocessedChar < 91) { // if uppercase

                    // if out-of-bounds, fix
                    if (tempContainer < 65) tempContainer += 26;
                    else if (tempContainer > 90) tempContainer -= 26;

                } else { // if lowercase

                    // if out-of-bounds, fix
                    if (tempContainer > 122 || tempContainer < 22) tempContainer -= 26;
                    else if (tempContainer < 97) tempContainer += 26;

                }

            } else if (Character.isDigit(unprocessedChar)) { // else if character is a number

                // offset number by numberKey amount, must typecast for math to work
                tempContainer = (char)((int)unprocessedChar + numberKey);

                // if out-of-bounds, fix
                if (tempContainer < 48) tempContainer += 10;
                else if (tempContainer > 57) tempContainer -= 10;

            } else tempContainer = unprocessedChar; // else if whitespace, or symbol, or etc, don't alter

            outputMessage += tempContainer;

        }

        System.out.println("Your message: " + outputMessage);

    }
}