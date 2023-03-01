package com.albanero.learning;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v=new Vector<>();

for (int i = 0; i < 6; i++) {
	v.add(i);
}

System.out.print(v);

v.remove(4);
System.out.println();
v.set(4, 885);
v.add(4,54);
System.out.print(v);
	}

}
