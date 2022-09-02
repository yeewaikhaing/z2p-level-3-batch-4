package com.mmit.day8;

import java.util.Scanner;

class Assignment1 {
	int[] array;
	
	public Assignment1(String[] data) {
		// {}
		// convert each item in data array to int type and assign int[]
		
		//find total
		
		// find max
		
		// find min
		
		// find avg
		
		//display output
	}
}
class InvalidAgeException  extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		super("Unknow message");
		System.out.println("....default constructor....");
		
	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class CustomException {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			var age = sc.nextInt();
			validateAge(age);
		}
		catch (InvalidAgeException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException{
		if(age < 18) {
			InvalidAgeException obj = new InvalidAgeException("Invalid Age");
			throw obj;
		}
		else {
			System.out.println("You can smoke!");
		}
	}
}


