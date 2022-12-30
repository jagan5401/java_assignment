package com.te.program5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UserMainCode {
	public static Map<String, Integer> calculateDiscount(Map<String, String> map, Map<String, Integer> map2) {

		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		for (Entry<String, String> entry : map.entrySet()) {
			String value1 = entry.getValue();
			LocalDate date = LocalDate.parse(value1, DateTimeFormatter.ofPattern("dd/M/yyyy"));
			Integer date1 = date.getYear();
			Integer dor = 2015 - date1;
			String key = entry.getKey();
			Integer amount = map2.get(key);
			int discount = 0;
			// System.out.println(amount+" "+date1+" "+key);
			if (amount >= 20000 && dor >= 5) {
				discount = (20 * amount)/100;
				treeMap.put(key, discount);
				//System.out.println(discount+" "+key);
			}else if (amount >= 20000 && dor < 5) {
				discount = (10 * amount)/100;
				treeMap.put(key, discount);
				//System.out.println(discount+" "+key);
			} else if (amount < 20000 && dor >= 5) {
				discount = (15 * amount)/100;
				treeMap.put(key, discount);
				//System.out.println(discount+" "+key);
			} else if (amount < 20000 && dor < 5) {
				discount = (5 * amount)/100;
				treeMap.put(key, discount);
//				System.out.println(discount+" "+key);
			}
		}

		return treeMap;

	}

}
