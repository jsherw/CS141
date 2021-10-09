/* George Ramos (Team 7)
    5/24/2021
    BJP Programming Projects, Chapter 6
Problem #1
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class CountingWords {

    public static void main(String[] args) throws IOException {
        File file = new File("count.txt");
        if(file.exists()){
            Scanner scan = new Scanner(file);
            int wordCount = 0;
            int totalChar = 0;
            int lineCount = 0;
            String sCurrentLine;
            while (scan.hasNextLine()) {
                sCurrentLine = scan.nextLine();
                lineCount++;
                String[] words = sCurrentLine.split("\\s+");
                wordCount = wordCount + words.length;
                for (String word : words) {
                    totalChar = totalChar + word.length();
                }
            }
            System.out.println("Total lines = "+lineCount);
            System.out.println("Total words = "+wordCount);
            System.out.println("Total chars = "+totalChar);
        }
        else{
            System.out.println("File does not exist.");
        }
    }
}
