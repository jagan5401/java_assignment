package com.te.program4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	public static void convertToStringArray(List<String>list1) {
		
		String[]string=new String[list1.size()];
		Collections.sort(list1);
		list1.toArray(string);
		System.out.println(Arrays.toString(string) );
	

	
	}
}
