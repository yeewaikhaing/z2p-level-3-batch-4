package day13.abstration;

public class DemoPolymorphism {

	public static void main(String[] args) {
		Flying[] data = new Flying[3];
		
		var obj1 = new Human();
		
		data[0] = obj1;
		data[1] = new Bird();
		data[2] = new Airplane();
		// i < 4
		for(var i = 0; i < data.length;i++) {//i= 0, 1, 2, 3
			data[i].fly(); 
		}
		
	}
}
