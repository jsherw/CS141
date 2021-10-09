public class numbersOutputConstant {
public static final int LINE_CONSTANT = 6;
public static final int NUM_CONSTANT = 10;
    public static void main(String[] args){
        spacedLines();
        numbers();
    }
    public static void spacedLines(){
        for (int i = 1; i <= LINE_CONSTANT; i++){
            for (int j = 1; j < NUM_CONSTANT; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    public static void numbers(){
        for (int i = 0; i <= LINE_CONSTANT; i++){
            for (int j = 1; j < NUM_CONSTANT; j++){
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
