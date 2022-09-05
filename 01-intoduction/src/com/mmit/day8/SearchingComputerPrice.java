package com.mmit.day8;

import java.util.Scanner;

public class SearchingComputerPrice {

	int age;
	boolean is_allow;
	
	{
		if(age < 18)
			is_allow = false;
		else
			is_allow = true;
	}
	
	static {
		
	}
	 static double[][] prices = { { 230.21, 400.21, 294.2, 693.33, 340.44, 691.99 },
			{ 529.483, 920.483, 676.66, 1594.659, 783.012, 1591.577 },
			{ 552.504, 960.504, 706.08, 1663.992, 817.056, 1660.776 },
			{ 690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97 } };

	static String[] cores = { "i3", "i4", "i5", "i6" };
	static String[] brands = { "lenovo", "hp", "samsung", "acer", "dell", "asus" };
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			display();
			String confirm = "";
			do {
				// search brand
				int brandIndex = searchBrand(sc);
				if(brandIndex == -1) {
					System.err.println("This brand does not exist");
				}
				else {// brand exist
					// search cpu
					int cpuIndex = searchCpu(sc);
					if(cpuIndex == -1)
						System.err.println("This CPU does not exist");
					else {// cpu exist
						// display price
						double price = prices[cpuIndex][brandIndex];
						System.out.print("Enter currency rate: ");
						double rate = Integer.parseInt(sc.nextLine());
						System.out.println("Price1: " + price + " $");
						System.out.println("Price2: " + (price * rate) + " ks.");
					}
				}
				System.out.println("Do you want to continue?(y/n) ");
				confirm = sc.nextLine();
				
				
			} while (confirm.equalsIgnoreCase("y"));
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static int searchCpu(Scanner sc) {
		System.out.print("Enter cpu: ");
		var cpu  = sc.nextLine();
		int index = -1;
		for(var i = 0; i < cores.length;i++) {
			if(cpu.equalsIgnoreCase(cores[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
	private static int searchBrand(Scanner sc) {
		System.out.print("Enter brand name: ");
		var brand = sc.nextLine();
		int index = -1;
		for(var i = 0; i < brands.length;i++) {
			if(brand.equalsIgnoreCase(brands[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
	private static void display() {
		System.out.print("\t");
		for(var brand: brands)
			System.out.print(brand + "\t");
		System.out.println();
		for(var i = 0; i < cores.length;i++) {
			System.out.print(cores[i] + "\t");
			for(var j = 0; j < brands.length;j++) 
				System.out.print(prices[i][j] + "\t");
			System.out.println();
		}
		
		
	}
}
