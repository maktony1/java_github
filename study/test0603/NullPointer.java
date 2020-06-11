package test0603;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NullPointer {

	public static void main(String[] args) {

		Path file = Paths.get("D:\\study\\Simple.bat");
		BufferedWriter writer = null;
		try {
			writer = Files.newBufferedWriter(file); // IOException발생가능
			writer.write("@echo hello\n pause"); // IOException 발생 가능
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close(); // IOException 발생가능
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
