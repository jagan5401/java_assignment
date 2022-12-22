package com.problem7;
//Fibonacci Sum
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int n = scanner.nextInt();
		
		  
		System.out.println(UserMainCode.getSumOfNfibos(n));
	}
	
}
