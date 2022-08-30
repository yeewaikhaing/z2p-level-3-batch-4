package com.mmit.day2;

import java.time.LocalDate;
import java.time.Period;

public class TypeCasting_1 {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.parse("2020-11-25"); 
		LocalDate endDate = LocalDate.parse("2021-10-02");
		int month = Period.between(startDate, endDate).getMonths(); 
		int days = Period.between(startDate, endDate).getDays(); 
		System.out.println("No of months :" + month); 
		System.out.println("No of days :" + days);
		System.out.println("No of year: " + Period.between(startDate, endDate).getYears());
	}
}

class Person {
	private String name; // instance name
	private static int age; // static var
	void display() { // instance method
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		test();
		show();
	}
	
	void test() {
		System.out.println("this is test");
	}
	static void show() { // static method
		System.out.println("This is static method");
		//System.out.println("name: " + name);
		System.out.println("age: " + age);
		//test();
		displayanother();
		//System.out.println("name: " + this.name);
		Person obj = new Person();
		obj.test();
		
	}
	
	static void displayanother() {
		
	}
}

class Student extends Person{
	
}
class Teacher extends Person {
	
}
