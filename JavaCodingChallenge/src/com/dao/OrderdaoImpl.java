package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dao.Orderdao;
import com.exception.ResourceNotFoundException;
import com.model.Order;
import com.model.user;
import com.utility.DBConnection;

public class OrderdaoImpl implements Orderdao{

	@Override
	public void deleteByid(int id) throws SQLException, ResourceNotFoundException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="delete from orders where product_id=?";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();
		
	}

	@Override
	public boolean findOne(int id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql ="Select product_id from orders where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, (int) id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<user> findAll() throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select * from user";
		PreparedStatement pstmt = con.prepareStatement(sql);
	    ResultSet rst = pstmt.executeQuery();
	    List<user> list = new ArrayList<>();
	    
	    while(rst.next() == true) {
	    	int id=rst.getInt("id");
	    	String name=rst.getString("name");
	    	String password=rst.getString("password");
	    	String role=rst.getString("role");
	    	
	    	user u=new user(id,name,password,role);
	    	list.add(u);
	    	
	    }
		DBConnection.dbClose();	
		return list;
	}

	@Override
	public List<Order> getByOrder(int user_id1) throws SQLException {
		Connection con = (Connection) DBConnection.dbConnect();
		String sql="select * from orders\r\n"
				+ "    where user_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
	    pstmt.setInt(1,user_id1);
	    ResultSet rst = pstmt.executeQuery();
	    List<Order> list = new ArrayList<>();
	    while(rst.next() == true) {
	    	
	    	int id=rst.getInt("id");
	    	int user_id=rst.getInt("user_id");
	    	int product_id=rst.getInt("product_id");
	    	
	    	Order order=new Order(id,user_id,product_id);
	    	list.add(order);
	    }
	    
		DBConnection.dbClose();	
		return list;
	}

}
