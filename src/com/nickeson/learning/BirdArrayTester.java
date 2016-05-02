package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Tester.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 20, 2016<p/>
 * updates:
 ****************************************************************************/

public class BirdArrayTester {
	

	public BirdArrayTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird[] myBirdsArray = new Bird[4];
		myBirdsArray[0] = new Bird();
		myBirdsArray[0].sleep();
		myBirdsArray[0].name = "Tweety";
		myBirdsArray[0].eat();
		
		System.out.println(myBirdsArray[0].name);
	}
}
