package com.te.program2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UserMainCode {

	public static String getCapital(Map<String, String> map, String capital) {
		String answer="";
		for(Entry<String,String>entry:map.entrySet()) {
			if(entry.getValue().equals(capital)) {
				
				String value=entry.getValue();
				String key=entry.getKey();
			
				 answer=key+"$"+capital;
			}
		}

		

		
		//map.get(Collections.max(map.keySet())).toString()	

		return answer;

	}

}
