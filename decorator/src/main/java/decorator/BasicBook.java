package decorator;

public class BasicBook implements Book {
    private String title;
    private double price;

    public BasicBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
