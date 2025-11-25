package OOPAssignments;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<String> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println("\nBook added: " + book);
    }

    public void removeBook(String book) {
        if(books.remove(book)) {
            System.out.println("\nBook removed: " + book);
        } else {
            System.out.println("\nBook not found: " + book);
        }
    }

    public void displayBooks() {
        System.out.println("\n==== Library Books ====");
        if(books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for(String book : books) {
                System.out.println(book);
            }
        }
    }
    
}

public class LibraryCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();    

        int choice;
        do {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String bookToAdd = scanner.nextLine();
                    library.addBook(bookToAdd);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String bookToRemove = scanner.nextLine();
                    library.removeBook(bookToRemove);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting the library menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);  
        scanner.close();
    }
    
}