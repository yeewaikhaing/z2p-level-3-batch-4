package day20;

import java.io.IOException;
import java.net.StandardSocketOptions;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Writing_1 {

	public static void main(String[] args) throws IOException {
		var sc = new Scanner(System.in);
		
		var list = new ArrayList<String>();
		
		for(var i = 0; i < 5;i ++) {
			System.out.print("Enter data");
			list.add(sc.nextLine());
		}
		
		Path path = Path.of("/Users/yeewaikhaing/testing/output.txt");
		Files.write(path, list, StandardOpenOption.APPEND);
		System.out.println("---- Saved-----");
		
		Files.writeString(path,"Myanmar IT Consulting", StandardOpenOption.APPEND );
		System.out.println("--- Save new Data---");
	}
}
