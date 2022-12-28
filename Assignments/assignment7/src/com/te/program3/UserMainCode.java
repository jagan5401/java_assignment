package com.te.program3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	public static void removeMultiplesOfThree(List<Integer>list1) {
		List<Integer>list=new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			if((i+1)%3!=0)
			{
				list.add(list1.get(i));
			}
			
		}
		System.out.println(list);

		
	

	
	}
}
