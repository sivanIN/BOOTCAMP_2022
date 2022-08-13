package day5Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day5Assignment4.CabCustomer;

public class Product_Details {
	public static void main(String[] args)  {
		List<Product> product_list = new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);

		for(int i = 0;i<3;i++) {

			System.out.print("Enter Product name= ");
			String product_name = scanner.nextLine();

			System.out.print("Enter product quantity= ");
			int product_quantity = scanner.nextInt();

			System.out.print("Enter price= ");
			float product_price = scanner.nextFloat();
			scanner.nextLine();
			System.out.print("Enter Product category= ");
			String product_category = scanner.nextLine();


			Product product=  new Product(product_name, product_quantity, product_price, product_category);
			Product_Details product_Details = new Product_Details();
			product_Details.addProductList(product,product_list );


		}



		CategoryGrouper categoryGrouper = new CategoryGrouper();

		categoryGrouper.groupByCategory(product_list); 

		Warehouse warehouse = new Warehouse(categoryGrouper);
		System.out.println("Fetch product by category");
		String categorie = scanner.nextLine();
		System.out.println(warehouse.fetch(categorie)); 


	}

	public void addProductList(Product product, List<Product> product_list) {

		try {
			if(product.getQuantity() < 0) {
				throw new InvalidQuantityException("Invalid quantity,accept only this  (eg,1 2 5 7)");
			}
			if(product.getPrice() < 0) {
				throw new InvalidPriceException("price should be  negative");
			}
			product_list.add(product);

		}catch(InvalidPriceException e) {
			e.printStackTrace();
		}catch(InvalidQuantityException e) {
			e.printStackTrace();
		}

	}


}





