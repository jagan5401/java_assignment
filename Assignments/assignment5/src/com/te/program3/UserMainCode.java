package com.te.program3;

import java.util.Arrays;

public class UserMainCode {

	public static boolean checkTripplets(Integer[] array) {
		
		boolean b=false;
for (int i = 0; i < array.length; i++) {
	int count=1;
	
	if(array[i]!=0) {
		for (int j = i+1; j < array.length; j++) {
			
			if(array[i]==array[j])
			{
				count++;
				array[j]=0;
				
			}
			
		}
		if(count>=3) {
			//System.out.println(array[i]+"="+count);
			b=true;
			break;
			
		}
	}
}
		
			
			
				
	
		

		return b;

	}

}
