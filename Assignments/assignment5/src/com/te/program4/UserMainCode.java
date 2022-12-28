package com.te.program4;

import java.util.Arrays;

public class UserMainCode {

	public static int calculateMedian (Integer[] array) {
		int b=0;
		Arrays.sort(array);
		if(array.length%2!=0) {
			b=array[array.length/2];
		}
		else
		{
			System.out.println(array[array.length/2]);
			System.out.println(array[array.length/2-1]);
			//b=(int) Math.round(141/2);
			//(81+60)/2
			b=(int) Math.round((array[array.length/2])+(array[array.length/2-1]))/2;
		}
	
	
		

		return b;

	}

}
