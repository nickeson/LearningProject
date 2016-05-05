package com.nickeson.learning;

//JDK 1.8.0
import static java.lang.System.out; // static import to make output easier
import java.util.*;

/****************************************************************************
 * <b>Title</b>: LunarCodeMagnets.java <p/>
 * <b>Project</b>: LunarCodeMagnets - Head Start Book <p/>
 * <b>Description: </b>Prints out dates of full moons<p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 5, 2016<p/>
 * updates:
 ****************************************************************************/

public class LunarCodeMagnets {

	static int DAY_IM = 1000 * 60 * 60 * 24; // num of ms in a month
	
	public LunarCodeMagnets() {
	}

	public static void main(String[] args) {
		// create calendar instance (static method)
		Calendar c = Calendar.getInstance();
		
		// set date on calendar to 02/07/2004 @ 3:40PM (MST)
		c.set(2004,1,7,15,40);
		out.println(String.format("full moon on %tc", c));			
		
		// set day1 to current time on calendar in ms
		long day1 = c.getTimeInMillis();
		
		// loop 60 times, incrementing day1 by (1mo * #days between full moons)
		for (int x = 0; x < 60; x++) {
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1);
			out.println(String.format("full moon on %tc", c));
		}
	}
}