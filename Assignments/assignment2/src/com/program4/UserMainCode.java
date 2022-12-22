package com.program4;
//Programming Logic
public class UserMainCode {
	public static Integer getLuckySum(Integer a, Integer b, Integer c) {
		Integer sum=0;
		if(a!=13&&b!=13&&c!=13)
		{
			sum=a+b+c;
		}
		else if(a==13&&b==13&&c==13)
		{
			sum=0;
		}
		else if(a==13&&b==13)
		{
			sum=0;
		}
		else if(b==13&&c==13)
		{
			sum=a;
		}	
		else if(a==13&&c==13)
		{
			sum=0;
		}
		else if(a==13)
		{
			sum=c;
		}
		else if(b==13)
		{
			sum=a;
		}
		else if(c==13)
		{
			sum=a+b;
		}
		
		
		
			
		
		return sum;
		
		
	}


}
	

	


