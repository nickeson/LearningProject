package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Mix4.java <p/>
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

public class Mix4 {
	
	// instance variable (defined in the class, encapsulated))
	private int counter = 0;
	String text = "Test String";

	// default constructor
	public Mix4() {
	}

	// main method
	public static void main(String[] args) {
		
		// count variable is local to main method
		int count = 0;
		
		// local var for loop counter
		int x = 0;
		
		// create a new array object of Mix4 type objects named m4a, size is 20
		Mix4[] m4a = new Mix4[20];
		
		while (x < 20) {
			
			/* - as we loop, create new Mix4 objects in the cells of the Mix4 array object
			 * - total number of array slots filled by the loop changes in this exercise - values can be 10, 21, 8 or 20
			 * - for each instance of an object created to fill the array cells, 
			 *   its instance vars are initialized with values defined at the class level
			 * - this causes instance vars 'counter' and 'text' to reset each time through the loop to their 'class level' values
			 */
			m4a[x]= new Mix4();
			
			// System.out.println("pre-m4a[" + x + "]: " + m4a[x].counter);
			// System.out.println("pre-m4a[" + x + "]: " + m4a[x].text);	
			
			// increment array 'counter' and 'text' vars
			m4a[x].counter = m4a[x].counter + 1;
			m4a[x].text = m4a[x].text + "2";	
			
			// print after increment
			// System.out.println("post-m4a[" + x + "]: " + m4a[x].counter);			
			// System.out.println("post-m4a[" + x + "]: " + m4a[x].text);				
			
			// print 'count' variable as it's currently defined locally
			System.out.println("pre-count: " + count);
			
			// increment 'count' local var by 1 - this is the only var that ends up incrementing (besides x loop increment var)
			count = count + 1;
			
			// print after incrementing local var 'count'
			System.out.println("post-count: " + count);
			
			/* increment the 'count' local var, only for ints 0 - 4
			* passes value of x as a parameter
			*/
			count = count + m4a[x].maybeNew(x);
			
			// increment loop counter 'x'
			x = x + 1;
		}
		
		// print vals of local var 'count' and 'counter' variable from cell 2 of Mix4 array object 'm4a'
		System.out.println(count + " " + m4a[1].counter);
	}
	
	// maybeNew method of class 'Mix4' uses 'index' argument
	public int maybeNew(int index) {
		
		// for index values 0-4
		if (index < 5) {
			
			System.out.println("maybeNew counter: " + counter);
			
			// create new instance of Mix4 object called 'm4'
			Mix4 m4 = new Mix4();
			
			// increment counter variable of m4 object
			m4.counter = m4.counter + 1;
			System.out.println("m4.counter: " + m4.counter);
			
			// return value of 1 on method calls with params 0 -4 
			return 1;
		}
		// return value of 0 on method calls with params >= 5
		return 0;
	}
}