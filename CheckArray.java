public class CheckArray extends ArrayClass {
    private int correctNum;
    private int correctSpaces;
    private int[] cpuArray;
    private int[] userArray;
    private String report;

    public CheckArray(int[] numArray1, int[] numArray2){

    }
    public void setCpuArray(int[] array){
        //FIXME copy cpu array over
    }
    public void setUserArray(){
        //FIXME copy userArray
    }
    public void setCorrectNum(int num){
        this.correctNum = num;
    }
    public int getCorrectNum(){
        return correctNum;
    }
    public void setCorrectSpaces(int num){
        this.correctSpaces = num;
    }
    public int getCorrectSpaces(){
        return correctSpaces;
    }
    public void checkArray(int[] cpuArray, int[] userArray){

    }
    public String report(){
        return null; //FIXME (Should print #correct and #spacesCorrect)
    }
}
