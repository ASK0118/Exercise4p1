package Exercise4p1;

public class Orange extends Fruit{

	private int calories;
	private double weight;
	private String taste;
	
	public Orange(String name, int c, double w, String t) {
		super(name);
		this.calories = c;
		this.weight = w;
		this.taste = t;
	}
	
	public String getTaste() {
		return this.taste;
	}
	public double calC(){
		 return this.calories * this.weight;
		 
	}
	
	public String toString() {
		return "Calories of " + name + " in " + this.weight + " gram: ";
	}
}
