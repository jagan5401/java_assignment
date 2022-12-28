package com.te.program2;

public class UserMainCode {

	public static Integer checkCharacters(String string) {
		Integer b=0;
		char first =string.charAt(0);
		char last=string.charAt(string.length()-1);
				if(first==last)
				{
					b=1;
				}
				else
				{
					b=-1;
				}
	

	return b;
	}
}


