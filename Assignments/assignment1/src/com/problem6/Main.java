package com.problem6;
//Pallindrome in Range
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the UpperLimit");
		int number1 = scanner.nextInt();
		System.out.println("Enter the LowerLimit");
		int number2 = scanner.nextInt();
		  
		System.out.println(UserMainCode.addPallindromes(number1,number2));
	}
	
}
