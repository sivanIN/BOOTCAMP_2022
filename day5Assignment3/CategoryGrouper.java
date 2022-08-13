package day5Assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoryGrouper {

	HashMap<String, List<Product>> hashMap = new HashMap<String, List<Product>>();

	public HashMap<String, List<Product>> groupByCategory(List<Product> products) {

		for(Product p : products) {
			if(!hashMap.containsKey( p.getCategory())) {
				List<Product> categorized_list = new ArrayList<Product>();
				categorized_list.add(p);
				hashMap.put(p.getCategory(), categorized_list);	
			}
			else {
				hashMap.get(p.getCategory()).add(p);
			}
		}

		return hashMap;


	}

	public HashMap<String, List<Product>> getHashMap() {
		return hashMap;
	}

	public void setHashMap(HashMap<String, List<Product>> hashMap) {
		this.hashMap = hashMap;
	} 


}
