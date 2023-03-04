package com.learning.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaUsingComparator {

	public static void main(String args[]) {
		  List<Product> list=new ArrayList<Product>();  
          
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000f));  
	        list.add(new Product(3,"Keyboard",300f));  
	        list.add(new Product(2,"Dell Mouse",150f));  
	        
			
			Collections.sort(list, (a, b) -> {
				return a.name.compareTo(b.name);
			});
			 
	     
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        } 
	}
}
