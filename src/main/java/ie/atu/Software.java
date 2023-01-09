package ie.atu;

public class Software extends Product{
    private String version;

    public Software() {
    }

    public Software(String version, String description, double price, long code) {
        super(description, price, code);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return super.toString() + // Product superclass
                "  " + "  Version : " + version;
    }
}
