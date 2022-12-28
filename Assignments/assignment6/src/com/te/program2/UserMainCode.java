package com.te.program2;

import java.nio.Buffer;

public class UserMainCode {
	public static void getsubstring(String string, String substring) {
		String s1=string.replace(substring, "");
		//int s2=string.compareToIgnoreCase(substring);
		System.out.println((string.length()-s1.length())/substring.length());
		
		
	}

}
