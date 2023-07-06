package com.ibm.project23_4jul;

import java.io.*;
import java.util.*;

import model.Product;

public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
		ObjectOutputStream output=null;
		ObjectInputStream input=null;
		try {

			inputStream = new FileInputStream("/customer-project/data.ser");
			outputStream = new FileOutputStream("/customer-project/data.ser");
			output = new ObjectOutputStream(outputStream);
			input=new ObjectInputStream(inputStream);
			
			Product product = new Product("a1", 3.3, 1);
			Product product1 = new Product("a2", 4.4, 2);
			List<Product> list=new ArrayList<>();
			list.add(product);
			list.add(product1);
			output.writeObject(list);
			Object ob = input.readObject();
			List<Product> li=null;
			if(ob instanceof List) {
				li=(List<Product>)ob;
			}
			
			for(Product p : li) {
				System.out.println(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			input.close();
			output.close();
		}
	}
}
