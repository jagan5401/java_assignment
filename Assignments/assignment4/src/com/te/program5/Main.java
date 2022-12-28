package com.te.program5;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	Integer size=scanner.nextInt();
	String [] Array=new String[size];
	for (int i = 0; i <size; i++) {
		System.out.println("Enter the String"+(i+1) +":");
		 Array[i]= scanner.next();
	}
	
	
		Integer Output=UserMainCode.methodgetElementPosition(Array);
	System.out.println(Output);

}

}
