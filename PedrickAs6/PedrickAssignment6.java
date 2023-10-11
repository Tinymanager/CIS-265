package PedrickAs6;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileNotFoundException;
import java.io.File;

public class PedrickAssignment6 {
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length!= 1){
            System.out.println("Usage: PedrickAs6.PedrickAssignment6.java input_file");
            System.exit(1);
        }

        File file = new File(args[0]);
        Map<String, Integer> wordfreq = new TreeMap<>();
        Scanner scanner = new Scanner(file);

        if (!file.exists()){
            System.out.println("File not found");
            System.exit(2);
        }

        System.out.println("Words in ascending order: ");
        while (scanner.hasNext()){
            String currentword = scanner.next();
            wordfreq.put(currentword, wordfreq.getOrDefault(currentword, 0) + 1);
            System.out.println(currentword + ": " + wordfreq.get(currentword));
        }
        scanner.close();
    }
}
