package com.learning.multithreading;

public class ThreadState extends Thread{

 public void run() {
	 System.out.println("Thread started");
	 for(int i=1;i<5;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try{Thread.sleep(500);
		   // System.out.println("thred state"+Thread.currentThread().getState());
		    }
		    catch(InterruptedException e){
		    	System.out.println(e);}    
		    System.out.println(i);    
		  }    
 }
 
 public static void main(String args[]) {
	 ThreadState ts=new ThreadState();
	 ThreadState ts2=new ThreadState();
	 ThreadState t3=new ThreadState();
	// ts.start();
	//ts2.start();
	 ts.setPriority(8);
	 ts2.setPriority(3);
	 t3.setPriority(MIN_PRIORITY);
	 
	 ts.start();
	 
	 try {
		 ts.join();
	 }
	 catch (InterruptedException e) {
		e.printStackTrace();
	}
	 ts2.start();
	
	 t3.start();
	 
		/*
		 * try { ts.sleep(100); System.out.println("sleeping"); }catch (Exception e) {
		 * e.printStackTrace(); }
		 */
 }

}
