import java.util.Scanner;
import java.util.ArrayList;

public class testerFile {
    public static void main(String[] args){
        String s1 = "Happy Holidays/to/u";
        String s2 = "Nah    u   jjsd";
        ArrayList<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(s1);
        scan.useDelimiter("/");
        while (scan.hasNext()){
            arr.add(scan.next());
        }
        System.out.println("size is: " + arr.size());
        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
