package com.team4.base.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;


/**
 * 
 * @author {guozichen}
 * 2014年11月4日
 */
public class DateUtil {

	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String SIMPLE_DATE_PATTERN = "yyyy-MM-dd";

	protected Logger log = Logger.getLogger(getClass());

	public static final String getDate(Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
			returnValue = df.format(aDate);
		}

		return returnValue;
	}

	public static final Date convertStringToDate(String strDate)
			throws ParseException {
		return convertStringToDate(SIMPLE_DATE_PATTERN, strDate);
	}

	public static final Date convertStringToDate(String aMask, String strDate)
			throws ParseException {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat(aMask);

		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return date;
	}

}
