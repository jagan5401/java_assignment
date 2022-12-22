package com.problem2;
//Sum Of Square Of Even Digits
public class UserMainCode {
	public static Integer check(int n) {
		int sum = 0;
		while (n > 0) {
			int t = n % 10;
			if (t % 2 == 0) {

				sum = sum + (t * t);
			}

			n = n / 10;
		}
		

		return sum;

	}
}
