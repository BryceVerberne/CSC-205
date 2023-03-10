// This is the driver for the Saurian class
// Use this website to compare with your translator:
// https://saurian.krystalarchive.com/
// Game that Saurian originated from:
// https://en.wikipedia.org/wiki/Star_Fox_Adventures // http://starfox.wikia.com/wiki/Dino



public class SaurianDriver
{

    public static void main(String[] args)
    {

        // The following program translates English to Saurian and Saurian to English
        // create the Saurian object using the default constructor
        Saurian saur = new Saurian();

        // TEST #1
        // Test the English word "College"
        // It should translate to "Seccowo"
        saur.setEnglish("College");
        System.out.println(saur.getSaurian());

        if (saur.getSaurian().equals("Seccowo")) {
            System.out.println("TEST #1 Passed!");
        }
        else {
            System.out.println("TEST #1 Failed!");
        }

        System.out.println();

        // TEST #2
        // Test the English phrase: "Hello World!"
        // It should translate to "Xocce Nehct
        saur.setEnglish("Hello World!");
        System.out.println(saur.getSaurian());

        if (saur.getSaurian().equals("Xocce Nehct!")) {
            System.out.println("TEST #2 Passed!");
        }
        else {
            System.out.println("TEST #2 Failed!");
        }

        System.out.println();

        // TEST #3
        // Test the Saurian word "Faqqu"
        // It should translate to "Pizza"
        saur.setSaurian("Faqqu");
        System.out.println(saur.getEnglish());

        if (saur.getEnglish().equals("Pizza")) {
            System.out.println("TEST #3 Passed!");
        }
        else {
            System.out.println("TEST #3 Failed!");
        }

        System.out.println();

        // TEST #4
        // Test the Saurian phrase: "Kubadw faskihoj aj vid."
        // It should translate to "Taking pictures is fun."
        saur.setSaurian("Kubadw faskihoj aj vid.");
        System.out.println(saur.getEnglish());

        if (saur.getEnglish().equals("Taking pictures is fun.")) {
            System.out.println("TEST #4 Passed!");
        }
        else {
            System.out.println("TEST #4 Failed!");
        }

        System.out.println();

        // TEST #5
        // Translate "De edo sud tovouk GENERAL SCALES!"
        // It should translate to "No one can defeat GENERAL SCALES!"
        saur.setSaurian("De edo sud tovouk");
        System.out.println(saur.getEnglish() + " GENERAL SCALES!");

        if (saur.getEnglish().equals("No one can defeat")) {
            System.out.println("TEST #5 Passed!");
        }
        else {
            System.out.println("TEST #5 Failed!");
        }

        System.out.println();

        // TEST #6
        // Translate "Soccer is a way of life!"
        // It should translate to "Jessoh aj u nuo ev cavo!"
        saur.setEnglish("Soccer is a way of life!");
        System.out.println(saur.getSaurian());

        if (saur.getSaurian().equals("Jessoh aj u nuo ev cavo!")) {
            System.out.println("TEST #6 Passed!");
        }
        else {
            System.out.println("TEST #6 Failed!");
        }

        System.out.println();

        // TEST #7
        // Test the English word "College"
        // It should translate to "Seccowo"
        // create the Saurian object and initialize the data
        Saurian saur2 = new Saurian("College", true); // true means 1st parameter is in English
        System.out.println(saur2.getSaurian());

        if (saur2.getEnglish().equals("College") && saur2.getSaurian().equals("Seccowo")) {
            System.out.println("TEST #7 Passed!");
        }
        else {
            System.out.println("TEST #7 Failed!");
        }

        System.out.println();

        // TEST #8
        // Test the Saurian word "Faqqu"
        // It should translate to "Pizza"
        // create the Saurian object and initialize the data
        Saurian saur3 = new Saurian("Faqqu", false); // false means 1st parameter is in Saurian
        System.out.println(saur3.getEnglish());

        if (saur3.getEnglish().equals("Pizza") && saur3.getSaurian().equals("Faqqu")) {
            System.out.println("TEST #8 Passed!");
        }
        else {
            System.out.println("TEST #8 Failed!");
        }

        System.out.println();

        // TEST #9
        // Test the English word "Hello World!"
        // It should translate to "Xocce Nehct!"
        // create the Saurian object and initialize the data
        Saurian saur4 = new Saurian("Hello World!", true);
        System.out.println(saur4.getSaurian());

        if (saur4.getEnglish().equals("Hello World!") && saur4.getSaurian().equals("Xocce Nehct!")) {
            System.out.println("TEST #9 Passed!");
        }
        else {
            System.out.println("TEST #9 Failed!");
        }

        System.out.println();

        // TEST #10
        // Test the Saurian word "Kubadw faskihoj aj vid."
        // It should translate to "Taking pictures is fun."
        // create the Saurian object and initialize the data
        Saurian saur5 = new Saurian("Kubadw faskihoj aj vid.", false);
        System.out.println(saur5.getEnglish());

        if (saur5.getEnglish().equals("Taking pictures is fun.") &&
        saur5.getSaurian().equals("Kubadw faskihoj aj vid.")) {
            System.out.println("TEST #10 Passed!");
        }
        else {
            System.out.println("TEST #10 Failed!");
        }

        System.out.println();

        // TEST #11
        // Test the toString()
        System.out.println(saur.toString());
        System.out.println();
        System.out.println(saur2.toString());
        System.out.println();
        System.out.println(saur3.toString());
        System.out.println();
        System.out.println(saur4.toString());
        System.out.println();
        System.out.println(saur5.toString());

    }
}
