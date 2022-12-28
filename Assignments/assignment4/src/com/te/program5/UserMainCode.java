package com.te.program5;

import java.util.Scanner;

public class UserMainCode {

	public static Integer methodgetElementPosition(String [] array) {
		Scanner scanner=new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				String check = array[i];
				//System.out.println(check);
				String check2 = array[j];
				//System.out.println(check2);
				if(check.charAt(0)<check2.charAt(0))
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}	
		} 
//		for (String string : array) {
//			System.out.println(string);
//		}
		System.out.println("Enter the color :");
		String color=scanner.next();
		int index=0;
		for (int i = 0; i < array.length; i++) {
			if(color.equals(array[i]))
			{
				index=i+1;
			}
		}
		
		return index;
	}

}
