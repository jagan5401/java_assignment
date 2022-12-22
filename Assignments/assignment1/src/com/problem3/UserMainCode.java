package com.problem3;
//Reversed Number
public class UserMainCode {
	public static int check(int n) {
		int rev = 0;
		while (n > 0) {
			int t = n % 10;
			
				rev = rev *10+t;

			n = n / 10;
		}
		

		return rev;

	}
}
