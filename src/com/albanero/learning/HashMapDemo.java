package com.albanero.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(4, null);
		map.put(0, "gdd");
		map.put(78, "jomp");
		map.put(78, "jomp");

		for (Entry<Integer, String> string : map.entrySet()) {
			System.out.println(string.getKey() +" "+string.getValue());
		}
	}

}
