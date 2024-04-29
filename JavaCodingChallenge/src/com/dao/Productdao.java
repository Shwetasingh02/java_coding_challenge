
package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.Productdto;
import com.model.Product;

public interface Productdao {

	public List<Product> getAllproduct() throws SQLException;
	int save(Product product) throws SQLException;
	
		
	

}
