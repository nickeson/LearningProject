package com.nickeson.learning;
import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: StringArrayPractice.java <p/>
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

public class StringArrayPractice {

	// default constructor
	public StringArrayPractice() {
	}

	// main method
	public static void main(String[] args) {
		
		// create a String Array instance named 's' and populate first 5 elements
		String[] s = new String[] {"one", "two", "three", "five", "four"};
		
		// convert String Array into a List of Strings called 'numList'
		List<String> numList = Arrays.asList(s);
		
		// create iterator object to loop through numList
		Iterator<String> itr = numList.iterator();
				
		System.out.println("numList as entered (default order):\n");
				
		// loop through numList and print values
		while (itr.hasNext()) {
			String currNum = itr.next();
			System.out.println(currNum.toString() + " ");
		}
	}
}