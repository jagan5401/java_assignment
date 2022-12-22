package com.problem1;
//Check Sum of the odd digits
public class UserMainCode {
public static Integer check(int n) {
	int sum=0;
	int a;
	while(n>0)
	{
		int t=n%10;
		sum=sum+t;
		n=n/10;
				
	}
	if(sum%2==0)
	{
		System.out.println("Sum of odd digits is even");
		a=-1;
	}
	else
	{
		System.out.println("Sum of the odd digits is odd");
		a=1;
	}
	return a ;
	
}
}
