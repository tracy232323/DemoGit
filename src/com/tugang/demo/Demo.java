package com.tugang.demo;

import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		try {
			Date d1 = new Date();
			Thread.sleep(1000);
			Date d2 = new Date();
			
			if (d1.compareTo(d2) == 0) {
				System.out.println("=");
			} else if (d1.compareTo(d2) > 0) {
				System.out.println(">");
			} else {
				System.out.println("<");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
