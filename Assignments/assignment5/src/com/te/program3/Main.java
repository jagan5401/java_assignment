package com.te.program3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	Integer size=scanner.nextInt();
	Integer[]array=new Integer[size];
	System.out.println("Enter the Integer array :");
	for (int i = 0; i < size; i++) {
		array[i]=scanner.nextInt();
	}
	
	//System.out.println("Enter the number :");
	//Integer number1=scanner.nextInt();
	
	
	
	boolean Output=UserMainCode.checkTripplets(array);
	System.out.println(Output);
}
}
