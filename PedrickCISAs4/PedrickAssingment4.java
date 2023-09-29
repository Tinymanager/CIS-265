package PedrickCISAs4;

import java.util.ArrayList;
import java.util.Scanner;

public class PedrickAssingment4 {
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
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 4
 * Description: Reading and Printing Bank Accounts on files
 */


/*
 * Read the first text file
 * Store the accounts in an ArrayList
 * 
 * 
 * I/O exceptions are checked exceptions
 * So the main class must handle exceptions
 * Can use the try/catch or throw IOException
 * To throw exceptions, declare as:
 * public static void main(String[] args) throws IOException
 * 
 * Program must close both input and output files after they are done
 * unless they are put in the try-with-resource block
 * You can assume that input file has the correct format
 */