import java.util.Scanner;
public class StringOp {
    public static void main(String[] args){
        String s1,s2;

        Scanner scnr = new Scanner(System.in);
        //Prompts for two string inputs
        System.out.println("enter 2 strings");
         // first line of input
        s1 = scnr.nextLine();
         //second line of input
        s2 = scnr.nextLine();
        //find length of strings
        int l1 = s1.length();
        int l2 = s2.length();

        String s3 = s1 + s2;
        System.out.println("String 1 length is : " + l1);
        System.out.println("String 2 length is : " + l2);

        //convert string to upper case
        s1 = s1.toUpperCase();
        System.out.println("First string in upper case: " + s1);
    }
}
