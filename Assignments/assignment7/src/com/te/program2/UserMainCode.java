package com.te.program2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	public static void matchCharacter(String[] s1) {
		List<String> list = new ArrayList<String>();
		//String vowels = "aeiou";
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];

			for (int j = 0; j < s2.length(); j++) {

				if(s2.startsWith("a")||s2.startsWith("e")||s2.startsWith("i")||s2.startsWith("o")||s2.startsWith("u")) {
					if(s2.endsWith("a")||s2.endsWith("e")||s2.endsWith("i")||s2.endsWith("o")||s2.endsWith("u")) {
						if(list.contains(s2)) {
							break;
						}
						else {
							list.add(s2);
							
						}
					}
				}
			}

		}
		System.out.println(list);

	}

}
