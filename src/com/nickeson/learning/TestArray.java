package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: TestArrays.java <p/>
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

public class TestArray {

	
	public TestArray() {
		// default constructor
	}

	// main method
	public static void main(String[] args) {
		
		// declare and initialize variables and arrays
		int ref;
		int y = 0; // counter variable
		
		// create a new int array named 'index' of size 4
		int[] index = new int[4];
		
		// create a new String array named islands of size 4
		String[] islands = new String[4];
	
		// populate 'index' array
		index[0] = 1;
		index[1] = 3;	
		index[2] = 0;	
		index[3] = 2;		
		
		// populate 'islands' array
		islands[0] = "Bermuda";
		islands[1] = "Fiji";	
		islands[2] = "Azores";		
		islands[3] = "Cozumel";
		
		// loop through array & print values of name & island
		while (y < 4) {
			ref = index[y]; 
			System.out.print("island = ");
			System.out.println(islands[ref]);
			
			// increment counter var
			y = y+1;
			
		} // close while
	} // close main
} // close class TestArrays