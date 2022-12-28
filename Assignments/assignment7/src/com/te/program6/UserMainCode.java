package com.te.program6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	public static List generateOddEvenList (List<Integer>list1,List<Integer>list2) {
		List<Integer>result=new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i)%2!=0 &&j%2!=0)
				{
					result.add(list1.get(i));
					break;
				}
				else if(list1.get(i)%2==0 &&j%2==0)
				{
					result.add(list2.get(i));
					break;
				}
			}
		}
		
		
		
		
		
		return result;
	}
}
