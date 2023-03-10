public class Encyclopedia extends Book {
    // Private fields
    private String edition;
    private int numVolumes;

    Encyclopedia() {
        edition = null;
        numVolumes = 0;
    }

    // Mutator methods
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setNumVolumes(int numVolumes) {
        this.numVolumes = numVolumes;
    }

    // Accessor methods
    public String getEdition() {
        return edition;
    }

    public int getNumVolumes() {
        return numVolumes;
    }

    // printInfo()
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("   Edition: %s\n   Number of Volumes: %d\n", edition, numVolumes);
    }

}