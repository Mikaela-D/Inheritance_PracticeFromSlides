package ie.atu;

public class Software {
    private String version;
    private String description;
    private double price;
    private long code;

    public Software() {
    }

    public Software(String version, String description, double price, long code) {
        this.version = version;
        this.description = description;
        this.price = price;
        this.code = code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
