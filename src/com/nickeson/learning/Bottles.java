package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Bottles.java <p/>
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

public class Bottles {
		
	public static void main (String[] args) {
			
		// declare member variables
		int beerNum = 99;
		String word = "bottles";
	
		while (beerNum > 0) {
			
			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.print(beerNum + " " + word + " of beer...");
			System.out.print("take one down, ");
			System.out.print("pass it around, ");
			
			// decrement the number of beers
			beerNum = beerNum - 1;
		
			if (beerNum > 0) {
			
				if (beerNum==1) {
					word = "bottle";
				}
				
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("no more bottles of beer on the wall.");
			}
		}
	}
}