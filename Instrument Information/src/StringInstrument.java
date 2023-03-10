public class StringInstrument extends Instrument {
    // Private fields
    private int numStrings;
    private int numFrets;

    StringInstrument() {
        numStrings = 0;
        numFrets = 0;
    }

    // Mutator methods -
    public void setNumOfStrings(int strings) {
        numStrings = strings;
    }

    public void setNumOfFrets(int frets) {
        numFrets = frets;
    }

    // Accessor methods
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets() {
        return numFrets;
    }

}