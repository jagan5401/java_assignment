package com.te.program8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserMainCode {

	public static void sumElements(Integer[] array) {
		int b = -1;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = 0;
				}
			}
			if (array[i] % 2 == 0) {
				b = 1;
				sum += array[i];
			}

		}
		if (b != 1) {
			System.out.println(b);
		}
		else
		{
			System.out.println(sum);
		}
	}
}
