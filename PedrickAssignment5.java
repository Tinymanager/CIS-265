import java.io.File;

public class PedrickAssignment5 {
    public static void main(String[] args){
        System.out.println(args[0]);
        if (args.length != 1){
            System.out.println("Usage: Java FileCounter <directory");
            System.exit(1);
        }
        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()){
            System.out.println("Invalid Directory: " + directoryPath);
            System.exit(2);
        }
        //int fileCount = search(directory);
        System.out.println("Total files in directory: " + fileCount);
    }


    public static search(File sourceFolder, String filename){
        int count = 0;

        File[] files = sourceFolder.listFiles();

        if (files != null){
            for (File file : files){
                if (file.isFile()){
                    //If its a file, increase the count
                    count++;
                } else if (file.isDirectory()){
                    //If its a directory recursively count files within int
                    count += search(file);
                }
            }
        }
        return count;
    }
}


/*
 * Take 2 command line parameters
 * First parameter is the folder to search for
 * Second is the filename to search for
 * (which may only be a partial name)
 * 
 * Must handle errors by printing an error message and showing the correct format
 * 
 * Needs to search recursively in the directory for the file
 * Print the full path of the file followed by a newline
 * 
 */