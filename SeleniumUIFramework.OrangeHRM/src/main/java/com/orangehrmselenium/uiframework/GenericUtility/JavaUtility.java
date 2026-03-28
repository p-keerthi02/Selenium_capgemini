package com.orangehrmselenium.uiframework.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	// Generate Random Number
	public int getRandomNumber(int range) {
		Random random = new Random();
		int randomNumberInRange = random.nextInt(range);
		return randomNumberInRange;
	}

	// Generate Current Date
	public String getCurrentDate(String dateformat) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		return sdf.format(date);
	}

	// Counting Days
	public String getRequiredDate(int days) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		sdf.format(date);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate = sdf.format(cal.getTime());
		return requiredDate;
	}

	// Generate Random Value(Alphanumeric)
	public String getRandomValue() {
		UUID randomData = UUID.randomUUID();
		String value = randomData.toString().replaceAll("[^a-zA-Z]", "");
		return value;
		}

}
