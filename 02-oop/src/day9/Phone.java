package day9;

public class Phone {

	// fields
	String brand;
	String color;
	int price;
	
	static String shop = "Abc";
	// constructors
	public Phone(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	// methods
	public void call() {
		
		System.out.println("This is phone calling method");
	}
	
	public void sendSms() {
		System.out.println("This is sending sms method");
	}
	
	public static void main(String[] args) {
		// creating obj
		Phone obj;// declare obj
		obj = new Phone("iPhone", "pink", 3100000); // create object
		
		Phone obj2 = new Phone("Samsung", "purple", 3200000);
		
		System.out.println("----- obj1's data -----");
		System.out.println("Brand: " + obj.brand);
		System.out.println("Color: " + obj.color);
		System.out.println("Price: " + obj.price);
		System.out.println("Shop name: " + obj.shop);
		obj.call();
		obj.sendSms();
		
		//obj.shop = "iSure";
		Phone.shop = "iSure";
		System.out.println("----- obj2's data -----");
		System.out.println("Brand: " + obj2.brand);
		System.out.println("Color: " + obj2.color);
		System.out.println("Price: " + obj2.price);
		System.out.println("Shop name: " + obj2.shop);
		obj2.call();
		obj2.sendSms();
		
		
	}
}
