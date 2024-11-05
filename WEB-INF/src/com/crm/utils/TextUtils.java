package com.crm.utils;

public class TextUtils {
	private static final String TAG = "TextUtils";

	private static String[] EMPTY_STRING_ARRAY = new String[] {};

	private TextUtils() { /* cannot be instantiated */
	}

	public static boolean isNullOrEmpty(String str) {
		return str == null || str.length() == 0 || str.equals("null");
	}

	public static String nullIfEmpty(String str) {
		return isNullOrEmpty(str) ? null : str;
	}

	public static String emptyIfNull(String str) {
		return str == null ? "" : str;
	}

	public static int length(String s) {
		return s != null ? s.length() : 0;
	}

	public static String[] split(String text, String expression) {
		if (text.length() == 0) {
			return EMPTY_STRING_ARRAY;
		} else {
			return text.split(expression, -1);
		}
	}

}
