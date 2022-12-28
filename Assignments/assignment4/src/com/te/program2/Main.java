package com.te.program2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Even Length of String :");
	String string=scanner.nextLine();
	Integer Output=UserMainCode.checkCharacters(string);
	System.out.println((Output==1)?"valid":"invalid");
	if(Output==1)
	{
		System.out.println("VALID");
	}
	else
	{
		System.out.println("INVALID");
	}
}
}
