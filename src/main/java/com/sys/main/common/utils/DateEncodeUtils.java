package com.sys.main.common.utils;

import java.util.*;

public class DateEncodeUtils {
	public static String returnDateString(String dateType) {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		if ("YYYY".equals(dateType)) {
			Integer year = c.get(Calendar.YEAR);
			return year.toString();
		}
		if ("YYYYMM".equals(dateType)) {
			Integer year = c.get(Calendar.YEAR);
			Integer month = c.get(Calendar.MONTH) + 1;
			String monthh = month.toString();
			if (month < 10) {
				monthh = "0" + month.toString();
			}
			return year + monthh;
		}
		Integer year = c.get(Calendar.YEAR); // 获取年
		Integer month = c.get(Calendar.MONTH) + 1; // 获取月份，0表示1月份
		String monthh = month.toString();
		if (month < 10) {
			monthh = "0" + month.toString();
		}
		Integer day = c.get(Calendar.DAY_OF_MONTH); // 获取当前天数
		String date = null;
		if (day != null) {
			date = day.toString();
		}

		if (day < 10) {
			date = "0" + date;
		}
		return year.toString() + monthh + date;
	}

	/*
	 * 
	 * 0 指前面补充零
	 * 
	 * formatLength 字符总长度为 formatLength
	 * 
	 * d 代表为正数。
	 * 
	 */
	public static String autoInsertZero(int sourceDate, int formatLength) {
		String newString = String.format("%0" + formatLength + "d", sourceDate);
		return newString;
	}

	/* @author zhangbo */
	public static List<String> returnThirtyMinute() {
		String[] listH = new String[24];
		String[] listM = new String[24];
		List<String> list = new ArrayList<String>();
		String hh = null;
		String hm = null;
		for (int i = 0; i < 24; i++) {
			if (i < 10) {

				String str1 = "0" + i + ":00 ~ " + "0" + i + ":30";
				String str2 = "0" + i + ":30" + " ~ 0" + (i + 1) + ":00";
				list.add(str1);
				list.add(str2);
			} else {
				String str1 = i + ":00 ~ " + i + ":30";
				String str2 = i + ":30" + " ~ " + (i + 1) + ":00";
				list.add(str1);
				list.add(str2);
			}
		}
		/*
		 * for(int i=0;i<24;i++){ String getH=listH[i]+" ~ "+listM[i]; String
		 * getM=null; if(i<23){ getM=listM[i]+" ~ "+listH[i+1]; }
		 * 
		 * 
		 * 
		 * }
		 */
		return list;
	}

	public static String getTime(Date date) {
		StringBuffer time = new StringBuffer();
		Date date2 = new Date();
		long temp = date2.getTime() - date.getTime();
		long days = temp / 1000 / 3600 / 24; // 相差小时数
		if (days > 0) {
			time.append(days + "天");
		}
		long temp1 = temp % (1000 * 3600 * 24);
		long hours = temp1 / 1000 / 3600; // 相差小时数
		if (days > 0 || hours > 0) {
			time.append(hours + "小时");
		}
		long temp2 = temp1 % (1000 * 3600);
		long mins = temp2 / 1000 / 60; // 相差分钟数
		time.append(mins + "分钟");
		return time.toString();
	}
}
