// Programmer: Bryce Verberne
// Date:       05/31/2022
// The Saurian class has the ability to translate English to Saurian
// and Saurian to English



public class Saurian
{

    // Instance Variables
    public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K','L','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z','a','b','c', 'd','e','f','g','h','i','j','k','l','n','o', 'p','q','r',
            's','t','u','v','w','x','y','z'};
    public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B','C','D','E','F','G','H','J',
            'K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x','a','z','b','c','d','e','f','g','h','j',
            'k','i','l','n','p','o','q'};
    public static final int ARRLENGTH = ENGLISHARR.length; // should be the same length for ENGLISHARR and SAURIANARR
    private String english;
    private String saurian;

    // Default Constructor
    public Saurian() {
        english = "";
        saurian = "";
    }

    // Overload Constructor
    public Saurian(String str, boolean engOrSaur) {
        if (engOrSaur) {
            english = str;
            translateEngToSaur();
        }
        else {
            saurian = str;
            translateSaurToEng();
        }
    }

    // Mutator Methods
    public void setEnglish(String eng) {
        this.english = eng;
        translateEngToSaur();
    }

    public void setSaurian(String saur) {
        this.saurian = saur;
        translateSaurToEng();
    }

    // Accessor Methods
    public String getSaurian() {
        return saurian;
    }

    public String getEnglish() {
        return english;
    }

    // Translate Methods
    public void translateEngToSaur() {
        saurian = "";
        char currentChar;
        boolean finished;

        for (int i = 0; i < english.length(); ++i) {
            currentChar = english.charAt(i);
            finished = false;

            if (Character.isLetter(currentChar)) {
                for (int j = 0; ((j < ENGLISHARR.length) && (!finished)); ++j) {
                    if (ENGLISHARR[j] == currentChar) {
                        saurian += SAURIANARR[j];
                        finished = true;
                    }
                }
            }
            else {
                saurian += currentChar;
            }
        }

    }

    public void translateSaurToEng() {
        english = "";
        char currentChar;
        boolean finished;

        for (int i = 0; i < saurian.length(); ++i) {
            currentChar = saurian.charAt(i);
            finished = false;

            if (Character.isLetter(currentChar)) {
                for (int j = 0; ((j < SAURIANARR.length) && (!finished)); ++j) {
                    if (SAURIANARR[j] == currentChar) {
                        english += ENGLISHARR[j];
                        finished = true;
                    }
                }
            }
            else {
                english += currentChar;
            }
        }

    }

    // toString Method (Cumulation of all the test cases)
    @Override
    public String toString() {
        return "English translation:\n" + english + "\nSaurian translation:\n" + saurian;
    }

}