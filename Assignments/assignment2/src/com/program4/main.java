package com.program4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the A Integer :");
		Integer a=scanner.nextInt();
		System.out.println("Enter the B Integer :");
		Integer b=scanner.nextInt();
		System.out.println("Enter the C Integer :");
		Integer c=scanner.nextInt();
		System.out.println(UserMainCode.getLuckySum(a, b, c));
	
	}
}
