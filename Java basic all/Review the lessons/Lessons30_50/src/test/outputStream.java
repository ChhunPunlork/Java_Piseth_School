package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStream {
	public static void main(String[] arqs) {
		String data = "I love Cambodia!";
		OutputStream output;
		try {
			output = new FileOutputStream("D:\\Java Project\\file for text\\OutputStr.txt", true);
			//output.write(data.getBytes());
			output.write("I am Lork.".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
