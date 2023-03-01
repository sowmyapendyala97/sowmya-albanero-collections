package com.albanero.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> l = new ArrayList<>();  
	    
        l.add("sub");  
        l.add("index");  
        l.add("alogrithm");  
        l.add("java");  
        l.add("8 features");  
        l.add("8 features");  
        
       l=  Collections.synchronizedList(l);
       
		/*
		 * for (String string : l) { System.out.println(string); }
		 */
       
       Collections.sort(l,Collections.reverseOrder());
      
       synchronized (l) {
		Iterator<String> itr=l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
       //making the collection as read only
       //Collection<String> unlist =Collections.unmodifiableCollection(l);
	/*
	 * unlist.add("ssds");
	 * 
	 * for (String string : unlist) { System.out.print(string+" "); }
	 */
  
	}

}
