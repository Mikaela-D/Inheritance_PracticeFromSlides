package ie.atu;

public class Book extends Product{
    private String author;

    public Book() {
    }

    public Book(String author, String description, double price, long code) {
        super(description, price, code);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
