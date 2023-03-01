package com.albanero.learning;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s= new HashSet<>();
		s.add(5);
		s.add(null);
		s.add(85);
		s.add(0);
		s.add(0);
		s.add(null);
		
		
		for (Integer integer : s) {
			System.out.print(integer+" ");
		}

	}

}
