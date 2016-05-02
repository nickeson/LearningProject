package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Shuffle1.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 19, 2016<p/>
 * updates:
 ****************************************************************************/

public class Shuffle1 {

	public Shuffle1() {
		// constructor
	}

	public static void main(String[] args) {
		
		int x = 3;
		
		while (x > 0) {
			
			if (x > 2) {
				System.out.print("a");
			}
			
			x = x -1;
			System.out.print("-");
			
			if (x == 2) {
				System.out.print("b c");
			}
			
			if (x == 1) {
				System.out.print("d");
				x = x -1;
				
				double i = 32.55;
				System.out.println(i);
			}
		}
	}
}