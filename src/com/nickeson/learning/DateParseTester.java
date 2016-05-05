package com.nickeson.learning;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: TestParse.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 5, 2016<p/>
 * updates:
 ****************************************************************************/

public class DateParseTester {

	public DateParseTester() {
	}

	public static void main(String[] args) {
		
		Calendar myCal = Calendar.getInstance();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(f.format(myCal.getTime()));
		
		myCal.roll(GregorianCalendar.MONTH, false);
		// System.out.println(myCal); // print out entire calendar
		// System.out.println(myCal.get(Calendar.MONTH));
		
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(f2.format(myCal.getTime()));
	}
}
