import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ContactNode head = new ContactNode();
        ContactNode lastNode = head;
        ContactNode node;

        String name;
        String number;

        for (int i = 0; i < 3; ++i) {
            System.out.println("Person " + (i + 1) + "\nEnter name:");
            name = scnr.nextLine();

            System.out.println("Enter phone number:");
            number = scnr.nextLine();

            node = new ContactNode(name, number);
            lastNode.insertAfter(node);
            lastNode = node;

            System.out.println("You entered: " + node.getName() + ", " + node.getPhoneNumber() + "\n");
        }

        System.out.println("CONTACT LIST");
        head = head.getNext();
        while (head != null) {
            System.out.println("Name: " + head.getName() + "\nPhone number: " + head.getPhoneNumber() + "\n");
            head = head.getNext();
        }

    }
}