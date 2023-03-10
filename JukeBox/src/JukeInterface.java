public interface JukeInterface
{
    //insert(Record aRecord) - inserts a Record at the last position in the jukebox
    public void insert(Record aRecord);

    //insert(int slot, Record aRecord) - inserts a Record into a specific slot in the jukebox
    public void insert(int slot, Record aRecord);

    //remove(Record aRecord) - removes a Record from the jukebox.   If the
    //                         Record does not exist, it is unchanged.
    public boolean remove(Record aRecord);

    //contains(Record aRecord) - returns true if the jukebox contains the Record
    public boolean contains(Record aRecord);

    //findSlot(Record aRecord) - returns the slot that has the Record (-1 if not there)
    public int findSlot(Record aRecord);

    //random() - returns a Record, chosen at random
    //                    (to generate a random int between 0 and theSize-1, use (int)(Math.random()*theSize)
    public Record random();

    //toString() - returns this jukebox's representation as a String
    public String toString();
}