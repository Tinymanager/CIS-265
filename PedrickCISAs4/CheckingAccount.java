package PedrickCISAs4;

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
    
    public static void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
        System.out.println("Check Limit: " + CheckLim);
    }
}


/*
 * Same as last time other than:
 * must override the printBankAccount(PrintWriter pw) method
 * 
 * Also need to fix the overriding part
 */