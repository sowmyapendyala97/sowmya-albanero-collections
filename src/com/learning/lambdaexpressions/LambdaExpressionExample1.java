package com.learning.lambdaexpressions;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Addition  a1= (a,b)->(a+b);
		
		Addition a1= (int a , int b) -> {
			return a+b;
		};
		
		System.out.println(a1.add(14, 15));
		

	}

}
