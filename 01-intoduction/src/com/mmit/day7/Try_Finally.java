package com.mmit.day7;

import java.util.Scanner;

public class Try_Finally {

	public static void main(String[] args) {
		// open
					Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Enter salary: ");
			var salary = sc.nextInt();
			if(salary == 0) {
				return;
			}
			System.out.println("Your salary is " + 100/0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			//sc.close();
			System.out.println("It is always executed");
		}
		System.out.println("outside try finally block");
	}
}
