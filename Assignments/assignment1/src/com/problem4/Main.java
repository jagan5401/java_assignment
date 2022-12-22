package com.problem4;
//Unique Number
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Positive Integer");
		int n = scanner.nextInt();
		  
		System.out.println(UserMainCode.getUnique(n));
	}
	
}
