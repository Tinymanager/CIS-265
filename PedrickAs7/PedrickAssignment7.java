package PedrickAs7;

import java.util.*;
import java.io.*;

public class PedrickAssignment7 {
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length != 2){
            System.out.println("Usage: PedrickAs7.PedrickAssignment7.java input_file output_file");
            System.exit(1);
        }
        ArrayList<BankAccount> BankAccounts = new ArrayList<>();
        
        File inputFile = new File(args[0]);
        if (!inputFile.exists()){
            System.out.println("Input file " + args[0] + " was not found");
            System.exit(2);
        }

        Scanner fileInput = new Scanner(inputFile);
        //.useDelimiter("\\W+")

        while(fileInput.hasNextLine()){
            String line = fileInput.nextLine();
            String[] splitter = line.split(",");
            String ownerName = splitter[0];
            int accountNumber = Integer.parseInt(splitter[1]);
            double balance = Double.parseDouble(splitter[2]);
            String accountType = splitter[3];
            if (accountType.equals("checking")){
                int CheckLimit = Integer.parseInt(splitter[4]);
                CheckingAccount checkingAccount = new CheckingAccount(ownerName, accountNumber, balance, CheckLimit);
                BankAccounts.add(checkingAccount);
            } else if(accountType.equals("savings")){
                double AccntInterest = Double.parseDouble(splitter[4]);
                SavingsAccount savingsAccount = new SavingsAccount(ownerName, accountNumber, balance, AccntInterest);
                BankAccounts.add(savingsAccount);
            }
        }
        fileInput.close();

        AccountNumberComparator accntcompare = new AccountNumberComparator();
        Collections.sort(BankAccounts, accntcompare);

        PrintWriter output = new PrintWriter(args[1]);
        for (BankAccount account : BankAccounts){
            output.println(account.toString());
        }
        output.close();
        
    }
}

/*
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 7
 * Description: Reading and Printing Sorted Bank Accounts on files
 */