package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: HeapQuiz.java <p/>
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

public class HeapQuiz {

	// declare & initialize member var id to value 0
	int id = 0;
	
	// default constructor
	public HeapQuiz() {
	}

	// main method
	public static void main(String[] args) {
		
		// set instance vars
		int x = 0;
		HeapQuiz [] hq = new HeapQuiz[5];
		
		while (x < 3) {
			
			// populate each cell of the HeapQuiz objects array 'hq' with a new null HeapQuiz object
			hq[x] = new HeapQuiz();
			
			// assign id for each cell of HeapQuiz objects array 'hq' to value of x from loop
			hq[x].id = x;
			
			System.out.println("hq[" + x + "] = " + hq[x].id);
			
			// increment counter
			x = x+1;
		}
		
		hq[3] = hq[1]; // hq[3].id = 1
		hq[4] = hq[1]; // hq[4].id = 1	
		hq[3] = null;  // creates null reference for reference var hq[3] - compiler error
		hq[4] = hq[0]; // hq[4].id = 0
		hq[0] = hq[3]; // creates null reference for reference var hq[0] - compiler error
		hq[3] = hq[2]; // hq[3].id = 2	
		hq[2] = hq[0]; // creates null reference for reference var hq[2] - compiler error		
		
		// do stuff starts here
	}
}