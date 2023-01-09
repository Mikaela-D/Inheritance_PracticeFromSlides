package ie.atu;

public class Book {
    private String author;
    private String description;
    private double price;
    private long code;

    public Book() {
    }

    public Book(String author, String description, double price, long code) {
        this.author = author;
        this.description = description;
        this.price = price;
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
