public class ArrayClass {
    private int num;
    private int[] numArray;

    //constructors
    public ArrayClass(){

    }
    public ArrayClass(int numbers){
        setNum(numbers);
        numArray = new int[4];
    }

    public void setNum (int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void createArray(){
        //FIXME
    }
    public String printArray(int[] numArray){
        return null; //FIXME
    }
}
