package com.te.program2;

import java.util.Arrays;

public class UserMainCode {
	static Integer getBigDiff(Integer array[]){
		Arrays.sort(array);
		
		
		return array[array.length-1]-array[0];
	}
}
