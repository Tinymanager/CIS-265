import java.io.File;

public class PedrickAssignment5 {
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Usage: Java FileCounter <directory");
            System.exit(1);
        }
        String directoryPath = args[0];
        File directory = new File(directoryPath);
        String FName = args[1];

        if (!directory.exists() || !directory.isDirectory()){
            System.out.println("Invalid Directory: " + directoryPath);
            System.exit(2);
        }
        String filePath = search(directory, FName);
    }


    public static String search(File sourceFolder, String filename){
        String FullFilePath = " ";

        File[] files = sourceFolder.listFiles();

        if (files != null){
            for (File file : files){
                if (file.isDirectory()){
                    //If its a directory - recursive
                    search(file, filename);
                } else if (file.getName().contains(filename)){
                    //If its a file, check the name
                    System.out.println("Found " + file.getAbsolutePath());
                }
            }
        }
        return FullFilePath;
    }
}


/*
/*
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 5
 * Description: Recursively searching a directory for a file
 */