package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDeom {
	public static void main(String[] arqs) {
		// mango 10.50$
		// banana 12.0$
		// apple 25$
		Map<String, Double> MapFruit = new HashMap<>();
		MapFruit.put("Mango", 10.50);
		MapFruit.put("Banana", 15.0);
		MapFruit.put("Apple", 25.0);
		System.out.println(MapFruit);
		System.out.println("====================================");
//		Double BananaPrice = listFruit.get("Banana");
//		System.out.println(BananaPrice);
		
		
		//update element
//		listFruit.put("Banana", 15.00);
//		System.out.println(listFruit);
		//MapFruit.replace("Banana", 120.00);
		//MapFruit.replace("Banana", 120.0, 12.00);
		
		
		//remove element
		//MapFruit.remove("Banana", 12.0);
		
		//check
		//boolean exis = MapFruit.containsKey("Banana");
		
		//show Keys
//		System.out.println(MapFruit.keySet());
//		System.out.println(MapFruit.values());
//		System.out.println(MapFruit.entrySet());
		
		//loop threw keyset
//		Set<String> keys = MapFruit.keySet();
//		for(String fruits : MapFruit.keySet()) {
//			System.out.println(fruits);
//		}
		//Set<Entry<String, Double>> set = MapFruit.entrySet();
//		for(Entry<String, Double> entry : MapFruit.entrySet()) {
//			System.out.println(entry.getKey() + "==>" + entry.getValue());
//		}
		
		Map<String, Double> map2 = new HashMap<>(MapFruit);
		map2.put("Test", 00.99);
		System.out.println(map2);
	}
}