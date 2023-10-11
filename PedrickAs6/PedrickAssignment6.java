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
        Scanner scanner = new Scanner(file).useDelimiter("\\W+");

        if (!file.exists()){
            System.out.println("File not found");
            System.exit(2);
        }

        while (scanner.hasNext()){
            String currentword = scanner.next();
            wordfreq.put(currentword, wordfreq.getOrDefault(currentword, 0) + 1);
        }
        scanner.close();

        System.out.println("Words in ascending order: ");
        for (String key : wordfreq.keySet()){
            System.out.println(key + ": " + wordfreq.get(key));
        }

    }
}
