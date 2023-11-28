package PedrickCISAs10;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Song implements Comparable<Song> {

    private static class Songs{
        String artist;
        String title;
        String link;
        String text;
        
        public Songs(String artist, String title, String link, String text){
            this.artist = artist;
            this.title = title;
            this.link = link;
            this.text = text;
        }

        public String getTitle(){
            return title;
        }
        public String setTitle(String NewTitle){
            title = NewTitle;
            return title;
        }

        @Override
        public String toString(){
            return artist + "   " + title + "   " + link + "   " + text;
        }
    }


    public static void main(String[] args) throws FileNotFoundException{

        if (args.length!= 1){
            System.out.println("Usage: PedrickAs10.Song.java input_file");
            System.exit(1);
        }

        //BST for the songs
        BST<Song> bst = new BST<>();

        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        if (!file.exists()){
            System.out.println("File not found");
            System.exit(2);
        }
        scanner.nextLine();

        while (scanner.hasNextLine()){
            String[] parts = scanner.nextLine().split("\t");
            String artist = parts[0];
            String title = parts[1];
            String link = parts[2];
            StringBuilder textBuilder = new StringBuilder();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.equals("\"")){
                    break;
                }
                textBuilder.append(line).append("\n");
            }
            String text = textBuilder.toString().trim();
            bst.insert(new Songs(artist, title, link, text));
            //not sure whats wrong here
        }
        scanner.close();

        Scanner input = new Scanner(System.in);
        Boolean running = true;
        while(running == true){
            System.out.println("Please input the title of the song (Quit to exit): ");
            String title = input.nextLine();
            if (title.equals("Quit")){
                System.out.println("Bye!");
                break;
            }
            else {
                String artist = "artist";
                String link = "link";
                String text = "text";
                Songs s = new Songs(artist, title, link, text);
                Songs s1 = bst.find(s);//not sure whats wrong here
                if (s1 == null){
                    System.out.println("Title " + title + " not found.");
                }
                else {
                    System.out.println(s.toString());//Prints the song
                }
            }
        }
    }

    /*
     * compares the song's title to the title of a given song
     * return a + int if current song title is greater than given song
     *  - int if current song title is less than given song
     *  0 if current song title is equal to given song
     */
    @Override
    public int compareTo(Song o) {
        return bst.compareTo(o);
    }

}


/*
 * Name: Ethan Pedrick
 * CSU ID: 2835438
 * CIS 265: Assignment 10
 * Description: Reading and adding songs from a text file to a BST, then searching the BST to find requested songs
 */