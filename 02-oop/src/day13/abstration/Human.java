package day13.abstration;

public class Human implements Flying{

	@Override
	public void fly() {
		System.out.println("Human fly with parachute");
	}
}
