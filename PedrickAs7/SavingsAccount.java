package PedrickAs7;

public class SavingsAccount extends BankAccount{
    protected Double AccntInterest;

    protected SavingsAccount() {}

    public SavingsAccount(String OwnerN, int AccntNum, Double AccntBal, Double Interest){
        //call the BankAccount parameter constructor
        super(OwnerN, AccntNum, AccntBal);
        this.AccntInterest = Interest;
    }

    @Override
    public String toString(){
        return super.toString() + ", savings, " + AccntInterest;
    }
}
