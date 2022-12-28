package com.te.program1;

import java.util.Arrays;

public class UserMainCode {

	public static Integer[] removeTens(Integer[]array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==10)
			{
				array[i]=0;
			}
		}
		System.out.println(array);
		
		
		
		
		
		
		return array;
		
		
	}

	
}
