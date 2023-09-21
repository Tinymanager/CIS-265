package PedrickCISAs3;

public class CheckingAccount extends BankAccount{
    protected int CheckLimit;

    protected CheckingAccount() {}

    public CheckingAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        //call the BankAccount parameter constructor
        this.OwnerName = OwnerN;
        this.AccntNumber = AccntNum;
        this.AccntBalance = AccntBal;
        this.CheckLimit = CheckLim;
    }
    
    public void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
        System.out.println("Check Limit: " + CheckLim);
    }
}


/*
 * Extends the BankAccount class
 * must have a no-arg constructor
 * a 4 parameter constructor: string, int, double, int
 * the constructor with parameters must call the BankAccount's constructor
 * must also override the printBankAccount() to print its owner, number, balance, and checklimit
 */