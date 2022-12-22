package com.program2;

public class UserMainCode {
	public static Integer sumOfNonPrimeNumbers(Integer number) {
		int sum=0;
		int count = 0;
		while (number > 0) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0)

				{
					count++;

				}
				
			}
				if(count>2 || number==1)
				{
					
				}
			
			count=0;
			number--;
		}

		return sum;

	}

}
