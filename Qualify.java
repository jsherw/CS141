
    /* George Ramos (Team 7)
    5/11/2021
    BJP Programming Projects, Chapter 4
Problem #3
 */
import java.util.Scanner;
public class Qualify {
        public static void main(String[] args)
        {
            double GPA1, SAT1, ACT1;
            double GPA2, SAT2, ACT2;
            //Declaring scanner object
            Scanner input = new Scanner(System.in);

            //Inputting scores of student1
            System.out.println("Enter Student 1 scores ");
            System.out.println("Enter GPA: ");
            GPA1 = input. nextDouble();
            System.out.println("Enter SAT: ");
            SAT1 = input. nextDouble();
            System.out.println("Enter ACT:");
            ACT1 = input. nextDouble();

            //Inputting scores of student2
            System.out.println("Enter Student 2 scores ");
            System.out.println("Enter GPA: ");
            GPA2 = input. nextDouble();
            System.out.println("Enter SAT: ");
            SAT2 = input.nextDouble();
            System.out.println("Enter ACT:");
            ACT2 = input. nextDouble();

        /*Assuming that the sum of three scores
              should be grater than 190 */
            if(ACT1+GPA1+SAT1>(ACT2+GPA2+SAT2)
                    &&(ACT1+GPA1+SAT1>190))
                System.out.println("Student 1 Qualified exam");
            else if (ACT2+GPA2+SAT2>(ACT1+GPA1+SAT1)
                    &&(ACT2+GPA2+SAT2>190))
                System.out.println("Student 2 Qualified exam");
            else
                System.out.println("None Qualified exam!!");
        }
}
