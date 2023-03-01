package com.albanero.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();  
		list.add(566);  
		list.add(230);  
		list.add(123);  
		list.add(110);  
		list.add(689);  
		list.add(12);  
		list.add(95);  
		list.add(566);  
		list.add(566); 
		list.add(110); 
		
		
		for (Integer integer : list) {
			System.out.print(integer +" ");
		}
		
		Set<Integer>  set=new HashSet<>();
		set.addAll(list);
		System.out.println();
		
		for (Integer set1 : set) {
			System.out.print(set1 +" ");
		}
		
		
	}
}
