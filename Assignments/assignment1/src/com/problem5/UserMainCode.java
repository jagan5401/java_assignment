package com.problem5;
//occurance of 7 
public class UserMainCode {
	public static int countSeven(String n) {
		char[] ch=n.toCharArray();
		char s1='7';
		int count=0;
		for(int i=0;i<n.length();i++)
		{
			if(s1==ch[i])
			{
				count++;
			}
		}
		
		return count;
	}
}
