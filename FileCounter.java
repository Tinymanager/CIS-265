import java.io.File;

public class FileCounter {
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Usage: Java FileCounter <directory");
            System.exit(1);
        }
        String directoryPath = args[0];
        File directory = new File(directoryPath);   //theres a file, which is named directory and is taken from the directory path

        if (!directory.exists() || !directory.isDirectory()){
            System.out.println("Invalid Directory: " + directoryPath);
            System.exit(2);
        }
        int fileCount = countFiles(directory);
        System.out.println("Total files in directory: " + fileCount);
    }

    //Recursive method to count files in a directory and its subdirectories
    public static int countFiles(File directory){
        int count = 0;

        //List all files and directories in the current directory
        File[] files = directory.listFiles();   //array of files

        if (files != null){
            for (File file : files){
                if (file.isFile()){
                    //If its a file, increase the count
                    count++;
                } else if (file.isDirectory()){
                    //If its a directory recursively count files within int
                    count += countFiles(file);
                }
            }
        }
        return count;
    }
}

/*
 * exit 0 closes with no error message, exit 1 and exit 2 give different messages
 */


 /*
  * 
  */