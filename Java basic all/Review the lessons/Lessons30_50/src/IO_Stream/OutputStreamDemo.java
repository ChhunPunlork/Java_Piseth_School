package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) {
		try {
			String text = "I'm Punlork. ";
			OutputStream output = new FileOutputStream("D:\\\\Java Project\\\\file for text\\\\data.txt", true);
			output.write(text.getBytes());
			output.write("I am from Cambodia.".getBytes());
			output.close();
			System.out.println("Successed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
