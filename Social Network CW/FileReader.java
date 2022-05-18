/**
 * 
 * FileReader class that reads the files and returns a BST
 * the class function is very similar to CW1
 * @author Fjoraldo Gordoni 
 * @version 1.0.0
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    /**
     * function that reads the tokens of the line and creates a profile to be passed 
     * @param in is the scanner used for the line of the profile
     * @returns a profile that is read from the line
     */
    private static Profile readProfile(Scanner in){

        //uses the delimiter "," to split the tokens
        in.useDelimiter(",|\n");
        String lastName = in.next();
        String firstName = in.next();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        String emailAddress = in.next();
        String interestsString = in.next();
        String actAndGrpString = in.next();

        //by using the split() function it is possible to split the individual tokens in the line with another
        //delimiter different from the "," previously used
        String[] interests = interestsString.split(";");
        String[] actAndGrp = actAndGrpString.split(";");

        //builds profile and returns it
        Profile profile = new Profile(firstName, lastName, day, month, year, emailAddress,
        interests, actAndGrp);
        return profile;
    }

    /**
     * function that reads the File line by line and passes it to the readProfile function
     * @param in is the scanner used to read the file lines
     * @returns the BST built by adding all the profiles read to it
     */
    private static BST readLineByLine(Scanner in){
        //creates a new BST
        BST bst = new BST();

        //adds all the profiles present in the file to the BST
        while(in.hasNextLine()){
            bst.addProfile(readProfile(in));
        }
        //returns the completed BST
        return bst;
    }

    /**
     * function that opens the file
     * @param filename is the name of the file that will be opened
     * @returns a BST
     * @throws FileNotFoundException is thrown when no file is found, with exit code -1
     */
    public static BST readProfileSet (String filename) throws FileNotFoundException{
        File fileName = new File(filename);
        try {
            Scanner in = new Scanner(fileName);
            return FileReader.readLineByLine(in);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open " + filename);
            System.exit(-1);
        }
        return null;
    }
}
