package com.learning.multithreading;

public class MultiThreadingNoSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table t=new Table();

Thread1 t1=new Thread1(t);

Thread2 t2=new Thread2(t);

t1.start();
t2.start();
	}

}
