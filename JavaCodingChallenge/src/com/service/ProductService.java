package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.Productdao;
import com.dao.ProductdaoImpl;
import com.dto.Productdto;
import com.model.Product;

public class ProductService {
	
	Productdao dao= new  ProductdaoImpl();

	public List<Product> getAllproduct() throws SQLException{
		return dao.getAllproduct();
	}

	public int insert(Product product) throws SQLException{
		return dao.save(product);
	
	}

}
