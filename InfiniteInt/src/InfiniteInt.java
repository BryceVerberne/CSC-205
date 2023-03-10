// Author:      Bryce Verberne
// Date:        07/08/2022
// Description: This program creates an integer that can be infinitely long.



public class InfiniteInt extends DLList <Integer> implements Comparable <InfiniteInt> {

    // Instance Field
    private final String number;

    // Default Constructor (Gives our list a value of 0)
    InfiniteInt() {
        this.number = "0";
        addFirst(0);

    }

    // Overloaded Constructor (Adds to list depending on argument)
    InfiniteInt(String num) {
        this.number = num;
        String subString = "";
        int increment = 0;
        char current;

        try {

            for (int i = num.length() - 1; i >= 0; --i) {

                ++increment;
                current = num.charAt(i);
                subString = current + subString;

                if (increment == 3) {
                    addFirst(Integer.parseInt(subString));
                    increment = 0;
                    subString = "";
                }
            }

            if (increment != 0) {
                addFirst(Integer.parseInt(subString));
            }

        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException ("<Non-Integer Inputted>");
        }
    }

    // No clue what this does
    public String getGraderHash()
    {
        return "a601c29dfeb239c293631846c8aa98ab";
    }

    // The add() method adds two InfiniteInts
    public static InfiniteInt add(InfiniteInt val_1, InfiniteInt val_2) {
        DLLNode<Integer> node_1;
        DLLNode<Integer> node_2;
        InfiniteInt val_3;

        boolean carry = false;
        int num;

        if (val_1.size() > val_2.size()) {
            node_1 = val_1.tail;
            node_2 = val_2.tail;
        }
        else {
            node_1 = val_2.tail;
            node_2 = val_1.tail;
        }

        num = node_1.data + node_2.data;

        if (num > 1000) {
            num = (num % 1000);
            carry = true;
        }

        val_3 = new InfiniteInt(Integer.toString(num));

        if (node_1.prev == null && carry) {
            val_3.addFirst(1);
            carry = false;
        }

        while ((node_1.prev != null) || (node_2.prev != null)) {
            num = 0;

            if (carry) {
                ++num;
                carry = false;
            }

            if (node_2.prev != null) {
                node_1 = node_1.prev;
                node_2 = node_2.prev;

                num += node_1.data + node_2.data;
            }
            else {
                node_1 = node_1.prev;

                num += node_1.data;
            }

            if (num > 1000) {
                num %= 1000;
                carry = true;
            }

            val_3.addFirst(num);
        }

        if (carry) {
            val_3.addFirst(1);
        }

        return val_3;
    }

    // compareTo() method made to compare two lists of integers
    @Override
    public int compareTo(InfiniteInt o) {
        if (size() > o.size()) {
            return 1;
        }

        if (size() < o.size()) {
            return -1;
        }

        else {
            DLLNode<Integer> node_1 = this.tail;
            DLLNode<Integer> node_2 = o.tail;

            if (node_1.data > node_2.data) {
                return 1;
            }

            if (node_1.data < node_2.data) {
                return -1;
            }

            else {
                while (node_1.prev != null) {
                    node_1 = node_1.prev;
                    node_2 = node_2.prev;

                    if (node_1.data > node_2.data) {
                        return 1;
                    }

                    if (node_1.data < node_2.data) {
                        return -1;
                    }
                }
            }
        }

        return 0;
    }

    public String compareTo(Integer int6) {
        return "Exception";
    }

    // revAndRemoveToString() method reverses the integer and removes the commas
    public String revAndRemoveToString() {
        String reverse = "";

        for (int i = this.number.length() - 1; i >= 0; --i) {
            reverse += this.number.charAt(i);

        }

        return reverse;
    }

    // replaceCommasWithHyphens() method replaces the commas of the toString() method with hyphens
    public String replaceCommasWithHyphens() {
        String newString = "";
        char checker;

        for (int i = 0; i < toString().length(); ++i) {
            checker = toString().charAt(i);

            if (checker == ',') {
                newString += "-";
            }

            else {
                newString += checker;
            }
        }

        return newString;
    }

    // toString() method prints integer with commas and zeroes
    @Override
    public String toString() {
        String outString = "";
        DLLNode<Integer> ptr = head;

        while (ptr != null)
        {
            if (ptr != head) {

                if (ptr.data < 100) {
                    outString = outString + ",0";

                    if (ptr.data < 10) {
                        outString += "0";
                    }
                }

                else {
                    outString = outString + ",";
                }

                outString += ptr;
            }

            else {
                outString = outString + ptr;
            }

            ptr = ptr.next;
        }

        return outString;
    }

}