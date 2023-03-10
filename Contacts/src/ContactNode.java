public class ContactNode {
    private String contactName;
    private String contactPhoneNumber;
    private ContactNode nextNodePtr;

    ContactNode() {
        this.contactName = null;
        this.contactPhoneNumber = null;
    }

    ContactNode(String name, String number) {
        this.contactName = name;
        this.contactPhoneNumber = number;
    }

    public String getName() {
        return contactName;

    }

    public String getPhoneNumber() {
        return contactPhoneNumber;

    }

    public void insertAfter(ContactNode node) {
    ContactNode tempVal;

    tempVal = this.nextNodePtr;
    this.nextNodePtr = node;
    node.nextNodePtr = tempVal;

    }

    // TODO: Make getNext() method
    public ContactNode getNext() {
        return this.nextNodePtr;
    }

    public void printContactNode() {
        System.out.println("Name: " + contactName + "\nPhone number: " + contactPhoneNumber);

    }

}