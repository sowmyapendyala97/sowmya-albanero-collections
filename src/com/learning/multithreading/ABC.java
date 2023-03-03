package com.learning.multithreading;

public class ABC implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC abc=new ABC();
Thread t1=new Thread(abc);
t1.start();
	}

	@Override
	public void run() {
		System.out.println("implementing runnable");
		
	}

}
