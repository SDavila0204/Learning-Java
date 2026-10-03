package Library_PROJECT2;

import java.util.Scanner;

public class bookStore_main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        bookStore_inventory myBookStore = new bookStore_inventory();

        myBookStore.addBook(new Book("The Outsiders", "S.E Hinton", 1969, 8.99, 12));
        myBookStore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1921, 8.99, 6));
        myBookStore.addBook(new Book("This Side of Paradise", "F. Scott Fitzgerald", 1919, 8.99, 8 ));
        myBookStore.addBook(new Book("City of Bones", "Cassandra Clare", 2008, 12.99, 13));
        myBookStore.addBook(new Book("The Boy Wonder", "Juni Ba", 2024, 19.65, 20));

        int choice;
        do {
            System.out.println("---- bookstore menu ----");
            System.out.println("1. add a new book");
            System.out.println("2. view all books");
            System.out.println("3. search for books");
            System.out.println("4. Exit");

            System.out.println("-----------------------");

            System.out.println("Enter your choice: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter title: ");
                    String title = scnr.nextLine();

                    System.out.println("Enter author: ");
                    String author = scnr.nextLine();

                    System.out.println("Enter release date (year): ");
                    int releaseDate = scnr.nextInt();

                    System.out.println("Enter price: ");
                    double price = scnr.nextDouble();

                    System.out.println("Enter quantity: ");
                    int quantity = scnr.nextInt();

                    myBookStore.addBook(new Book(title, author, releaseDate, price, quantity));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    myBookStore.displayBooks();
                    break;
                case 3:
                    System.out.println("Please enter title or author: ");
                    String query = scnr.nextLine();
                    Book foundBook = myBookStore.searchBook(query);
                    if (foundBook != null) {
                        System.out.println("book: ");
                        foundBook.book_Details();
                    } else {
                        System.out.println("Book not found :");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Bookstore. Goodbye!!");
                    System.out.println("Hope to see you again :)");
                    break;
            }
        } while (choice != 4);
        scnr.close();
    }


}

