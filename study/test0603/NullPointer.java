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
			writer = Files.newBufferedWriter(file); // IOException�߻�����
			writer.write("@echo hello\n pause"); // IOException �߻� ����
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close(); // IOException �߻�����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
