package ie.atu;

public class Product {
    private String description;
    private double price;
    private long code;

    public Product() {
    }

    public Product(String description, double price, long code) {
        this.description = description;
        this.price = price;
        this.code = code;
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

    @Override
    public String toString() {
        return description + " " + "  Price : " + price + " " + "  Code : " + code;
    }
}
