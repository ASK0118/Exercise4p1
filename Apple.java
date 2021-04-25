package Exercise4p1;

public class Apple extends Fruit{

	protected int quantity;
	protected int price;
	
	public Apple(String name, int q, int p) {
		
		super(name);
		this.quantity = q;
		this.price = p;
		
		//System.out.println(name+ " constuctor is invoked");
	}
	
	public int totPrice() {
		
		return this.quantity*this.price;
	}
}
