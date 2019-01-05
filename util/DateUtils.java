package com.online_examination_system.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String dateToStr(Date date) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = formatDate.format(date).toString();
		return strdate;
	}
	public static Date strToDate(String str){
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return formatDate.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
