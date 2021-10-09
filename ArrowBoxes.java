/* James Sherwood (Team 7)
    4/3/21
    Week 3 BJP Team Exercises: Chapter 2 Problem 2
 */
public class ArrowBoxes {
    public static void main(String[] args){
        System.out.println("Chapter 2, problem 2");
        System.out.println();
        fullTopBox();
        fullBottomBox();
    }
    //method to build top box
    public static void fullTopBox() {
        drawLine();
        topBoxHalf();
        topBoxHalf();
        drawLine();
    }
    //method to build bottom box
    public static void fullBottomBox() {
        bottomBoxHalf();
        bottomBoxHalf();
        drawLine();
    }
    //method forming half of bottom box
    public static void bottomBoxHalf(){
        for (int line = 1; line <= 3; line++){
            System.out.print("|");

            //int for equation of exterior spaces.
            int spaceEquationExt = (line - 1);

            for (int i = 1; i <= (spaceEquationExt); i++){
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 1; j <= (-2 * line + 6); j++){
                System.out.print(" ");
            }
            System.out.print("V");
            for (int k = 1; k <= (spaceEquationExt); k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    //method for half of top box
    public static void topBoxHalf() {
        for (int line = 1; line <= 3; line++){
            System.out.print("|");

            //int for equation of exterior spaces
            int spaceEquationExt = (-1 * line + 3);

            for (int i = 1; i <= (spaceEquationExt); i++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 1; j <= (2 * line - 2); j++){
                System.out.print(" ");
            }
            System.out.print("^");
            for (int k = 1; k <= (spaceEquationExt); k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    //method for drawing a line
    public static void drawLine() {
        System.out.print("+");
        for (int i = 0; i < 6; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}