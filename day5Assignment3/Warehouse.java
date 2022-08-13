package day5Assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Warehouse {

	CategoryGrouper categoryGrouper;

	List<Product> products = new ArrayList<Product>();

	public Warehouse(CategoryGrouper categoryGrouper) {
		super();
		this.categoryGrouper = categoryGrouper;
	}

	public List<Product> fetch(String category) {

		HashMap<String, List<Product>> hashMap = categoryGrouper.getHashMap();

		Iterator<Map.Entry<String, List<Product>>> itr = hashMap.entrySet().iterator();
		int count = 0;
		try {
			while(itr.hasNext())
			{
				Map.Entry<String, List<Product>> entry = itr.next();
				if(entry.getKey().equals(category)) {
					count = count + 1;
					for(Product p: entry.getValue()) {
						products.add(p);
					}
				}

				if(count == 0) {
					throw new InvalidCategoryException("There is no item matching with category " + category);
				}

			}
		}catch(InvalidCategoryException e) {
			e.printStackTrace();
		}
		return products;



	}

}
