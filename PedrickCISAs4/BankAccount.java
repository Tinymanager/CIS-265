package PedrickCISAs4;

public class BankAccount {
    protected String OwnerName;
    protected int AccntNumber;
    protected Double AccntBalance;

    protected BankAccount() {}

    public BankAccount(String OwnerN, int AccntNum, Double AccntBal){
        this.OwnerName = OwnerN;
        this.AccntNumber = AccntNum;
        this.AccntBalance = AccntBal;
    }

    public void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
    }

    public int getNumber(){
        return AccntNumber;
    }
}


/*
 * Same as As3 other than:
 * must be abstract
 * must have a printBankAccount(PrintWriter pw)
 * Will write the account's owner, number, and balance to the file
 * 
 */