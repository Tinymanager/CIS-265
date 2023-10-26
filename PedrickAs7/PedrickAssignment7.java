package PedrickAs7;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PedrickAssignment7 {
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length != 2){
            System.out.println("Usage: PedrickAs7.PedrickAssignment7.java input_file output_file");
            System.exit(1);
        }
        ArrayList<BankAccount> BankAccounts = new ArrayList<>();
        
        File inputFile = new File(args[0]);
        if (!inputFile.exists()){
            System.out.println("Input file " + args[0] + " was not found");
            System.exit(2);
        }

        Scanner fileInput = new Scanner(inputFile).useDelimiter("\\W+");
        
    }
}

/*
 * Same UML Diagram as Assignment 4:
 * 
 * Mostly the same as As3 but needs to read from a file instead of scanner
 * 
 * 
 */