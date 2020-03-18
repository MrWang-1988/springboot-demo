package com.bj.springboot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String DATE_FORMAT_PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_PATTERN_YEARMONTHDAY = "yyyy-MM-dd";
    public static final String DATE_FORMAT_PATTERN_HOURMINSEC = "HH:mm:ss";
    public static final String DATE_FORMAT_PATTERN_SHORTDATE_TIME = "yyyy/MM/dd HH:mm:ss";
    public static final String DATE_FORMAT_PATTERN_SHORTDATE = "yyyy/MM/dd";
	
	public static Date getCurrentDate(){
		return new Date();
	}
	
	public static String getCurrentDateStr(){
		return dateToStr(getCurrentDate(),DATE_FORMAT_PATTERN_DEFAULT);
	}
	
	public static String dateToStr(Date date,String dateFormat){
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String format = sdf.format(date);
		return format;
	}
}
