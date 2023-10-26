package PedrickAs7;

import java.util.Comparator;

public class AccountNumberComparator implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount a1, BankAccount a2){
        return Integer.compare(a1.getAccountNumber(), a2.getAccountNumber());
    }
    
}

/*
 * implement the Comparator interface
 * and override the compare() method
 * 
 * Compare method:
 * public int compare(BankAccount a1, BankAccount a2)
 * returns a negative int, 0, or positive int 
 * if a1s accnt number is less, equals, or greater than a2
 * 
 * To sort the ArrayList, create a AccountNumberComparator object
 * and use it in the Collections sort method:
 * AccountNumberComparator ancomp = new AccountNumberComparator();
 * Collections.sort(accounts, ancomp); //accounts is an ArrayList of bank accounts
 * 
 */