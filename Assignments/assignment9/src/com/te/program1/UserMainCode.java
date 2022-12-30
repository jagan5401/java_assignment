package com.te.program1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class UserMainCode {


	public static String getAge(String dob) {
		LocalDate date = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/M/yyyy"));
		Integer date1=date.getYear();
		LocalDate a=date.now();
		Integer date2=a.getYear();
		Integer age=date2-date1;
		String c="";
		if(age>=18) {
			 c="Eligible";
		}
		else {
			c="Not Eligible"; 
		}
		return c;
	
	}

}
