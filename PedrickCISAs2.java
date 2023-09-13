import java.util.Scanner;
public class PedrickCISAs2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Please input the number of bank accounts to create (1-10): ");
            int numinput = input.nextInt();
            input.nextLine();
            if (numinput >0 && numinput <11){
                int[]BankAccount = new int[numinput];
                break;
            } else {
                System.out.println("I cannot create " + numinput + " bank accounts!");
            }
        }
        //Search the array after the accounts are done being made
        
    }
//process the input and output
//create and search the array

//create an array of BankAccount
}

class BankAccount{
//Used to handle objects (bank accounts)
}

/*Ask the user to input the number of bank accounts that will be created
The number should be 1-10
Otherwise it should say it can't create that many accounts and go again
Each element of the array will refer to a bank account
Prompt the user to input details of each bank account
Details: owner, number, and balance
Use the BankAccount constructor to create a BankAccount object
Assign the object to an array element and have the details



*/