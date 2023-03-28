package com.learning.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        
	      List<Float>  list= productsList.stream().filter(p -> p.price>25000f).map(p ->p.price).collect(Collectors.toList());
	      
	      list.forEach(e -> System.out.println(e));
	      
	     // productsList.stream().anyMatch(p->p.name.contains());
	}

}
