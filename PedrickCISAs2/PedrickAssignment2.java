package PedrickCISAs2;
import java.util.Scanner;
public class PedrickAssignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] BankAccount;
        while (true){
            System.out.println("Please input the number of bank accounts to create (1-10): ");
            int numinput = input.nextInt();
            input.nextLine();
            if (numinput >0 && numinput <11){
                BankAccount = new BankAccount[numinput];
                break;
            } else {
                System.out.println("I cannot create " + numinput + " bank accounts!");
            }
        }
        for (int i=0; i<BankAccount.length; i++){
            //Take the inputs for the details
            System.out.println("Bank Account " + (i+1) + " owner: ");
            String OwnerName = input.nextLine();
            System.out.println("Bank Account " + (i+1) + " account number: ");
            int AccntNumber = input.nextInt();
            input.nextLine();
            System.out.println("Bank Account " + (i+1) + " balance: ");
            Double AccntBalance = input.nextDouble();
            BankAccount[i] = new BankAccount(OwnerName, AccntNumber, AccntBalance);
        }
        //Search the array after the accounts are done being made
        
    }

}