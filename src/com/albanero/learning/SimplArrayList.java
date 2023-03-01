package com.albanero.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimplArrayList {
	
	
	public static void main (String args[]) {
		List<Integer> list=new ArrayList<>();
		
		list.add(5);
		list.add(78);
		list.add(0);
		list.add(0);
		//list.add(null);
		list.add(8);
		list.add(788);
		//list.add(null);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		
		list.remove(5);
		//list.add(7,55);
		System.out.println();
		System.out.println("list size "+list.size());
		
		//sorting list
		Collections.sort(list);
	
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
	

}
