package com.te.program5;

import java.util.Arrays;

public class UserMainCode {
	static Integer sumCommonElements (Integer array1[], Integer[] array2){
		Integer comman=0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if(array1[i]==array2[j]) {
					comman+=array1[i];
				}
			}
		}
		
		
		return comman;
	}
}
