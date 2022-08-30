package com.mmit.day4;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		//print_array();
		int[][] marks = {
				{ 100, 30, 90, 40, 50},
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100}
		};
		String[] names = {"Jeon", "Yuri", "Cherry"};
		int row = marks.length;
		int col = marks[0].length;
		
		//for(var r = 0; r < row;r++) {
		for(int[] a : marks) {
			System.out.println("a: " + Arrays.toString(a));
			int total = 0;
//			for(int c = 0; c < col;c++) {
//				total += marks[r][c];
//			}
			total = Arrays.stream(a).sum();
			double avg = Arrays.stream(a).average().getAsDouble();
			int min_mark = Arrays.stream(a).min().getAsInt();
			
			//System.out.println("Total mark obtained by " + names[r] + ": " + total + " marks");
			System.out.println("Average mark: " + avg + " marks");
			System.out.println("Minimun mark: " + min_mark + " marks");
			System.out.println("--------------");
		}
		
	}

	private static void print_array() {
		int[][] marks = {
				{ 100, 30, 90, 40, 50},
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100}
		};
		System.out.println("--- Print with for loop ----");
		int row = marks.length;
		for(var r = 0; r < row; r++) {// rows
			for(var c = 0; c < 5; c++) {// column
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("----- Print with for each loop -----");
		for(int[] arr : marks) {// rows
			for(var m : arr) {// cols
				System.out.print(m + "\t");
			}
			System.out.println();
		}
		
	}
}
