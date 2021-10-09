/* James Sherwood (Team 7)
    5/24/2021
    BJP Programming Projects Chapter 6, Problem #2
 */
import java.util.*;
import java.io.*;
public class CompareFiles {

    //takes input from user, and evaluates if file name is valid
    public static Scanner fileOne(Scanner scnr)
            throws FileNotFoundException{
        System.out.print("Enter the name of your first file: ");
        File file1 = new File(scnr.nextLine());
        while (!file1.canRead()) {
            System.out.println("File not found. Try again.");
            System.out.print("Enter the name of your first file: ");
            file1 = new File(scnr.nextLine());
        }
        return new Scanner(file1);
    }

    //takes input from user, and evaluates if file name is valid.
    public static Scanner fileTwo(Scanner scnr)
            throws FileNotFoundException{
        System.out.print("Enter the name of your second file: ");
        File file2 = new File(scnr.nextLine());
        while (!file2.canRead()) {
            System.out.println("File not found. Try again.");
            System.out.print("Enter the name of your second file: ");
            file2 = new File(scnr.nextLine());
        }
        return new Scanner(file2);
    }

    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("BJP Programming Projects: Chapter 6, Problem #2 \n");

        //scnr to pass to methods.
        Scanner scnr = new Scanner(System.in);
        int line = 0; //line number for reporting errors
        int allGood = 0; //for keeping track of lines with no errors

        //initialize scnrs with valid file names returned from methods.
        Scanner scnr1 = fileOne(scnr);
        Scanner scnr2 = fileTwo(scnr);

        System.out.println("Differences found: ");


        //loop continues while file has a line of input to read
        while (scnr1.hasNextLine() && scnr2.hasNextLine()) {
            line++;
            String file1 = scnr1.nextLine();
            String file2 = scnr2.nextLine();

            //compare corresponding lines of two files to evaluate equality.
            if (!file1.equals(file2)) {
                System.out.println("Line " + line + ":" + "\n"
                        + "< " + file1 + "\n" + "> " + file2 +"\n");
            } else {
                allGood++;
            }
        }
        if (allGood == line){
            System.out.println("No differences found.");
        }
    }
}