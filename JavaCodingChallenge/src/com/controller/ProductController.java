package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.model.Product;
import com.service.ProductService;

public class ProductController {
	
	public static void main(String[] args) {
		ProductService  productService  =new ProductService ();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("============Product Menu============");
			System.out.println("Press 1 : Get all Product ");
			System.out.println("Press 2 : create product");
			System.out.println("Press 0 : To exits");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exit Product Module.");
				break;
			}
			switch(input) {
			
			case 1:try {
				List<Product> product= productService.getAllproduct();
				for(Product p : product) {
					System.out.println(p);
				}
			}
				catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
			
			case 2: 
				
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber; 
				
				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();   
				
				System.out.println("Enter Description");
				String description=sc.nextLine();
				
				System.out.println("Enter Price");
				int price=sc.nextInt();
				
				System.out.println("Quantity");
				int quantity_in_stock=sc.nextInt();
				
				Product product = new Product(id,name,description,price,quantity_in_stock);
				
				try {
					int status = productService.insert(product);
					if(status == 1)
						System.out.println("Product record added to DataBase");
					else
						System.out.println("Insert operation failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				break; 
			}
		
		
	}
	}
}
