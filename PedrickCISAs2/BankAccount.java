package PedrickCISAs2;

public class BankAccount {
    //Used to handle objects (bank accounts)
    protected String OwnerName;
    protected int AccntNumber;
    protected Double AccntBalance;

    protected BankAccount() {}

    public BankAccount(String OwnerN, int AccntNum, Double AccntBal){
        this.OwnerName = OwnerN;
        this.AccntNumber = AccntNum;
        this.AccntBalance = AccntBal;

    }

    public void NameSetter(String OwnerN){
        OwnerName = OwnerN;
    }
    public String NameGetter(){
        return OwnerName;
    }

    public void AccntNumberSetter(int AccntNum){
        AccntNumber = AccntNum;
    }
    public int AccntNumberGetter(){
        return AccntNumber;
    }

    public void BalanceSetter(Double AccntBal){
        AccntBalance = AccntBal;
    }
    public Double BalanceGetter(){
        return AccntBalance;
    }

    //PrintBankAccount method
}

