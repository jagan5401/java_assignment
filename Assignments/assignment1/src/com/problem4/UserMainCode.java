package com.problem4;

//Unique Number
public class UserMainCode {
	public static String getUnique(Integer n) {
		boolean unique=true;
		String str = Integer.toString(n);
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unique=false;
					break;
				}
					
			}
		}
		if(unique==true)
		{
			return "unique";
			
		}
		else
		{
			return"not unique";
		}
	}
}
