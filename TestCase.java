import java.util.Scanner;
import java.util.ArrayList;

public class TestCase {
    public static void main(String[] args){
        String[] relts = new String[1];
        relts[0] = "pokimane-english-valorant";
        String[] fe = relts[0].split("-");
        for (int i=0; i<fe.length; i++){
            System.out.println(fe[i]);
        }

    }
}
