package PedrickCISAs3;

import java.util.Scanner;
import java.util.ArrayList;
public class Pedrick3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> BankAccounts = new ArrayList<>();
        String userInput;
        int counter = 0;
        while (true){
            System.out.println("Do you want to create more accounts (Y or N): ");
            userInput = input.nextLine();
            if (userInput.equals("Y")){
                counter++;
                System.out.println("Is account " + counter + " a checking account or a savings account? (C or S)");
                userInput = input.nextLine();
                if (userInput.equals("C")){
                    System.out.print("Bank Account " + counter + " owner: ");
                    String OwnerName = input.nextLine();
                    System.out.print("Bank Account " + counter + " account number: ");
                    int AccntNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Bank Account " + counter + " balance: ");
                    Double AccntBalance = input.nextDouble();
                    input.nextLine();
                    System.out.print("Bank account " + counter + " check limit: ");
                    int CheckLimit = input.nextInt();
                    input.nextLine();
                    BankAccounts.add(new CheckingAccount(OwnerName, AccntNumber, AccntBalance, CheckLimit));
                } else if (userInput.equals("S")){
                    System.out.print("Bank Account " + counter + " owner: ");
                    String OwnerName = input.nextLine();
                    System.out.print("Bank Account " + counter + " account number: ");
                    int AccntNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Bank Account " + counter + " balance: ");
                    Double AccntBalance = input.nextDouble();
                    input.nextLine();
                    System.out.print("Bank account " + counter + " interest rate: ");
                    Double Interest = input.nextDouble();
                    input.nextLine();
                    BankAccounts.add(new SavingsAccount(OwnerName, AccntNumber, AccntBalance, Interest));
                }
            } else if (userInput.equals("N")){
                break;
            }
        }

        //Accnt Searching
        int searchInput;
        while (true){
            System.out.println("Enter an account number to search (enter -1 to quit): " );
            searchInput = input.nextInt();
            if (searchInput == -1){
                break;
            } else {
                for (int i=0; i<BankAccounts.size(); i++){
                    //Object TempAccnt = BankAccounts.get(i);
                    int TAccntNum = BankAccounts.get(i).getNumber();
                    if (TAccntNum == searchInput){
                        BankAccounts.get(i).PrintBankAccount(BankAccounts.get(i).OwnerName, BankAccounts.get(i).AccntNumber, BankAccounts.get(i).AccntBalance);
                    }
                }
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