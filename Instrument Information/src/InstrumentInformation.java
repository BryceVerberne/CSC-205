import java.util.Scanner;

public class InstrumentInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Instrument myInstrument = new Instrument();
        StringInstrument myStringInstrument = new StringInstrument();

        String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
        int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;

        System.out.print("Instrument Name: ");
        instrumentName = scnr.nextLine();

        System.out.print("Manufacturer Name: ");
        manufacturerName = scnr.nextLine();

        System.out.print("Year Built: ");
        yearBuilt = scnr.nextInt();
        scnr.nextLine();

        System.out.print("Cost: ");
        cost = scnr.nextInt();
        scnr.nextLine();

        System.out.print("\nString Instrument Name: ");
        stringInstrumentName = scnr.nextLine();

        System.out.print("String Manufacturer: ");
        stringManufacturer = scnr.nextLine();

        System.out.print("String Year Built: ");
        stringYearBuilt = scnr.nextInt();

        System.out.print("String Cost: ");
        stringCost = scnr.nextInt();

        System.out.print("Number of Strings: ");
        numStrings = scnr.nextInt();

        System.out.print("Number of Frets: ");
        numFrets = scnr.nextInt();

        myInstrument.setName(instrumentName);
        myInstrument.setManufacturer(manufacturerName);
        myInstrument.setYearBuilt(yearBuilt);
        myInstrument.setCost(cost);
        myInstrument.printInfo();

        myStringInstrument.setName(stringInstrumentName);
        myStringInstrument.setManufacturer(stringManufacturer);
        myStringInstrument.setYearBuilt(stringYearBuilt);
        myStringInstrument.setCost(stringCost);
        myStringInstrument.setNumOfStrings(numStrings);
        myStringInstrument.setNumOfFrets(numFrets);
        myStringInstrument.printInfo();

        System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
        System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());
    }
}