package com.te.program4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UserMainCode {
	public static Float costEstimator(String[] array, Map<String, Float> map) {
		Float sum = 0.0f;
		for (int i = 0; i < array.length; i++) {
			for (Entry<String, Float> entry : map.entrySet()) {
				String key = entry.getKey();
				if (key.equals(array[i])) {
					sum +=entry.getValue();
					 
				}
			}
		}
		return sum;

	}

}
//3
//Monitor
//1200.36
//Mouse
//100.42
//Speakers
//500.25
//2
//Speakers
//Mouse
