package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: SuperClass.java <p/>
 * <b>Project</b>: SuperClass testing <p/>
 * <b>Description: </b>  Testing class extension methods and principles
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class SuperClass {

	/**
	 * default constructor for SuperClass
	 */
	public SuperClass() {
		
	}
	
	/**
	 * main method for 'SuperClass'
	 * instantiates an object testSuperClass, calls printHelloSuper method
	 * @param args
	 */
		public static void main(String[] args) {
			
		SuperClass testSuperClass = new SuperClass();
		testSuperClass.printHelloSuper();
	}
	
	/**
	 * method to print a statement from SuperClass
	 */
	public void printHelloSuper() {
		System.out.println("Hello from SuperClass");
		return;
	}
}