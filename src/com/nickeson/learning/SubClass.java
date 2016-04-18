package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: SubClass.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class SubClass extends SuperClass {

	// default constructor
	public SubClass() {
	}
	
	public static void main(String[] args) {
		
		// create new object of class SubClass called 'testObj'
		SubClass testObj = new SubClass();
		
		// call 'printHelloSub' method from SubClass
		testObj.printHelloSub();
		
		// create new object of SuperClass called 'testObj2'
		SuperClass testObj2 = new SuperClass();
		
		// call 'printHelloSuper' method from SuperClass
		testObj2.printHelloSuper();
	}	

	public void printHelloSub() {
		
		// can call method from superclass within a subclass method
		// super.printHelloSuper();
		
		// print method from SubClass
		System.out.println("Hello from SubClass");
		return;
	}
}
