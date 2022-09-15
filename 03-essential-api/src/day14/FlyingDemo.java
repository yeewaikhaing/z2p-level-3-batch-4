package day14;

public class FlyingDemo {

	public static void main(String[] args) {
		
		
		Flying bird1 = (str) -> System.out.println(str + " fly with wings");
		Flying plane1 = (type) -> System.out.print(type + " fly with engine");
		
		bird1.fly("Birds");
		plane1.fly("Airplanes");
	}
}
