import java.util.Scanner;
public class PedrickCIS265As1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredValue = 0;
        int ACount=0;
        int BCount=0;
        int CCount=0;
        int FCount=0;
        while(enteredValue != -1){
            System.out.println("Enter a grade (enter a -1 to quit)");
            enteredValue = input.nextInt();
            if (enteredValue>=90 && enteredValue<=100){
                ACount++;
            } else if (enteredValue>=80 && enteredValue<=89){
                BCount++;
            } else if (enteredValue>=70 && enteredValue<=79){
                CCount++;
            } else if (enteredValue>=0 && enteredValue<=69){
                FCount++;
            } else {
                System.out.println(enteredValue + " is not a valid grade. A valid grade is 0-100");
            }
        }
        System.out.println("No. of A grades (90-100): " + ACount);
        System.out.println("No. of B grades (80-89): " + BCount);
        System.out.println("No. of C grades (70-79): " + CCount);
        System.out.println("No. of F grades (0-69): " + FCount);
    }
}

/*
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 1
 * Description: Calculating grade letters from numbers
 */