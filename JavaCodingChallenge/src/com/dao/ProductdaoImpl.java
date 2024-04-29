package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Productdto;
import com.model.Product;
import com.utility.DBConnection;


public class ProductdaoImpl implements Productdao {

	@Override
	public List<Product> getAllproduct() throws SQLException {
		Connection con =DBConnection.dbConnect();
		String sql="select * from Product";
		PreparedStatement pstmt =con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Product> list = new ArrayList<>();
		while(rst.next() == true) {
			
			int id=rst.getInt("id");
			String name=rst.getString("name");
			String describtion=rst.getString("description");
			int price=rst.getInt("price");
			int quantity_in_stock=rst.getInt("quantity_in_stock") ;
		
			
			Product product=new Product(id,name,describtion,price, quantity_in_stock);
			list.add(product);
		}
		
		DBConnection.dbClose();	
		return list;
	}

	@Override
	public int save(Product product) throws SQLException {
		Connection con =DBConnection.dbConnect();
		String sql="insert into product (id, name, description, price, quantity_in_stock, type)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1, product.getId());
		pstmt.setString(2, product.getName());
		pstmt.setString(3,product.getDescribtion());
		pstmt.setInt(4, product.getPrice());
		pstmt.setInt(5, product.getQuantity_in_stock());
		
		int status = pstmt.executeUpdate();
		DBConnection.dbClose();	
		return status;
	}
}
