package PedrickAs7;

public class CheckingAccount extends BankAccount {
    protected int CheckLimit;

    protected CheckingAccount() {}

    public CheckingAccount(String OwnerN, int AccntNum, Double AccntBal, int CheckLim){
        super(OwnerN, AccntNum, AccntBal);
        this.CheckLimit = CheckLim;
    }

    @Override
    public String toString(){
        return super.toString() + ", checking, " + CheckLimit;
    }

}