package com.learning.lambdaexpressions;

public class ThreadsWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread td=new Thread();
		td.start();
		
		Runnable runnable=()->{
			System.out.println("started running");
		};
		
		Thread t2=new Thread(runnable);
		t2.start();
	}

}
