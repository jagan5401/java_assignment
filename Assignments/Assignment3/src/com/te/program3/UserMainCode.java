package com.te.program3;

import java.util.Arrays;

public class UserMainCode {
	static Integer getBigDiff(Integer array[]){
		Integer a=array[0];
		Integer b=array[array.length-1];
		Integer c=array[array[array.length/2]];
		
		
		return (c>((a>b)?a:b)?c:(a>b)?a:b);
	}
}
