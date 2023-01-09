package ie.atu;

public class App {
    public static void main(String[] args) {
        Book myBook = new Book("Steve", "A Boring book", 100, 0101);
        System.out.println(myBook.toString());
    }
}
