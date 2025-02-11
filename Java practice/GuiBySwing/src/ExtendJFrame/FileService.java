package ExtendJFrame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;

public class FileService {
	private static String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\Java practice\\Student.txt";
	
	public static void SaveFile(String name, String gender, int grade, int age) {
		File file = new File(fileName);
		try {
			Writer writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(name);
			bufferedWriter.write(gender);
			bufferedWriter.write(grade);
			bufferedWriter.write(age);
			
			bufferedWriter.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
