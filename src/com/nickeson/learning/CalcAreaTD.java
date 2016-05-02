package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: CalcAreaTD.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 21, 2016<p/>
 * updates:
 ****************************************************************************/

public class CalcAreaTD {

	// default constructor
	public CalcAreaTD() {
	}

	public static void main(String[] args) {
		
		CalcArea a = new CalcArea();
		
		short c = 7;
		
		a.calcArea(c,15);
		
		a.calcArea(2,3);
		
//		long t = 42;
//		byte h = a.calcArea(4,20); // fails compilation due to byte/int incompatibility
		
		System.out.println(a.calcArea(c,15));
		
	}

}
