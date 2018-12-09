package pl.sdacademy.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoExample {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("files", "sourceFile.txt");
		BufferedReader bufferedReader =
			new BufferedReader(new InputStreamReader(new FileInputStream(path.toFile())));
		String line = bufferedReader.readLine();
		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();

	}
}
