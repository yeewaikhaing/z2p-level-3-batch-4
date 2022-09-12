package day11.inheritance;

public class Person {

	private String name;
	protected String phone;
	
	//"Jeon", "09123456"
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}
	
//	public static void main(String[] args) {
//		//B obj = new B();
//		B obj = new B(100);
//	}
}

class A {
	
	public A(){
		System.out.println("A's default constructor");
	}
	public A(int a) {
		System.out.println("A's argument constructor");
	}
}
class B extends A{
	public B() {
		//super(100);
		System.out.println("B's default constructor");
	}
	
	public B(int x) {
		super(x);
		System.out.println("B's argument constructor");
	}
}




