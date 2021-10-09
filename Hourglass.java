/* Conrad Motis (Team 7)
    4/23/2021 
    BJP Programming Projects, Chapter Two Problem 4 
 */

public class Hourglass {
    public static void main(String[] args) {
        // print problem #
        System.out.println("Chapter 2, Problem 4\n");

        // prep drawing symbols
        String theSides[] = {"\\", "/","\\", "|", "|"};
        String theFiller[] = {"\"",":"};

        // cycle through hourglass layers from top to bottom
        for (int i = 0; i < 11; i++) {

            // prep indexes to access correct characters during draw
            int sideIndex = 0;
            int fillIndex = 0;
            if (i == 0 || i == 10 || i == 5) {
                sideIndex = 3;
                fillIndex = 1;
            }
            else if (i > 5) sideIndex = 1;

            // draw next hourglass layer
            for (int j = 0; j < 5 - Math.abs(i-5); j++) System.out.print(" ");
            System.out.print(theSides[sideIndex]);
            for (int j = 0; j < 2 * Math.abs(i-5); j++) System.out.print(theFiller[fillIndex]);
            System.out.println(theSides[sideIndex + 1]);


        }
    }
}