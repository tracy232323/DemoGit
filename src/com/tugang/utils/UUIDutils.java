package com.tugang.utils;

import java.util.UUID;

public class UUIDutils {
	public static String getUUID(){
		String string = UUID.randomUUID().toString();
		String uuid = string.replace("-", "");
		return uuid;
	} 
}
