package Exercise4p1;

public class GreenApple extends Apple {
	
	private double DiscP;
	
	
	public GreenApple(String name, int q, int p, double dP) {
		super(name, q, p);
		this.DiscP = dP;
		
	}

	public double Afdics() {
		return super.totPrice() - this.DiscP * super.totPrice();
	}
	
	public String toString() {
		return "Total price of " + quantity + " "+ name + " after " + this.DiscP*100 + " % discount: RM"; 
	}
	
	
}
