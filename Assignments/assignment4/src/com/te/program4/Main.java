package com.te.program4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);

	System.out.println("Enter the String :");
	String string=scanner.nextLine();
	
	String Output=UserMainCode.removeEvenVowels(string);
	System.out.println(Output);

}
}
