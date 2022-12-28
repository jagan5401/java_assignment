package com.te.program1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of String :");
	String answer=scanner.next();
	System.out.println("Enter the size of Divisor :");
	String divisor=scanner.next();

//	String answer="Rabbit";
	//String divisor="-";
	
	UserMainCode.reshape(answer,divisor);
	
}
}
