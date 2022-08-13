package JDNCAssignment;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductCategory {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		JdbcConnection jdbcConnection = new JdbcConnection();

//		while(i < 3) {
//
//			System.out.println("Enter category Id");
//			int category_id = sc.nextInt();
//			System.out.println("Category name");
//			String category_name = sc.next();sc.nextLine();
//			Category category = new Category(category_id, category_name);
//
//			String insertCategory = jdbcConnection.insertCategory(category);
//			System.out.println(insertCategory);
//			n++;
//
//		}

	
//		Product product = new Product(104, "Toy Bus", "Blue in color", 10, 700, "https://m.media-amazon.com/images/I/61aOcsw3vsS._AC_SL1500_.jpg", java.sql.Date.valueOf("2022-03-01"),java.sql.Date.valueOf("2022-04-25"),1);
//		Product product2 = new Product(102, "saree", "Kalyan special silks", 100, 2000, "data:image/png;babn+FyG+YO6rUf0Uf9D8DJvg3gUM4+QAAAABJRU5ErkJggg==", 2022-03-01, 2022-03-01, 2);
//		Product product3 = new Product(103, "Mobile", "Poco M3", 10, 10000, "data:image/png;babn+FyG+YO6rUf0Uf9D8DJvg3gUM4+QAAAABJRU5ErkJgggdfgjk==", 2022-03-01, 2022-03-01, 3);
//		String insertProduct = jdbcConnection.insertProduct(product);
//		System.out.println(insertProduct);
		
		ArrayList<Product> productByCategory = jdbcConnection.getProductByCategory("Toys");

		productByCategory.forEach( n -> System.out.println(n));
		
	}

}
