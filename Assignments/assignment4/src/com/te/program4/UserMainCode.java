package com.te.program4;

public class UserMainCode {

	public static String removeEvenVowels(String word) {
		String s1="aeiouAEIOU";
		String s2="";
		for (int i = 0; i < word.length(); i++) {
			int k=1;
			if(k%2==0) {
				s2=s2+(word.charAt(i));
			}
			else
			{
				for (int j = 0; j < s1.length(); j++) {
					if(word.charAt(i)!=(s1.charAt(j))){
						
					}
				}
				s2=s2+(word.charAt(i));
			}
			k++;
		}
		
		
		
		return s2;
	}
}
