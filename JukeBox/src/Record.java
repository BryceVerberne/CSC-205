/*
Programmer: Bryce Verberne
Date:       06/14/2022
This class describes a (pre-CD) record.
*/

public class Record
{
    // Data
    private String title;
    private String artist;

    // Constructor
    public Record()
    {
        title = "My favorite Song";
        artist = "My favorite artist";
    }

    public Record( String theTitle, String theArtist )
    {
        this.title = theTitle;
        this.artist = theArtist;
    }

    // This is a boolean method that takes in an Object (class) and verifys
    // that it is equal or not to another Object (class).
    public boolean equals( Object currentOb )
    {
        if ( this.getClass() != currentOb.getClass() )
            return false;
        if ( currentOb == null )
            return false;

        Record aRecord2 = (Record)currentOb;	// Must typecast the object

        // Will return true if they are equal.
        return ( this.title.equals( aRecord2.title ) && this.artist.equals( aRecord2.artist ));
    }

    // The ever necessary toString method for class Record.
    public String toString()
    {
        return "( " + this.title + ", " + this.artist + " )";
    }
}