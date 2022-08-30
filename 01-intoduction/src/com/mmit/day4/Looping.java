package com.mmit.day4;

public class Looping {

	public static void main(String[] args) {
		String[] languages = {
				"Java", "Javascript", "Php", "Css"
		};
		
		for(String lang: languages) {
			if("php".equalsIgnoreCase(lang))
				break;
			System.out.println(lang);
		}
	}
}
