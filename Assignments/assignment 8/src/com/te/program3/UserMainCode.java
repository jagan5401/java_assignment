package com.te.program3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UserMainCode {
public static Integer getYear(Map<Integer, Integer> map) {
		Integer max=0;
		Integer key=0;
		for(Entry<Integer,Integer>entry:map.entrySet()) {
			
			Integer value = entry.getValue();
			if(value==Collections.max(map.values())) {
				 key = entry.getKey();
			}
		}
		
		
		return key;
	}

}
