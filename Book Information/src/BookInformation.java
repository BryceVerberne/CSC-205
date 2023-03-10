import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Book myBook = new Book();
        Encyclopedia myEncyclopedia = new Encyclopedia();

        String title, author, publisher, publicationDate;
        String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
        int numVolumes;

        System.out.print("Title: ");
        title = scnr.nextLine();

        System.out.print("Author: ");
        author = scnr.nextLine();

        System.out.print("Publisher: ");
        publisher = scnr.nextLine();

        System.out.print("Publication Date: ");
        publicationDate = scnr.nextLine();

        System.out.print("\neTitle: ");
        eTitle = scnr.nextLine();

        System.out.print("eAuthor: ");
        eAuthor = scnr.nextLine();

        System.out.print("ePublisher: ");
        ePublisher = scnr.nextLine();

        System.out.print("ePublication Date: ");
        ePublicationDate = scnr.nextLine();

        System.out.print("Edition: ");
        edition = scnr.nextLine();

        System.out.print("Number of Volumes: ");
        numVolumes = scnr.nextInt();

        myBook.setTitle(title);
        myBook.setAuthor(author);
        myBook.setPublisher(publisher);
        myBook.setPublicationDate(publicationDate);
        myBook.printInfo();

        myEncyclopedia.setTitle(eTitle);
        myEncyclopedia.setAuthor(eAuthor);
        myEncyclopedia.setPublisher(ePublisher);
        myEncyclopedia.setPublicationDate(ePublicationDate);
        myEncyclopedia.setEdition(edition);
        myEncyclopedia.setNumVolumes(numVolumes);
        myEncyclopedia.printInfo();

    }
}