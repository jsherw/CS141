/* James Sherwood (Team 7)
    5/2/2021
    BJP Programming Projects, Chapter 3 Problem #1
    */
public class ChristmasTrees {
    // fields for tree sizes
    public static final int SEGMENTS = 3;
    public static final int HEIGHT = 4;

    public static void main(String[] args) {
        System.out.println("Chapter 3, Problem 1: Christmas Trees");
        buildChristmasTree();
    }
        /* for loops to build tree that scales to segment
        and height specifications */
    public static void buildChristmasTree() {
        int maxSize = 2 * HEIGHT + 2 * SEGMENTS - 3;
        for (int i = 1; i <= SEGMENTS; i++) {
            for (int line = 1; line <= HEIGHT; line++) {
                StringBuilder asteriskString = new StringBuilder();
                for (int j = 1; j <= 2 * line + 2 * i - 3; j++) {
                    asteriskString.append("*");
                }
                for (int space = 0; space <= maxSize - (HEIGHT + line + i); space++) {
                    asteriskString.insert(0, " ");
                }
                System.out.println(asteriskString);
            }
        }
            // loops to create tree trunk and stand
        for (int i = 0; i <= maxSize / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i <= maxSize / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i <= maxSize / 2 - 3; i++) {
            System.out.print(" ");
        }
        System.out.println("*******");
    }
}
