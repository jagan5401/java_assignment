package com.te.program4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//	Scanner scanner=new Scanner(System.in);
//	System.out.println("Enter the size of String :");
//	String string=scanner.next();
//	System.out.println("Enter the substring :");
//	String substring=scanner.next();

	String []array1= {"xyz","abcd","mn","efg"};
	Integer number=3;
	
	String output=UserMainCode.formString(array1,number);
	System.out.println(output);
	
}
}
