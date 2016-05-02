package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Animal.java <p/>
 * <b>Project</b>: Class Extensions - SuperClass <p/>
 * <b>Description: </b> Practice with sub/super classes & extension
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class Animal {

	/**
	 * default constructor for Animal superclass
	 */
	public Animal() {
	}
	
	/**
	 * main method to create an instance of Animal (super)class, call eat method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal testAnimal = new Animal();
		System.out.println("A new animal has been created!");
		
		testAnimal.eat();
		testAnimal.sleep();
	}
	
	/**
	 * method for 'Animal' superclass 
	 */
	public void sleep() {
		System.out.println("An animal sleeps...");
	}
	
	/**
	 * method for 'Animal' superclass
	 */
	public void eat() {
		System.out.println("An animal eats...");
	}
}