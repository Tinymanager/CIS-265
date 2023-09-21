package PedrickCISAs3;

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
 * Must Have:
 * a no-arg constructor
 * a constructor with 3 parameters: string, int, and double
 * a method printBankAccount()
 * a method getNumber() to return its number
 */