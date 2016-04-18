package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Bird.java <p/>
 * <b>Project</b>: Class Extensions - SubClass <p/>
 * <b>Description: </b> Practice with sub/super classes & extension
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class Bird extends Animal {

	/**
	 * default constructor for Bird subclass
	 */
	public Bird() { 
		
	// default constructor for superclass w/no args (always called implicitly)
	super(); 
	}

	/**
	 * main method creates instance of Animal Superclass and Bird Subclass
	 * then calls sleep method from both Sub/Super-classes as demo
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal testAnimal = new Animal();
		System.out.println("A new animal has been created!");
		
		// use original methods from Animal superclass
		testAnimal.sleep();
		testAnimal.eat();
	
		System.out.println(""); // formatting
		
		Bird testBird = new Bird();
		System.out.println("A new bird has been created!");
		
		// use overridden methods from subclass
		testBird.sleep();
		testBird.eat();
	}

	/**
	 * method from 'Bird' sub-class, overrides method with same name from 'Animal' superclass 
	 */
	@Override // annotation from example I found - I don't know how to use these yet
	public void sleep() {
		System.out.println("A bird sleeps...");
	}
	
	/**
	 * method from 'Bird' sub-class, overrides method with same name from 'Animal' superclass
	 */
	@Override // annotation from example I found - I don't know how to use these yet
	public void eat() {
		System.out.println("A bird eats...");
	}
}