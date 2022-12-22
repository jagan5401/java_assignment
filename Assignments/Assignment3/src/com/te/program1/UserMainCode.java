package com.te.program1;

public class UserMainCode {
	static double getSumOfPower(Integer array[]){
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum=(int)(sum+Math.pow(array[i], i));
		}
		System.out.println(sum);
		return sum;
	}
}
