package com.te.program5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	public static List arrayListSubtractor(List<String>list1,List<String>list2) {
		List<String>copy1=new ArrayList<>(list2);
		copy1.removeAll(list1);
		
		List<String>copy2=new ArrayList<>(list1);
		copy2.removeAll(list2);
		
		
		List<String>finalresult=new ArrayList<>(copy1);
		finalresult.addAll(copy2);
		
		
		
		
		return finalresult;
	}
}
