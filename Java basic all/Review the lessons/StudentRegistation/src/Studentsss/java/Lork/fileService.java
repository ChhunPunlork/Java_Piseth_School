package Studentsss.java.Lork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;

public class fileService {
	private static String fileName = "D:\\Java Project\\file for text\\StudentFile.txt";

	public static void saveToFile(String data) {
		File file = new File("fileName");
		try {
			FileWriter filewriter = new FileWriter(file);
			BufferedWriter bufferWriter = new BufferedWriter(filewriter);
			bufferWriter.write(data);
			bufferWriter.newLine();
			bufferWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
