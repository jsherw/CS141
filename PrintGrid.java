public class PrintGrid {
    public static void main(String[] args)
    {

        //Initializing values to 1 as start day
        int Day=1, preRecieved=1;
        int totalPresents=1;

        /*Display day, presents and total presents*/
        System.out.println("Day \t Presents \t totalPresents");
        System.out.println(Day + "\t "+preRecieved+ "\t\t" + totalPresents);

        /* Loop repeats for 12 days*/
        for(Day=2;Day<=12;Day++)
        {
            /*Accumulating previous present to
            current day presents*/
            totalPresents=totalPresents+Day;
            preRecieved=Day;
            //Display value
            System.out.println(Day + "\t"
                    +preRecieved+"\t\t"+totalPresents);
        }
    }
}
