package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: ArrayPractice3D.java <p/>
 * <b>Project</b>: LearningProject2 <p/>
 * <b>Description: </b> Experiments with 3D arrays, nested loops 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 14, 2016<p/>
 * updates:
 ****************************************************************************/

public class ArrayPractice3D {

	// Default constructor stub
	public ArrayPractice3D() {
	}

	// main method
	public static void main(String[] args) {
		
	   int[][] arrayArray = { 
			   { 1, 2, 6, 4, 2, 0, 22, 16 }, 
			   { 5, 8, 7, 3, 21, 12, 9, 11 }	
	   };
	   
	   // counts outer array length
	   int z = 0;
		   
	   // output size of outer array
	   System.out.println("Outer Array's Length: " + arrayArray.length + "\n");
		   
	   // loop through outer array
	   for (int i = 0; i < arrayArray.length; i++) {
		   
		   // print which outer array number we're in and a header line
		   System.out.println("Inner Array [" + z + "]'s Length: " + arrayArray[i].length);
		   System.out.print("Inner Array [" + z + "]'s Values: "); 		   
		   
		   // loop through inner array & print values
		   for (int j = 0; j < arrayArray[i].length; j++) {
			   System.out.print(arrayArray[i][j] + " "); 
		   }
		   // formatting to separate Inner Arrays in printout
		   System.out.println("\n");
		   
		   // increment count for outer array
		   z++;
	   }
	}
}