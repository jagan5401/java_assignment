package com.te.program1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode {

	public static String getMaxKeyValue(String string) {
		String s1 = string.substring(1, string.length() - 1);

		String[] split = s1.split(",");
		// for (int i = 0; i < split.length; i++) {
		// System.out.println(split[i]);
		// }

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < split.length; i++) {
			String[] split2 = split[i].split("=");
			//String string1 = split2[0];
			String string2 = split2[1];
			map.put(Integer.parseInt(split2[0].trim()), string2);

		}
		

		return map.get(Collections.max(map.keySet())).toString();

	}

}
