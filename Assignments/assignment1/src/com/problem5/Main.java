package com.problem5;
//occurance of 7  
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Positive String");
		String n = scanner.next();
		  
		System.out.println(UserMainCode.countSeven(n));
	}
	
}
