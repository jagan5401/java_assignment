package com.te.program3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);

	System.out.println("Enter the String :");
	String string=scanner.nextLine();
	System.out.println("Enter the positive Integer :");
	Integer number=scanner.nextInt();
	String Output=UserMainCode.formNewWord(string,number);
	System.out.println(Output);

}
}
