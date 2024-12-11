package Main_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import Main_Demo_FileSevice.File_Service;

public class Fruit_Shop_Service {
	private List<Fruit> fruits = new ArrayList<>();
	private int nextId;
	private File_Service file_Service;
	
	public Fruit_Shop_Service() {
		this.fruits = new ArrayList<>();
		this.nextId = 1;
	}
	
	public void AddFruit(String name, double price, int quatity) {
		Fruit fruit = new Fruit(name, price, quatity);
		fruits.add(fruit);
		System.out.println("Add successfully" + fruit);
	}
	
	public void ListFruit() {
		file_Service.ReadFromFile();
	}
}