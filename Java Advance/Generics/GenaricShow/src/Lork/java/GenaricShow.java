package Lork.java;

import java.util.ArrayList;
import java.util.List;

public class GenaricShow {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Lork");
		//list.add(Integer.valueOf(5));
		for(String obj : list) {
			//String str = (String) obj;
			System.out.println(obj);
		}
	}

}
