import java.util.Scanner;

public class MileageTrackerLinkedList {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        // References for MileageTrackerNode objects
        MileageTrackerNode headNode;
        MileageTrackerNode currNode;
        MileageTrackerNode lastNode;

        double miles;
        String date;

        // Front of nodes list
        headNode = new MileageTrackerNode();
        lastNode = headNode;

        // TODO: Scan the number of nodes
        System.out.print("Nodes: ");
        int numNodes = scnr.nextInt();

        // TODO: For the scanned number of nodes, scan
        //       in data and insert into the linked list
        for (int i = 0; i < numNodes; ++i) {
            System.out.print("Miles for node " + (i + 1) + ": ");
            miles = scnr.nextDouble();

            System.out.print("Date for node " + (i + 1) + ": ");
            date = scnr.next();

            currNode = new MileageTrackerNode(miles, date);

            lastNode.insertAfter(currNode);
            lastNode = currNode;

        }

        // TODO: Call the printNodeData() method
        //       to print the entire linked list
        headNode = headNode.getNext();
        while (headNode != null) {
            headNode.printNodeData();
            headNode = headNode.getNext();
        }

    }
}