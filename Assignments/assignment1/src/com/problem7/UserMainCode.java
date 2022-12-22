package com.problem7;
//Fibonacci Sum
public class UserMainCode {
	public static int getSumOfNfibos(int n) {
		
		int fib1=0;
		int fib2=1;
		int sum=0;
		int fib3=fib1+fib2;;
		while(n>0)
		{
		
			sum=sum+fib1;
			fib1=fib2;
			fib2=fib3;
		    fib3=fib1+fib2;
			n--;
		}
			
		return sum;
	}
}
