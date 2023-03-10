//This class will test the Jukebox and Record classes which were parts
//of the ArrayLists, Vectors minilab

public class JukeTester
{
    public static void main(String[] args)
    {
        //testRecord will be used for queries
        Record testRecord;

        //create a new Jukebox
        Jukebox myJukebox = new Jukebox();

        //tell it to insert some Records (in various slots)
        myJukebox.insert(new Record());
        myJukebox.insert(new Record("Kokomo", "The Beach Boys"));
        myJukebox.insert(new Record("Wooly Bully", "Sam the Sham & the Pharaohs"));
        myJukebox.insert(new Record("Mustang Sally", "Wilson Pickett"));
        myJukebox.insert(1, new Record( "Great Balls of Fire", "Jerry Lee Lewis"));
        myJukebox.insert(0, new Record("I Feel Good", "James Brown"));

        //print it (using S.O.P)
        System.out.println("Jukebox now contains: " + myJukebox);

        //tell it to return 5 random Records
        System.out.println("\nA random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());
        System.out.println("A random Record is: " + myJukebox.random());

        //ask it if it contains "Kokomo" by The Beach Boys
        testRecord = new Record("Kokomo", "The Beach Boys");
        System.out.println("\nDoes it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        //ask it if it contains "Mustang Sally" by the Commitments
        testRecord = new Record("Mustang Sally", "The Commitments");
        System.out.println("Does it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        //ask it if it contains "Its Too Late" by Wilson Pickett
        testRecord = new Record("Its Too Late", "Wilson Pickett");
        System.out.println("Does it contain " + testRecord + "?: " + myJukebox.contains(testRecord));

        //ask it what slot "Great Balls of Fire" by Jerry Lee Lewis is in
        testRecord = new Record("Great Balls of Fire", "Jerry Lee Lewis");
        System.out.println("\nWhat slot is " + testRecord + " in?: " + myJukebox.findSlot(testRecord));

        //ask it what slot "The Great Pretender" by The Platters is in
        testRecord = new Record("The Great Pretender", "The Platters");
        System.out.println("What slot is " + testRecord + " in?: " + myJukebox.findSlot(testRecord));

        //tell it to remove "Wooly Booly" by Sam the Sham & the Pharaohs
        testRecord = new Record("Wooly Bully", "Sam the Sham & the Pharaohs");
        System.out.println("\nDid it successfully remove " + testRecord + "?: " + myJukebox.remove(testRecord));

        //tell it to remove "Heartbreak Hotel" by Elvis Presley
        testRecord = new Record("Heartbreak Hotel", "Elvis Presley");
        System.out.println("Did it successfully remove " + testRecord + "?: " + myJukebox.remove(testRecord));

        //print it (using S.O.P)
        System.out.println("\nJukebox now contains: " + myJukebox);

    }
}