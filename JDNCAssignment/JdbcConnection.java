package JDNCAssignment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JdbcConnection {


	public Connection createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/NPCI","root","sivan");

		return connect; 


	}

	public String insertCategory(Category category) throws ClassNotFoundException, SQLException {

		Connection connect= createConnection();

		PreparedStatement p = connect.prepareStatement("insert into Category values(?,?)");
		p.setInt(1,category.getCategory_id());
		p.setString(2, category.getCategory_name());

		int i = p.executeUpdate();
		return i +" row is inserted";

	}

	public String insertProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection connect = createConnection();
		PreparedStatement p = connect.prepareStatement("insert into Product values(?,?,?,?,?,?,?,?,?)");
		p.setInt(1, product.getProduct_id());
		p.setString(2, product.getProduct_name());
		p.setString(3, product.getDescription());
		p.setInt(4,product.getUnits_in_stock());
		p.setFloat(5,product.getUnit_price());
		p.setString(6, product.getImage_url());
		p.setDate(7, product.getDate_last_updated());
		p.setDate(8, product.getDate_created());
		p.setInt(9, product.getCategory_id());

		int i = p.executeUpdate();
		return i +" row is inserted";

	}

	public ArrayList<Product> getProductByCategory(String category) throws SQLException, ClassNotFoundException {
		Connection connect = createConnection();

		PreparedStatement p = connect.prepareStatement("select * from Product inner join Category on Product.category_id = Category.catgeory_id where category_name= ?");
		p.setString(1, category);
		
		ResultSet r = p.executeQuery();
		
        ArrayList<Product> products = new ArrayList<>();
        
		
		while (r.next()) {
			
			Category category2 = new Category(r.getInt(9),r.getString(11));
			products.add(new Product(r.getInt(1),r.getString(2),r.getString(3),r.getInt(4) ,r.getFloat(5),r.getString(6),r.getDate(7),r.getDate(8) ,r.getInt(9),category2));
			
		}

		r.close();
		p.close();
		connect.close();
		
		if(products.size() == 0) {
			
			
			
			System.out.println("There is no product found for category: " + category);
		}
		
		return products;
	}
}
