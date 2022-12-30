package com.te.program5;

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

public static Map<String, String> getStateId(String[] state) {
	Map<String,String>map=new HashMap<>();
	for (int i = 0; i < state.length; i++) {
		String s1=state[i];
		
		map.put(s1.toUpperCase().substring(0, 3), state[i]);
	}
	return map;
}



}
