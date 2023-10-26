package PedrickAs7;

public abstract class BankAccount {
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
