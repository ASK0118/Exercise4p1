package Exercise4p1;

public class FujiApple extends Apple {
	
private double ConvertRate;
private String place;
	
	public FujiApple(String name, int q, int p, double cr, String place) {
		super(name, q, p);
		this.ConvertRate = cr;
		this.place = place;
	}
	
	public double calConvert() {
		return super.totPrice() * ConvertRate;
	}
	
	public String toString() {
		return "Total price of " + quantity + " "+ name + " (japanese yen): ";
}
	
	public String getPlace() {
		return this.place;
	}
}

