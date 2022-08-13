package com.example.ecommerceapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unitprice")
	private Float unitprice;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "imageurl")
	private String imageurl;
	
	@Column(name = "productid")
	private Integer productid;
	
	
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}




	




	









	public Cart(Integer id, String name, String description, Float unitprice, Integer quantity, String imageurl,
			Integer productid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.imageurl = imageurl;
		this.productid = productid;
	}



















	public Integer getQuantity() {
		return quantity;
	}



















	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



















	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Float getUnitprice() {
		return unitprice;
	}




	public void setUnitprice(Float unitprice) {
		this.unitprice = unitprice;
	}




	public String getImageurl() {
		return imageurl;
	}




	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}




	public Integer getProductid() {
		return productid;
	}




	public void setProductid(Integer productid) {
		this.productid = productid;
	}





	
	
	
	
	
	
	

}
