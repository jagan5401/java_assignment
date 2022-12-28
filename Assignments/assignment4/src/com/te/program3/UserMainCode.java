package com.te.program3;

public class UserMainCode {

	public static String formNewWord(String string, Integer number) {
		Integer total = string.length() ;
		Integer border1 = number - 1;
		Integer border2 = total - number;
		String copy = "";
		
		for (int i = 0; i <= border1; i++) {
			copy += string.charAt(i);
			
		}
		;
		for (int i = border2; i < total; i++) {
			copy += string.charAt(i);
			
		}
		
		

		return copy;
	}
}
