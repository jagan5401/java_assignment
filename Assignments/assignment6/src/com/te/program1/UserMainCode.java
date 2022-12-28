package com.te.program1;

import java.nio.Buffer;


public class UserMainCode {
	public static void reshape(String answer, String divisor) {
		StringBuffer buffer=new StringBuffer(answer);
		StringBuffer buffer1=new StringBuffer(buffer.reverse());
		StringBuffer out=new StringBuffer();
	
		System.out.println(buffer1);
		for (int i = 0; i < buffer1.length(); i++) {
			out.append(buffer1.charAt(i)+divisor);
		}
		out.deleteCharAt(out.length()-1);
		System.out.println(out);
	}

}
