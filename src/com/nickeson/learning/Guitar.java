package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Guitar.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 2, 2016<p/>
 * updates:
 ****************************************************************************/

public class Guitar {
	String brand;

	// default constructor
	public Guitar() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare a new array of Guitar Objects named 'myGuitarArray' and set to size 5
		Guitar[] myGuitarArray = new Guitar[5];
		
		// call the default constructor on the Guitar object in array index location 3
		// to create a Guitar object in that location
		myGuitarArray[3] = new Guitar();
		
		// Set the 'brand' field in the Guitar object in array index location 3 to 'Gibson'
		myGuitarArray[3].brand = "Gibson";
		
		// Display the 'brand' field of the Guitar object in array index location 3
		System.out.println(myGuitarArray[3].brand);

	}

}