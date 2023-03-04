package com.learning.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
        
       List<Product> elist= list.stream().filter(e -> e.price >25000f).collect(Collectors.toList());
       
       elist.forEach(e -> System.out.println(e.name));
	}

}
