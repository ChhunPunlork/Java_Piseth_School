package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] arqs) {
		String fileName = "C:\\\\\\\\Users\\\\\\\\Asus\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\IOData.txt";
		FileReader fileReader = null;
		int data;
		try {
			fileReader = new FileReader(fileName);
			while((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
