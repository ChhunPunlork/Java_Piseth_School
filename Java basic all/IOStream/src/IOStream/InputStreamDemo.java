package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] arqs) {
		FileInputStream fileInputStream = null;
		String fileName = "C:\\\\Users\\\\Asus\\\\OneDrive\\\\Desktop\\\\IOData.txt";
		int data;

		try {
			fileInputStream = new FileInputStream(fileName);
			data = fileInputStream.read();
			System.out.println((char) data);
			fileInputStream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
