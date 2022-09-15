package day14;

import java.util.List;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		
		ShowingData data1 = (a) -> System.out.println(a);
		data1.display("Aung Aung");
		data1.display("Su Su");
		
		Operation add = (a, b) -> a + b;
		Operation sum = (a, b) -> a - b;
		Operation div = (a, b) -> a / b;
		
		System.out.println("100 + 200 = " + add.opreate(100, 200));
		System.out.println("100 - 200 = " + sum.opreate(100, 200));
		System.out.println("100 / 200 = " + div.opreate(100, 200));
		
		LoginService loginSerice = (email, pass) -> {
			if(email.equals("admin@gmail.com") && pass.equals("123"))
				return true;
			else
				return false;
		};
		
		if(loginSerice.checklogin("admin@gmail.com", "123"))
			System.out.println("Login success");
		else
			System.out.println("Invalid login");
		System.out.println("----------------------");
		
		List<String> languages = List.of("Java", "Php", "Javascript", "Css");
		
		languages.forEach( str -> {
			if(str.contains("Java"))
				System.out.println(str);
		});
		
		
	}
}

@FunctionalInterface
interface ShowingData {

	void display(String name);
}
@FunctionalInterface
interface Operation {
	int opreate(int num1, int num2);
}

@FunctionalInterface
interface LoginService  {
	boolean checklogin(String email, String password);
}


	
