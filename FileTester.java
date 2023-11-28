import java.io.File;
import java.util.ArrayList;

public class FileTester {
    public static ArrayList<String> search(File directory, String fileName) {
        ArrayList<String> result = new ArrayList<String>();
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    result.addAll(search(file, fileName));
                } else if (fileName.equalsIgnoreCase(file.getName())) {
                    result.add(file.getAbsolutePath());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String fileName = args[1];
        String directoryPath = args[0];
        File directory = new File(directoryPath);
        ArrayList<String> result = search(directory, fileName);
        if (result.isEmpty()) {
            System.out.println("File not found.");
        } else {
            System.out.println("File found at:");
            for (String path : result) {
                System.out.println(path);
            }
        }
    }
}
