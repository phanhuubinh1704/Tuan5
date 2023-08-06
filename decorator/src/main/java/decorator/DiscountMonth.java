package decorator;

public class DiscountMonth extends BookDecorator  {

	private double ngay;
	private double V;

	public DiscountMonth(Book decoratedBook,double ngay) {
		super(decoratedBook);
		// TODO Auto-generated constructor stub
		this.ngay = ngay;
		
	}
	@Override
    public double getPrice() {
		
		if (ngay==8) {
		   V=super.getPrice() -(super.getPrice()*0.1);
		}
		
		else {
			System.out.println("Không giảm");
			V=super.getPrice();
		}
        return V;
    }

}
