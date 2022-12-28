package com.te.program7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserMainCode {

	public static Integer sumElements(Integer[] array) {
int largestspan=array[0];
int count=0;
int max=0;
Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i-1]) {
				count++;
			}
			else {
				count=1;
			}
			if(count>max)
			{
				max=count;
				largestspan=array[i-1];
			}

		}
		return largestspan;
	}
	
}
