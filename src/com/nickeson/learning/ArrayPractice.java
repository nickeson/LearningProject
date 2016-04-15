package com.nickeson.learning;

//JDK 1.8.0

// package containing class/method for random number generation
import java.util.Random;

/****************************************************************************
 * <b>Title</b>: ArrayPractice.java <p/>
 * <b>Project</b>: LearningProject2 <p/>
 * <b>Description: </b> Experiments with 3D arrays, nested loops, random nums
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 14, 2016<p/>
 * updates: testing git
 ****************************************************************************/

public class ArrayPractice {
	
	// member variable, initialized to 10 for default constructor usage
	private int ranNumberArraySize = 10;
	
	/**
	 * default constructor
	 */
	public ArrayPractice() {
	}
	
	/**
	 * convenience constructor allowing size of random number array to be passed
	 * @param ranNumberArraySize
	 */
	public ArrayPractice(int ranNumberArraySize) {
		this.ranNumberArraySize = ranNumberArraySize;
	}
	
	/**
	 * Main method creates ArrayPractice instance
	 * runs array3D and arrayRandomNumber methods on instance
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a new instance of ArrayPractice Class called testArray
		ArrayPractice testArray = new ArrayPractice(20);
		
		// formatting stuff - prettify
		System.out.println("=====================================");
		System.out.println("First we will practice on a 3D array:");
		System.out.println("=====================================\n");
		
		// call array3D method from testArray object
		testArray.array3D();
		
		System.out.println("          ***************************          \n");	
		
		// create a new instance of ArrayPractice Class called testArray2
		// ArrayPractice testArray2 = new ArrayPractice(30);
		
		// prettify
		System.out.println("===============================================");	
		System.out.println("Next we will practice on a random number array:");
		System.out.println("===============================================\n");
		
		// call arrayRandomNumber method from testArray2 object
		testArray.arrayRandomNumber();
	}
	
	/**
	 * Method to initialize a 3D array and populate it with predefined numbers,
	 * then output the lengths and values of the 3D array 
	 */
	public void array3D() {
		
	   // initialize and populate 3D array called arraysArray
	   int[][] arraysArray = { 
			   { 1, 2, 6, 4, 2, 0, 22, 16 }, 
			   { 5, 8, 7, 3, 21, 12, 9, 11 }	
	   };
	   
	   // counts outer array length
	   int z = 0;
		   
	   // print outer array's length with formatting
	   System.out.println("----------------------");
	   System.out.println("arraysArray Length: " + arraysArray.length);
	   System.out.println("----------------------\n");
		   
	   // loop through outer array
	   for (int i = 0; i < arraysArray.length; i++) {
		   
		   // print which outer array number we're in with a header line
		   System.out.println("arraysArray[" + z + "] Length: " + arraysArray[i].length);
		   System.out.print("arraysArray[" + z + "] Values: "); 		   
		   
		   // loop through inner array & print inner array values
		   for (int j = 0; j < arraysArray[i].length; j++) {
			   System.out.print(arraysArray[i][j] + " "); 
		   }
		   // format and increment
		   System.out.println("\n");
		   z++;
	   }
	}
	
	/**
	 * Method creates an array of size ranNumArraySize, populates w/random numbers
	 * then outputs the array contents by position
	 */
	public void arrayRandomNumber() {
		
		// declare and initialize array2 to ranNumArraySize
		int [] arrayRandomNum;
		arrayRandomNum = new int[this.ranNumberArraySize];
		
		// loop through array, set values to random numbers & output values
		for (int i = 0; i < arrayRandomNum.length; i++) {
			
			// generate random number and assign to randVal for this loop iteration
			int randVal = (Math.abs(new Random().nextInt()) + 1);
			
			// assign array position [i] to the value of the random number
			arrayRandomNum[i]=randVal;
			
			// show us which loop iteration we're on
			System.out.print("arrayRandomNumber[" + i + "]: " + randVal + "\n");
		}
	}

	/**
	 * get the size of the random number array that is displayed
	 * @return the ranNumberArraySize
	 */
	public int getRanNumberArraySize() {
		return ranNumberArraySize;
	}

	/**
	 * set the size of the random number array that is displayed
	 * @param ranNumberArraySize the ranNumberArraySize to set
	 */
	public void setRanNumberArraySize(int ranNumberArraySize) {
		this.ranNumberArraySize = ranNumberArraySize;
	}
}