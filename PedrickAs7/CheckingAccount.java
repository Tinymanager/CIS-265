package PedrickAs7;

public class CheckingAccount extends BankAccount {
    protected int CheckLimit;

    protected CheckingAccount() {}

    public CheckingAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        //call the BankAccount parameter constructor
        this.OwnerName = OwnerN;
        this.AccntNumber = AccntNum;
        this.AccntBalance = AccntBal;
        this.CheckLimit = CheckLim;
    }
    
    //must override the BankAccount one
    //must also use a PrintWriter to print onto the output file instead
    public static void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
        System.out.println("Check Limit: " + CheckLim);
    }
}
