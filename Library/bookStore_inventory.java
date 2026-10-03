package Library_PROJECT2;

import java.util.ArrayList;

public class bookStore_inventory {
    private ArrayList<Book> inventory;

    public bookStore_inventory() {
        this.inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayBooks() {
        if (inventory.isEmpty()) {
            System.out.println("No books currently available :(");
            return;
        }
        System.out.println("\n------ INVENTORY -----");
        for (Book book : inventory) {
            book.book_Details();
        }
        System.out.println("  ----------------------");
    }


    public Book searchBook(String query) {
        for (Book book : inventory) {
            // Check if title or author contains the query (case-insensitive)
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                return book;
            }
        }
        return null;
    }
}
