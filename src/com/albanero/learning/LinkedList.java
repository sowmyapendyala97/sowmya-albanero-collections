package com.albanero.learning;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new java.util.LinkedList<>();
		l.add("sowmya");
		l.add("s");
		l.add("saurabh");
		l.add("char");
		l.add("point");
		l.add("first");
		l.add("first");
		l.add("first");
		l.add(null);
		l.add(null);
		
		
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+",");
		}
		
		l.remove(4);
		System.out.println();
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ,");
		}
	}

}
