package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: SubClass.java <p/>
 * <b>Project</b>: SubClass testing <p/>
 * <b>Description: </b> Testing class extension methods
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class SubClass extends SuperClass {

	/**
	 * default constructor for Bird subclass
	 * also calls default constructor for Animal superclass w/no args
	 * (this is always done implicitly, here we do it explicitly for code clarity)
	 */
	public SubClass() {
		
		super();
		
	}
	
	/**
	 * main method to create objects of SuperClass and SubClass and use their methods
	 * @param args
	 */
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

	/**
	 * method to print message from SubClass
	 */
	public void printHelloSub() {
		
		// example of calling method from superclass within a subclass method
		// super.printHelloSuper();
		
		System.out.println("Hello from SubClass");
		return;
	}
}