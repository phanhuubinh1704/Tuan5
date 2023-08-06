package decorator;

public class Main {
    public static void main(String[] args) {
        // Tạo sách cơ bản
        Book book = new BasicBook("Design Patterns", 50);

  
        Book DiscountMonth = new DiscountMonth(book,9);
        
        System.out.println("DiscountMonth: " + DiscountMonth.getTitle() + ", Price: $" + DiscountMonth.getPrice());


    }
}
