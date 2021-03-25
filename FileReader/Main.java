package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		File f = new File("/home/sebastiangil/eclipse-workspace/FPP/src/FileReader/test.txt");
		Path fileName = Path.of("/home/sebastiangil/eclipse-workspace/FPP/src/FileReader/MyCopy.txt");
		StringBuilder content = new StringBuilder();

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				content.append(sc.nextLine());
				content.append("\n");
			}

			Files.writeString(fileName, content);

		} catch (FileNotFoundException e) {
			System.out.println("The file: " + f.getName() + " could Not be found!");
			// e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

	}

}
