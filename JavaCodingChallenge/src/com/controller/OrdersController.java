package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.model.Order;
import com.model.user;
import com.exception.ResourceNotFoundException;
import com.service.OderService;

public class OrdersController {
	
	public static void main(String[] args) {
		OderService oderService=new OderService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("============order Menu============");
			System.out.println("Press 1 : Delete Order");
			System.out.println("Press 2 : getOrderByUser");
			System.out.println("Press 0 : To exits");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exit order Module.");
				break;
			}
			switch(input) {
			
			case 1:
				System.out.println("Enter Order Id");
				try {
					oderService.deleteByid(sc.nextInt());
					System.out.println("Order record deleted.");
				} catch (SQLException e) {
					 System.out.println(e.getMessage());
				} catch (ResourceNotFoundException e) {
					 System.out.println(e.getMessage());
				}		
			
			break;
			
			case 2:
				
				try {
					
					List<user> list =oderService.findAll();
					for( user u : list) {
						System.out.println(u);
					}
					
					System.out.println("Enter user ID");
					int id = sc.nextInt();
					List<Order> Record = oderService.getByOrder(id);
					for( Order o : Record) {
						System.out.println(o);
					}
				}
				
				catch(SQLException e) {
				System.out.println(e.getMessage());
			    }catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
		break;
				
				
			}
			
	}
	}
}
