import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {

    public static void algorithm(ArrayList authors, ArrayList novels, Scanner scnr) {
        Scanner numSS;
        Scanner wordSS;
        String input;
        char checker;
        int commas;
        String tempWord = "";
        String tempNum = "";
        String word;
        int number;

        input = scnr.nextLine();

        while (!input.equals("-1")) {
            commas = 0;

            for (int i = 0; i < input.length(); ++i) {
                checker = input.charAt(i);

                if (checker == ',') {
                    ++commas;
                }
            }

            if (commas < 1) {
                System.out.println("Error: No comma in string.");

            }
            else if (commas > 1) {
                System.out.println("Error: Too many commas in input.");

            }
            else {

                word = "";

                for (int i = 0; i < input.length(); ++i) {
                    checker = input.charAt(i);

                    if ((checker == ',') && (i != input.length() - 1)) {
                        tempNum = input.substring(i + 1);
                        tempWord = input.substring(0, i);

                    }
                }

                numSS = new Scanner(tempNum);
                wordSS = new Scanner(tempWord);

                while (wordSS.hasNext()) {

                    if (word.length() > 0) {
                        word += " " + wordSS.next();

                    }
                    else {
                        word += wordSS.next();

                    }
                }

                if (numSS.hasNextInt()) {
                    number = numSS.nextInt();

                    System.out.println("Data string: " + word);
                    System.out.println("Data integer: " + number);

                    authors.add(word);
                    novels.add(number);

                }
                else {
                    System.out.println("Error: Comma not followed by an integer.");

                }
            }

            System.out.println("\nEnter a data point (-1 to stop input):");
            input = scnr.nextLine();
        }
    }

    public static void print(ArrayList authors, ArrayList novels, String title, String column_1, String column_2) {
        int j = 0;

        System.out.printf("\n%33s", title);
        System.out.printf("\n%-20s|%23s\n", column_1, column_2);
        System.out.println("--------------------------------------------");

        for (int i = 0; i < authors.size(); ++i) {
            System.out.printf("%-20s|%23d\n", authors.get(i), novels.get(i));
        }

        System.out.println();

        for (int i = 0; i < authors.size(); ++i) {
            System.out.printf("%20s ", authors.get(i));

            while (!novels.get(i).equals(j)) {
                System.out.print("*");
                ++j;
            }

            System.out.println();
            j = 0;

        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        String title;
        String header_1;
        String header_2;

        System.out.println("Enter a title for the data:");
        title = scnr.nextLine();
        System.out.println("You entered: " + title);

        System.out.println("\nEnter the column 1 header:");
        header_1 = scnr.nextLine();
        System.out.println("You entered: " + header_1);

        System.out.println("\nEnter the column 2 header:");
        header_2 = scnr.nextLine();
        System.out.println("You entered: " + header_2);

        System.out.println("\nData is entered by inputting: '<String>, <Integer>'");
        System.out.println("Enter a data point (-1 to stop input):");

        algorithm(name, number, scnr);
        print(name, number, title, header_1, header_2);

    }
}