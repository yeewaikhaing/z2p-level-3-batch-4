package com.mmit.day8;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

import com.mmit.day7.Try_Catch;

public class ThrowingException {

	private static void checkMark(int mark) throws ArithmeticException{
		if(mark < 0 || mark > 100) {
			ArithmeticException obj = new ArithmeticException("Invalid mark");
			throw obj;
		}
	}
	public static void main(String[] args) {
		try {
			checkMark(1000);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	/*public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] numbers = {100, 200, 300};
			
			System.out.print("Enter position: ");
			var index = sc.nextInt();
			
			if(index >= numbers.length) {
//				IndexOutOfBoundsException obj = new IndexOutOfBoundsException();
//				throw obj;
				throw new IndexOutOfBoundsException();
			}
			
			System.out.println("Value: " + numbers[index]);
			
		} catch (Exception e) {
			System.err.println("Your input value is out of range");
		}
	}*/
}
