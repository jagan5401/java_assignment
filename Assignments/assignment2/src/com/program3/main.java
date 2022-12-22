package com.program3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Positive Integer :");
		Integer number=scanner.nextInt();
		System.out.println(UserMainCode.SumOfSquareOfDigits(number));
	
	}
}
