package OOPAssignments;

import java.util.ArrayList;
import java.util.Scanner;

class Book{

    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN; 
    }
}

class Collection{
    private ArrayList<Book> books = new ArrayList();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("\nBook added successfully!");
    }

    public void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("\nBook removed successfully!");
                return;
            }
        }
        System.out.println("\nBook with ISBN " + ISBN + " not found!");
    }

    public void displayBooks() {
        System.out.println("==== Book Collection ====");

        if (books.isEmpty()) {
            System.out.println("\nCollection is empty!");
            return;
        }else{
            for(Book book : books) {
                System.out.println(book);
            }
        }
        
    }

}

public class BookCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection myCollection = new Collection();

        int choice;
        do {
            System.out.println("\n==== Book Collection Menu ====");
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();

                    Book newBook = new Book(title, author, ISBN);
                    myCollection.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeISBN = scanner.nextLine();
                    myCollection.removeBook(removeISBN);
                    break;
                case 3:
                    myCollection.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }while (choice != 4);

        scanner.close();
    }
}