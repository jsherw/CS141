/* James Sherwood (Team 7)
    5/11/21
    BJP Programming Projects, Ch. 4 # 7
 */
public class PascalTriangle {
    public static void main(String[] args){
        System.out.println("BJP Ch. 4 #7 (Pascal's Triangle)");
       pascTri();
    }
    //builds triangle
    public static void pascTri(){
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11 - i; j++){
                //leading spaces
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                //printf formats spaces between digits
                System.out.printf("%4d", (ncr(i, k)));
            }
            System.out.println();
        }
    }

    public static int fac(int num){
        int factorial;

        for(factorial = 1; num > 1; num --){
            factorial *= num;
        }
        return factorial;
    }
        //for formula n! / r! * (n - r)!

    public static int ncr(int n, int r){
        return fac(n) / (fac (n-r) * fac(r));
    }
}
