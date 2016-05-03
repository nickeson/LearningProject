package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Person.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 3, 2016<p/>
 * updates:
 ****************************************************************************/

public class Person {
	int id = 0;
	String firstName = null;
	String lastName = null;
	
	// default constructor
	public Person(){
	}
	
	// convenience constructor allows us to pass in values
	public Person(int i, String first, String last) {
		id = i;
		firstName = first;
		lastName = last;
	}
	
	public void addPerson(int i, String first, String last) {
		id = i;
		firstName = first;
		lastName = last;
	}
	
	public String toString(){
	    return id + ": " + firstName + " " + lastName;
	}
}