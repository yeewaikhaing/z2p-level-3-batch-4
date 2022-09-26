package day20;

import java.nio.file.Files;
import java.nio.file.Path;

public class Writing_2 {

	public static void main(String[] args) {
		
		try(var writer = Files.newBufferedWriter(Path.of("src/testing.txt"))) {
			writer.write("Hello Bootcamper.");
			writer.write("Leve 4");
			writer.write("\n Level 3");
			writer.newLine();
			writer.write("Leve 2");
			writer.flush();
			writer.write("Level 1");
			System.out.println("Saved");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
