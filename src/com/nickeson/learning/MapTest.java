package com.nickeson.learning;
import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: MapTest.java <p/>
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

public class MapTest {

	public MapTest() {
	}

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Kathy", 42);
		scores.put("Bert", 343);	
		scores.put("Skyler", 420);		
		
		System.out.println(scores);
		System.out.println(scores.get("Bert"));
	}

}
