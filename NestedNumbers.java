public class NestedNumbers {
    public static void main(String[] args){
        nestedNumbers();
    }
    public static void nestedNumbers(){
        for (int line = 1; line <= 3; line++){
            for (int i = 0; i <= 9; i++){
                System.out.print("" + i + i + i);
            }
            System.out.println();
        }
    }
}
