package com.te.program2;

import java.util.Arrays;

public class UserMainCode {

	public static Integer addAndReverse(Integer[]array,Integer number1) {
		int check = 0;
		int sum = 0;
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			if(number1==array[i])
			{
				check=i;
				break;
			}
		}
		for (int i = check+1; i < array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum);
		int rev=0;
		while(sum>0)
		{
			int t=sum%10;
			rev=rev*10+t;
			sum=sum/10;
		}
		
		
		
		
		
		
		return rev;
		
		
	}

	
}
