import java.io.File;

public class PedrickAssignment5 {
    public static void main(String[] args){
        //System.out.println(args[0]);
        //System.out.println(args[1]);
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
                } else if (filename.contains(file.getName())){
                    //If its a file, check the name
                    System.out.println("Found " + file.getAbsolutePath());
                }
            }
        }
        return FullFilePath;
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