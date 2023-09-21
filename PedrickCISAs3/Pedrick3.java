package PedrickCISAs3;

import java.util.Scanner;
import java.util.ArrayList;
public class Pedrick3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> BankAccounts = new ArrayList<>();
        
        int counter = 0;
        while (true){
            System.out.println("Do you want to create more accounts (Y or N): ");
            String CSInput = input.nextLine();
            if (input.next().equals("Y")){
                counter++;
                System.out.println("Is account " + counter + " a checking account or a savings account? (C or S)");
                CSInput = input.nextLine();
                if (CSInput.equals("C")){
                    System.out.print("Bank Account " + counter + " owner: ");
                    String OwnerName = input.nextLine();
                    System.out.print("Bank Account " + counter + " account number: ");
                    int AccntNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Bank Account " + counter + " balance: ");
                    Double AccntBalance = input.nextDouble();
                    input.nextLine();
                    System.out.println("Bank account " + counter + " check limit: ");
                    int CheckLimit = input.nextInt();
                    input.nextLine();
                } else if (CSInput.equals("S")){
                    System.out.print("Bank Account " + counter + " owner: ");
                    String OwnerName = input.nextLine();
                    System.out.print("Bank Account " + counter + " account number: ");
                    int AccntNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Bank Account " + counter + " balance: ");
                    Double AccntBalance = input.nextDouble();
                    input.nextLine();
                    System.out.println("Bank account " + counter + " interest rate: ");
                    Double CheckLimit = input.nextDouble();
                    input.nextLine();
                }
            } else if (input.nextLine().equals("N")){
                break;
            }
        }
    }
}


/*
 * Use a loop to ask if more bank accounts need to be created
 * then create an account, then loop back to the question
 * If the user says no more accounts to made
 * End the loop and enter search mode
 * Loop:
 * user inputs details of: type, owner, number, and balance
 * checking accnt also asks for limit on number of checks in a month
 * savings accnt also asks for the interest rate
 * 
 * Search Mode:
 * ask user for account number
 * print the accnt info
 * use "-1" to end search
 */