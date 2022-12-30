package com.te.program3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class UserMainCode {


	public static Integer getLastDayOfMonth (String dob) {
		LocalDate date = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/M/yyyy"));
		Integer date1=date.getYear();
		Integer date2=date.lengthOfMonth();
		
		
		return date2;
	
	}

}
