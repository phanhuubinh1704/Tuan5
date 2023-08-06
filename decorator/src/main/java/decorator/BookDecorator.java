package decorator;
public abstract class   BookDecorator implements Book {
	protected  Book decoratedBook;

    public BookDecorator(Book decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    @Override
    public String getTitle() {
        return decoratedBook.getTitle();
    }

    @Override
    public double getPrice() {
        return decoratedBook.getPrice();
    }
}
