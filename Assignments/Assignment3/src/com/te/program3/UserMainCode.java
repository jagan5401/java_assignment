package com.te.program3;

import java.util.Arrays;

public class UserMainCode {
	static Integer getBigDiff(Integer array[]){
		Arrays.sort(array);
		//System.out.println(array[array.length-1]);
		
		
		return array[array.length-1];
	}
}
