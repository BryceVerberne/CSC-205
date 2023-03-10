// Programmer:  Bryce Verberne
// Date:        07/01/2022
// Description: This program reads a file and then outputs that information using a HashMap
// "We're in the endgame now." - Stephen Strange, M.D., Ph.D.
// https://pics.me.me/were-in-the-endgame-now-when-the-power-point-goes-38463881.png



import java.io.File;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static final int ARR_LENGTH = 25;

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String mainMan = "Mega Man";
        String leadingLady = "Lucina";

        // setup the hash map here
        // Possibly has an Integer key
        HashMap<String, String> hashedNamesHM = new HashMap<>();

        // Created scanning object for list reader
        Hashes hashes = new Hashes();

        String filename = "names.txt";
        String[] namesArr;

        // Calls method where we input the list of names
        namesArr = readNames(filename);

        //print out every element in the array
        // Finished: Originally i < .length, now i < namesArr.length
        for (String s : namesArr) {
            System.out.println(s);
            hashes.makeHash(s);

            // I used i as my key when adding to my HashMap
            hashedNamesHM.put(s, hashes.getHashedStr());
        }

        // Changed hashedNamesHM.toString() to just hashedNameHM
        System.out.println("\n" + hashedNamesHM + "\n");

        // find your main man
        if (hashedNamesHM.containsKey(mainMan)) {
            System.out.println(mainMan +  " = " + hashedNamesHM.get(mainMan));
        } else {
            System.out.println("The HashMap does not contain " + mainMan + ".");
        }

        // find your leading lady
        if (hashedNamesHM.containsKey(leadingLady)) {
            System.out.println(leadingLady +  " = " + hashedNamesHM.get(leadingLady));
        } else {
            System.out.println("The HashMap does not contain " + leadingLady + ".");
        }

    }

    // read the names from names.txt and put them into an array
    public static String[] readNames(String filename)
    {
        String[] names = new String[ARR_LENGTH];
        String currentLine;
        int index = 0;

        //make a new scanner object that will read from the file
        try {
            Scanner in = new Scanner(new File(filename));

            while (in.hasNext()) {
                currentLine = in.nextLine();
                names[index] = currentLine;
                ++index;
            }

            System.out.println("The list of names has been read.");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return names;
    }
}