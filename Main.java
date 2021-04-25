package Exercise4p1;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		System.out.println("Info of Fruits");
		System.out.println("---------------");
		Fruit zFruit = new Fruit("Fruits");
		
		System.out.println("\nInfo of Apple");
		System.out.println("---------------");
		Apple qApple = new Apple("Apple", 3 , 10);
		System.out.println("Price of one apple: RM " + qApple.price);
		System.out.println("Total price of 3 apples: RM " + qApple.totPrice());
		
		System.out.println("\nInfo of Orange");
		System.out.println("---------------");
		Orange wOrange = new Orange("Orange", 47, 12.3, "sour");
		System.out.println("The taste of orange: " + wOrange.getTaste());
		System.out.println(wOrange.toString() + wOrange.calC());
		
		System.out.println("\nInfo of Grapes");
		System.out.println("---------------");
		Grapes xGrapes = new Grapes("Grapes", 288, 200, "Vitamin C, Vitamin K, Fiber");
		System.out.println(xGrapes.toString()+ xGrapes.calFoodE() + " kilojoules of food energy.");
		System.out.println("Nutrition of grapes: " + xGrapes.getNutrition());
		
		System.out.println("\nInfo of Green Apple");
		System.out.println("---------------");
		GreenApple aa = new GreenApple("Green Apple", 3 , 4, 0.2);
		System.out.println("Price of one green apple: RM " + aa.price);
		System.out.println(aa.toString()+ aa.Afdics());
		
		System.out.println("\nInfo of Fuji Apple");
		System.out.println("---------------");
		FujiApple FA = new FujiApple("Fuji Apple", 8, 4, 26.26, "Japan");
		System.out.println("Origin of "+ FA.name + ": " + FA.getPlace());
		System.out.println(FA.toString() + FA.calConvert() + " yen");
		
	}

}
