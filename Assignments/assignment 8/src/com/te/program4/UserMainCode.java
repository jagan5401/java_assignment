package com.te.program4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UserMainCode {
public static Set<String> obtainDesignation (TreeMap<String, String> map, String job) {
	Set<String>set=new HashSet<>();
		for(Entry<String,String>entry:map.entrySet()) {
			String value = entry.getValue();
			String key = entry.getKey();
			if(value.equalsIgnoreCase(job)) {
				set.add(key);
				
			}
			
		}
		//System.out.println(set);
		
		return set;
	}



}
//3
//a
//clerk
//b
//manager
//c
//manager