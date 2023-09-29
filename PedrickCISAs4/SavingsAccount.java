package PedrickCISAs4;

public class SavingsAccount extends BankAccount{
    protected Double AccntInterest;

    protected SavingsAccount() {}

    public SavingsAccount(String OwnerN, int AccntNum, Double AccntBal, Double Interest){
        //call the BankAccount parameter constructor
        this.OwnerName = OwnerN;
        this.AccntNumber = AccntNum;
        this.AccntBalance = AccntBal;
        this.AccntInterest = Interest;
    }

    public static void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal, Double Interest){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
        System.out.println("Interest: " + Interest);
    }
}


/*
 * Same as last time other than:
 * Needs to override the printBankAccount(PrintWriter pw) method
 * 
 * Also need to fix the overriding
 */