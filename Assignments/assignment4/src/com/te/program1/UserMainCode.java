package com.te.program1;

public class UserMainCode {

	public static String getMiddleChars (String string) {
		StringBuffer buffer=new StringBuffer();
		
		if(string.length()%2==0)
		{
			buffer.append(string.charAt(string.length()/2-1));
			buffer.append(string.charAt(string.length()/2));
		}
		else
		{
			buffer.append(string.charAt(string.length()/2));
		}
	

	return buffer.toString();
	}
}


