package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckException {

	public static void main(String[] args) {
		File file = new File("D:\\Java Project\\Person.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine()); 
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

}
