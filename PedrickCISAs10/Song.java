package PedrickCISAs10;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Song implements Comparable<Song> {

    public static void main(String[] args) throws FileNotFoundException{
     /*
     * check if args=! 1, print message and exit if true
     * define a file and scanner to read the file
     * while(more songs left){
     * read the next song from the file
     * add it to the BST}
     * 
     * close the scanner
     * prompt user for a title
     * while title is not "Quit"{
     * create a song with the title
     * look for the song in the BST
     * print if found, otherwise print not found message}
     * 
     * print "Bye!"
     */

        String artist;
        String title;
        String link;
        String text;

        if (args.length!= 1){
            System.out.println("Usage: PedrickAs10.Song.java input_file");
            System.exit(1);
        }
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file).useDelimiter("\t"); //\t is tab
        if (!file.exists()){
            System.out.println("File not found");
            System.exit(2);
        }
        scanner.nextLine();
        Boolean moreSongs = true;
        int counter = 0;
        while (scanner.hasNext()){
            /*
             * Adding a song to the BST:
             * iterate through the txt file
             * 
             */
            //delimiter can split up a string

            //read until you find a line with just a "
            //if there is a tab in the line, split it into multiple strings

        }

        //BST for the songs
        BST<Song> bst = new BST<>();

    
    /*
     * Songs are read from the songs.txt file
     * The BST is created for the songs and then used for searching
     * Use Song s1 = bst.find(s) to search for a song
     * 
     * Creating the BST with songs:
     * First line of the file is skipped
     * Contains 57650 songs
     * The artist, title, link, and text Strings are separated by tabs (\t)
     * The final line of each text ends with just a "
     * To test what the final line is use: s.equals(“\'”)
     * Ignore songs with identical titles
     * 
     * Process:
     * import all songs from the file to the BST
     * Print the number of songs and unique titles
     * prompt user to search for a title
     * if title is found, print the artist, title, link, and text
     * other wise print "Title x not found"
     * must provide a toString() method for the Song class to print a song
     * This just returns 1 String of everything formatted
     * 
     */
    }

    /*
     * compares the song's title to the title of a given song
     * return a + int if current song title is greater than given song
     *  - int if current song title is less than given song
     *  0 if current song title is equal to given song
     */
    @Override
    public int compareTo(Song o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}