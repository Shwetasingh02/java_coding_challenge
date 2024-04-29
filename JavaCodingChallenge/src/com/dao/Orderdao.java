package com.dao;

import java.sql.SQLException;
import java.util.List;
import com.exception.ResourceNotFoundException;
import com.model.Order;
import com.model.user;

public interface Orderdao {

	void deleteByid(int id) throws SQLException,ResourceNotFoundException;
	boolean findOne(int id)throws SQLException;
	List<user>findAll() throws SQLException;
	List<Order> getByOrder(int id)throws SQLException;
		
		
	

}
