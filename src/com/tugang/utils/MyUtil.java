package com.tugang.utils;

import java.util.regex.Pattern;

public class MyUtil {
	/**
	 * isInteger
	 * @param str
	 * @return
	 */
	public boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}
	  
	/**
	 * isRange
	 * @param str
	 * @return
	 */
	public boolean isRange(String str, int min, int max) {
		Integer i = Integer.valueOf(str);
		boolean flag = false;
		if (i >= min && i <= max) {
			flag = true;
		}

		return flag;
	}
}
