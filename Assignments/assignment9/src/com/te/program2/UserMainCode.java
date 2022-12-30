package com.te.program2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class UserMainCode {


	public static String isLeapYear(String dob) {
		LocalDate date = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/M/yyyy"));
		Integer year=date.getYear();
		
		String c="";
		if(year%4==0)  {
			 c="leap year";
		}
		else {
			c="not leap year"; 
		}
		return c;
	
	}

}
