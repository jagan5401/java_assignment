package com.te.program6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserMainCode {

	public static boolean searchSequence(Integer[] array) {
		boolean b=false;
		int[] array1 = { 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			if ((array[i] == array1[0]) && (array[i + 1] == array1[1]) && (array[i+2] == array1[2])) {
				b=true;
				break;
			}

		}

		return b;

	}

}
