package com.te.program3;

import java.nio.Buffer;

public class UserMainCode {
	public static String getsubstring(String string, Integer number) {
		StringBuffer input1=new StringBuffer(string);
		StringBuffer input2=new StringBuffer();
		if(string.length()>2)
		{ 
			while(number>0)
			{
				input2.append(string.charAt(0));
				input2.append(string.charAt(1));
				input2.append(string.charAt(2));
				number--;
			}
			return input2.toString();
		}
		else
		{
			while(number>0)
			{
			input2.append(string);
			number--;
			}
			return input2.toString();
		}
		
	}

}
