// Programmer: Bryce Verberne
// Date: 06/17/2022
// Description: This program takes a list of different songs, then manipulates and displays them in different ways!



import java.util.ArrayList;
import java.util.Random;

// This class is influenced by the JukeInterface class, which is our main interface.
public class Jukebox implements JukeInterface {

    // Instance Variables
    private ArrayList <Record> records;
    Random rand;

    // Default Constructor
    Jukebox() {
        records = new ArrayList<>();
        rand = new Random();
    }

    // Add an object to our list
    @Override
    public void insert(Record aRecord) {
        records.add(aRecord);

    }

    // Add an object to a specific slot in our list
    @Override
    public void insert(int slot, Record aRecord) {
        records.add(slot, aRecord);

    }

    // Remove a specified object
    @Override
    public boolean remove(Record aRecord) {
        boolean present = false;

        for (int i = 0; (i < records.size()) && (!present); ++i) {

            if (records.get(i).equals(aRecord)) {
                present = true;
                records.remove(i);
            }
        }

        return present;
    }

    // Return T/F if our list contains a specific object
    @Override
    public boolean contains(Record aRecord) {
        boolean present = false;

        for (int i = 0; (i < records.size()) && (!present); ++i) {

            if (records.get(i).equals(aRecord)) {
                present = true;
            }
        }

        return present;
    }

    // Find a specific slot that contains a specified object
    @Override
    public int findSlot(Record aRecord) {
        boolean present = false;
        int slot = 0;

        for (int i = 0; (i < records.size()) && (!present); ++i) {

            if (records.get(i).equals(aRecord)) {
                present = true;
                slot = i;
            }
        }

        if (present) {
            return slot;
        }
        else {
            return -1;
        }

    }

    // Finds and returns a random object in our list
    @Override
    public Record random() {
        int randNum = rand.nextInt(records.size());

        return records.get(randNum);
    }

    // Prints an overview of our list
    @Override
    public String toString() {
        return records.toString();
    }

}
