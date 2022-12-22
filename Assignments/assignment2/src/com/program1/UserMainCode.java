package com.program1;

import java.util.Iterator;
//Even odd index sum
public class UserMainCode {
	public static String SumOfOddEvenPositioned(int number) {
		int length=0;
		int copy=number;
		while(copy>0)
		{
			 copy=copy/10;
			 length++;
		}
		int array[]=new int[length];
		for(int i=length-1;i>=0;i--)
		{
			array[i]=number%10;
			number=number/10;
		}
		int sumodd=0;
		int sumeven=0;
		for(int j=0;j<=length-1;j++)
		{
			if(j%2==0)
			{
				sumeven=sumeven+array[j];
			}
			else
			{
				sumodd=sumodd+array[j];
			}
		}
		if(sumeven==sumodd)
		{
			return "yes";
		}
		else
		{
			return "no";
		}
		
		
		
		
		
		
		
		
		
	}

	

	

}
