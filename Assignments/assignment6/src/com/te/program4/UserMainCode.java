package com.te.program4;

import java.nio.Buffer;

public class UserMainCode {
	public static String formString(String[]input1, Integer number) {
		StringBuffer input2=new StringBuffer();
		
		for (int i = 0; i< input1.length; i++) {
			String sub=input1[i];
			for (int j = 0; j < input1.length; j++) {
				if(sub.length()>=number)
				{
					input2.append(sub.charAt(number-1));
					break;
				}
				else
				{
					input2.append("$");
					break;
				}
			}
		}
		
		
		return input2.toString();
	}

}
