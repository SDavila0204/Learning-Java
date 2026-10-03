package Library_PROJECT2;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private double price;
    private int quantity;

    //constructors
    public Book(String title, String author, int releaseDate, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.price = price;
        this.quantity = quantity;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void book_Details() {
        System.out.println("Book Title: " + title + "\n author: " + author
        + "\n release year: " + releaseDate + "\n price: " + price + "\n copies available: " + quantity );
    }
}
