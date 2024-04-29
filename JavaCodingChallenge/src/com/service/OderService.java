package com.service;
import java.sql.SQLException;
import java.util.List;

import com.exception.ResourceNotFoundException;
import com.model.Order;
import com.model.user;
import com.dao.Orderdao;
import com.dao.OrderdaoImpl;

public class OderService {
	
	Orderdao dao= new OrderdaoImpl();

	public void deleteByid(int id) throws SQLException, ResourceNotFoundException {
		boolean isIdValid = dao.findOne(id);
		   if(!isIdValid)
			  throw new ResourceNotFoundException("Id given is Invalid!!");
		 
		  dao.deleteByid(id); {
		 
		  }
		
	}


	public List<Order> getByOrder(int id) throws SQLException, ResourceNotFoundException  {
		boolean isidValid = dao.findOne(id);
		   if(!isidValid)
			throw new ResourceNotFoundException("Employee ID invalid");
	
        return dao.getByOrder(id);
}


	public List<user> findAll() throws SQLException{
		return dao.findAll();
	}		
	}


