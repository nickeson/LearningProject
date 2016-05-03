package com.nickeson.learning;
import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: MapIterator.java <p/>
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

public class MapIterator {

	// default constructor
	public MapIterator() {
	}
	
	// main method
	public static void main(String[] args) {
		
		// create new Map collection of Strings
		final Map<String, String> myMap = new HashMap<String, String>();
		
		// populate the HashMap with State Code and State Name data
		myMap.put("AL", "Alabama");
		myMap.put("AK", "Alaska");	
		myMap.put("AZ", "Arizona");		
		myMap.put("AR", "Arkansas");		
		myMap.put("CA", "California");		
		myMap.put("CO", "Colorado");		
		myMap.put("CT", "Connecticut");		
		myMap.put("DE", "Delaware");		
		myMap.put("FL", "Florida");		
		myMap.put("GA", "Georgia");		
		myMap.put("HI", "Hawaii");		
		myMap.put("ID", "Idaho");		
		myMap.put("IL", "Illinois");		
		myMap.put("IN", "Indiana");		
		myMap.put("IA", "Iowa");		
		myMap.put("KS", "Kansas");		
		myMap.put("KY", "Kentucky");		
		myMap.put("LA", "Louisana");		
		myMap.put("ME", "Maine");		
		myMap.put("MD", "Maryland");		
		myMap.put("MA", "Massachussets");		
		myMap.put("MI", "Michigan");		
		myMap.put("MN", "Minnesota");		
		myMap.put("MS", "Mississippi");		
		myMap.put("MO", "Missouri");		
		myMap.put("MT", "Montana");		
		myMap.put("NE", "Nebraska");		
		myMap.put("NV", "Nevada");		
		myMap.put("NH", "New Hampshire");		
		myMap.put("NJ", "New Jersey");		
		myMap.put("NM", "New Mexico");		
		myMap.put("NY", "New York");		
		myMap.put("NC", "North Carolina");		
		myMap.put("ND", "North Dakota");		
		myMap.put("OH", "Ohio");		
		myMap.put("OK", "Oklahoma");		
		myMap.put("OR", "Oregon");		
		myMap.put("PA", "Pennsylvania");		
		myMap.put("RI", "Rhode Island");		
		myMap.put("SC", "South Carolina");		
		myMap.put("SD", "South Dakota");		
		myMap.put("TN", "Tennessee");		
		myMap.put("TX", "Texas");		
		myMap.put("UT", "Utah");		
		myMap.put("VT", "Vermont");		
		myMap.put("VA", "Virginia");		
		myMap.put("WA", "Washington");		
		myMap.put("WV", "West Virginia");		
		myMap.put("WI", "Wisconsin");		
		myMap.put("WY", "Wyoming");		
		myMap.put("PR", "Puerto Rico");		
		myMap.put("VI", "U.S. Virgin Islands");		
		myMap.put("GU", "Guam");		
		myMap.put("AS", "American Samoa");				
		myMap.put("DC", "District of Columbia");					
		myMap.put("MH", "Marshall Islands");						
		myMap.put("MP", "Northern Marianas");							
		
		// iterate through all Map values, print with "/" delimiter using 'for-each' loop
		for (Map.Entry<String, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		// iterate through all Map values, print with "|" delimiter	using 'for-each' loop	
		for (String key : myMap.keySet()) {
			System.out.println(key + "|" + myMap.get(key));
		}
		
		// iterate through all Map values, print with "|" delimiter using 'for' loop
		for (Iterator<String> iter = myMap.keySet().iterator(); iter.hasNext();) {
			Object key = iter.next();
			System.out.println(key + "," + myMap.get(key));
		}
		
		// sort the list & re-print in order
		for (String key : myMap.keySet()) {
//			Collections.sort(myMap);
			System.out.println(key + "|" + myMap.get(key));
		}
	}
	
	public class StateMap implements Comparable<StateMap> {
		String stateCode;
		String stateName;
		
		@Override
		public int compareTo(StateMap sm) {
			return stateCode.compareTo(sm.stateCode);
		}
		
		// getters & setters
		public String getStateCode() {
			return stateCode;
		}
		
		public String getStateName() {
			return stateName;
		}
	}
}