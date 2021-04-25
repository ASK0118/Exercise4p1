package Exercise4p1;

public class Grapes extends Fruit{
	
	private int kJoules;
	private int amount;
	private String nutrition;
	
	public Grapes(String name, int kJ, int a, String n) {
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		this.nutrition = n;
	}
	
	public int calFoodE() {
		return this.amount * this.kJoules;
	}

	public String toString() {
		return "The " + this.amount + "-gram of " + name + " provided " ; 
	}
	
	public String getNutrition() {
		return this.nutrition;
	}
}
