package com.te.program1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Date of Birth (dd/MM/yyyy)");
	String dob = scanner.next();
	String age = UserMainCode. getAge (dob);
//LocalDate new1 = LocalDate.parse("11/1/2111", DateTimeFormatter.ofPattern("dd/M/yyyy"));
//new1.getYear()
	System.out.println(age);
}
}
