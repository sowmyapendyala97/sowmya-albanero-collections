package com.albanero.learning;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	LinkedHashSet<String> lhs = new LinkedHashSet<>();
		  
	        lhs.add("s");
	        lhs.add("som");
	        lhs.add("sommme");
	        lhs.add("fast");
	        lhs.add("s");
	        lhs.add("S");
	        lhs.add("som");
	        
	       Iterator<String> s = lhs.iterator();
	       
	       while(s.hasNext()) {
	    	   System.out.println(s.next());
	       }

	}

}
