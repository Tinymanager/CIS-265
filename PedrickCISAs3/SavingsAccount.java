package PedrickCISAs3;

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

    public void PrintBankAccount(String OwnerN, int AccntNum, Double AccntBal, Double Interest){
        System.out.println("Owner: " + OwnerN);
        System.out.println("Number: " + AccntNum);
        System.out.println("Balance: " + AccntBal);
        System.out.println("Interest: " + Interest);
    }
}


/*
 * also extends the BankAccount class
 * no-arg constructor
 * 4-parameter constructor: String, int, double, double
 * parameter constructor must call the BankAccount's constructor
 * must also override the printBankAccount() to print it's owner, number, balance, and interest
 */