package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Triangle.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 21, 2016<p/>
 * updates:
 ****************************************************************************/

public class Triangle {
	
	// declare member vars
	double area;
	int height;
	int length;

	// default constructor
	public Triangle() {
	}

	public static void main(String[] args) {
		
		int x = 0;
		
		// create a new instance of an array of Triangles named 'ta' and assign array size 4
		Triangle[] ta = new Triangle[4];
		
		// loop through triangle array & print area for each triangle
		while (x < 4) {
			
			// fill each element of triangle array with a new triangle
			ta[x] = new Triangle();
			
			// set fields for each triangle in the array with height, length and area values
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			
			// print out results
			System.out.print("triangle " + x + ", area");
			System.out.println(" = " + ta[x].area);
			
			// increment counter
			x = x + 1;
		}
	
		// instance var
		int y = x; // evaluates to int y = 4;
		
		x = 27; // red herring - doesn't do anything in this code even though it compiles
		
		// reference var t5 is assigned to triangle object in slot 3 of Triangle array 'ta'
		Triangle t5 = ta[2];
		
		// override area entry for Triangle array element 2 (was at value 18)
		ta[2].area = 343;
		
		System.out.print("y = " + y);
		System.out.println(", t5 area = " + t5.area);
	}

	void setArea() {
		area = (height * length) / 2;
	}
}