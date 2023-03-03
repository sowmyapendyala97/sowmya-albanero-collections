package com.learning.multithreading;

public class ThreadGroupExample implements Runnable{

	@Override
	public void run() {
System.out.println("Thred grp");		
	}
	
	
	public static void main (String arg[]) {
		ThreadGroupExample th=new ThreadGroupExample();
		ThreadGroup thg=new ThreadGroup("parent group");
		
		Thread t1=new Thread(thg, th, "g1");
		t1.start();
		
		
		Thread t2=new Thread(thg, th, "g4");
		t2.start();
		//System.out.println(t1.getName());
		t2.setPriority(1);
		t1.setPriority(4);
		System.out.println(thg.activeCount());
		
		System.out.println(thg.activeGroupCount());

	}
	

	
	
	
	
}
