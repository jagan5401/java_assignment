package com.te.program4;

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
	//Integer[] array= {1,2,1,4,7,1,2};
	//Integer[] array={52,51,81,84,60,88};
	int Output=UserMainCode.calculateMedian (array);
	System.out.println("calculateMedian :"+Output);
}
}
