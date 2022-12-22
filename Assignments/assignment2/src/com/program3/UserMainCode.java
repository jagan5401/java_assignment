package com.program3;
//Sum Square f Digits
public class UserMainCode {
	public static Integer SumOfSquareOfDigits(Integer number) {
		Integer sum=0;
		while(number>0)
		{
			int t=number%10;
			sum=sum+(t*t);
			number=number/10;
		}
		return sum;
		
		
	}


}
	

	


