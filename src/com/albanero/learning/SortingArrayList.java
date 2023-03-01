package com.albanero.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

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
		
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.print(integer +" ");
		}

		Collections.sort(list,Collections.reverseOrder());
		System.out.println();
		for (Integer integer : list) {
			System.out.print(integer +" ");
		}

	}

}
