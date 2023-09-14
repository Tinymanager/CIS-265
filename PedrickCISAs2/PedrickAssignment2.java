package PedrickCISAs2;
import java.util.Scanner;
public class PedrickAssignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] BankAccount;
        while (true){
            System.out.println("Please input the number of bank accounts to create (1-10): ");
            int numinput = input.nextInt();
            input.nextLine();
            if (numinput >0 && numinput <11){
                BankAccount = new BankAccount[numinput];
                break;
            } else {
                System.out.println("I cannot create " + numinput + " bank accounts!");
            }
        }
        for (int i=0; i<BankAccount.length; i++){
            //Take the inputs for the details
            System.out.print("Bank Account " + (i+1) + " owner: ");
            String OwnerName = input.nextLine();
            System.out.print("Bank Account " + (i+1) + " account number: ");
            int AccntNumber = input.nextInt();
            input.nextLine();
            System.out.print("Bank Account " + (i+1) + " balance: ");
            Double AccntBalance = input.nextDouble();
            input.nextLine();
            BankAccount[i] = new BankAccount(OwnerName, AccntNumber, AccntBalance);
        }
        //Search the array after the accounts are done being made
        while (true){
            System.out.println("Enter an account number to search (enter -1 to quit): ");
            int accntInput = input.nextInt();
            if (accntInput == -1){
                System.out.println("Goodybe!");
                break;
            }
            BankAccount BnkAccnt = new BankAccount();
            for (int i=0; i<BankAccount.length; i++){
                if (BankAccount[i].AccntNumber == accntInput){
                    BnkAccnt.PrintBankAccount(BankAccount[i].OwnerName, BankAccount[i].AccntNumber, BankAccount[i].AccntBalance);
                }
            }
        }
        
    }

}

/*
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 2
 * Description: Creating and Searching Bank Accounts
 */