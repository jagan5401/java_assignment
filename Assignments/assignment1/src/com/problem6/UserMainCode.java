package com.problem6;
//Pallindrome in Range
public class UserMainCode {
	public static int addPallindromes(int number1,int number2) {
		int total=number2-number1;
		int array[]=new int[total];
		int index=0;
		for(int i=number1;i<=number2;i++)
		{
			if(number1>10)
			{
				int rev=0;
				int copy1=i;
				
				while(copy1>0)
				{
					int t=copy1%10;
					rev=rev*10+t;
					copy1=copy1/10;
				}
				if(rev==i)
				{
					array[index]=i;
					index++;
				}
			}
		}
		int sum=array[0]+array[1];
			
		return sum;
	}
}
