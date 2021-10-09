public class DollarFigure {
    public static void main(String[] args){
    starsEdge();

    }
    public static final int MAX_DOLLAR = 3;
    public static void starsEdge(){
        for (int line = 1; line <= MAX_DOLLAR; line++ ){
            for (int i = 1; i <= (2 * line - 2); i++){
                System.out.print("*");
            }
            for(int i = 0; i <= (MAX_DOLLAR - line); i++){
                System.out.print("$");
            }
            for (int i = 0; i <= ((2 * MAX_DOLLAR + 1) - (2 * line)); i++){
                System.out.print("*");
            }
            for(int i = 0; i <= (MAX_DOLLAR - line); i++){
                System.out.print("$");
            }
            for (int i = 1; i <= (2 * line - 2); i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
