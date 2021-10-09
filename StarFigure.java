public class StarFigure {
    public static void main(String[] args){
        starShape();
    }
    public static final int STARMAX = 3;
    public static void starShape(){
        for (int line = 1; line <= STARMAX; line++){
            for(int i = 1; i <= (4 * STARMAX - (4 * line)); i++){
                System.out.print("/");
            }
            for(int j = 1; j <= (8 * line - 8); j++){
                System.out.print ("*");
            }
            for (int k = 1; k <= (4 * STARMAX - (4 * line)); k++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
