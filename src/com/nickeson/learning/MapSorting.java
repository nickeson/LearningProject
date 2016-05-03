package com.nickeson.learning;

import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: HashMapSorting.java <p/>
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

public class MapSorting{

    public static void main(String args[]) {
        
        // create an empty HashMap (will contain State Codes and Names)
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        
	    // populate the HashMap with State Code and State Name data
 		myHashMap.put("AL", "Alabama");
 		myHashMap.put("AK", "Alaska");	
 		myHashMap.put("AZ", "Arizona");		
 		myHashMap.put("AR", "Arkansas");		
 		myHashMap.put("CA", "California");		
 		myHashMap.put("CO", "Colorado");		
 		myHashMap.put("CT", "Connecticut");		
 		myHashMap.put("DE", "Delaware");		
 		myHashMap.put("FL", "Florida");		
 		myHashMap.put("GA", "Georgia");		
 		myHashMap.put("HI", "Hawaii");		
 		myHashMap.put("ID", "Idaho");		
 		myHashMap.put("IL", "Illinois");		
 		myHashMap.put("IN", "Indiana");		
 		myHashMap.put("IA", "Iowa");		
 		myHashMap.put("KS", "Kansas");		
 		myHashMap.put("KY", "Kentucky");		
 		myHashMap.put("LA", "Louisana");		
 		myHashMap.put("ME", "Maine");		
 		myHashMap.put("MD", "Maryland");		
 		myHashMap.put("MA", "Massachussets");		
 		myHashMap.put("MI", "Michigan");		
 		myHashMap.put("MN", "Minnesota");		
 		myHashMap.put("MS", "Mississippi");		
 		myHashMap.put("MO", "Missouri");		
 		myHashMap.put("MT", "Montana");		
 		myHashMap.put("NE", "Nebraska");		
		myHashMap.put("NV", "Nevada");		
 		myHashMap.put("NH", "New Hampshire");		
 		myHashMap.put("NJ", "New Jersey");		
 		myHashMap.put("NM", "New Mexico");		
 		myHashMap.put("NY", "New York");		
 		myHashMap.put("NC", "North Carolina");		
 		myHashMap.put("ND", "North Dakota");		
 		myHashMap.put("OH", "Ohio");		
 		myHashMap.put("OK", "Oklahoma");		
 		myHashMap.put("OR", "Oregon");		
 		myHashMap.put("PA", "Pennsylvania");		
 		myHashMap.put("RI", "Rhode Island");		
 		myHashMap.put("SC", "South Carolina");		
 		myHashMap.put("SD", "South Dakota");		
 		myHashMap.put("TN", "Tennessee");		
 		myHashMap.put("TX", "Texas");		
 		myHashMap.put("UT", "Utah");		
 		myHashMap.put("VT", "Vermont");		
 		myHashMap.put("VA", "Virginia");		
 		myHashMap.put("WA", "Washington");		
 		myHashMap.put("WV", "West Virginia");		
 		myHashMap.put("WI", "Wisconsin");		
 		myHashMap.put("WY", "Wyoming");		
 		myHashMap.put("PR", "Puerto Rico");		
 		myHashMap.put("VI", "U.S. Virgin Islands");		
 		myHashMap.put("GU", "Guam");		
 		myHashMap.put("AS", "American Samoa");				
 		myHashMap.put("DC", "District of Columbia");					
 		myHashMap.put("MH", "Marshall Islands");						
 		myHashMap.put("MP", "Northern Marianas");
 		
 		// print out results from HashMap (no guaranteed order)
        System.out.println("HashMap before sorting, random order:");
        System.out.println("-------------------------------------");
        for (String key : myHashMap.keySet()) {
        	System.out.println(key + "|" + myHashMap.get(key));
        }
        
        // formatting
        System.out.println("\n=====================\n");
        
        // create an empty TreeMap (with State Codes and Names)
        Map<String, String> myTreeMap = new TreeMap<String, String>();        
        
        /* copy values from myHashMap to myTreeMap (since TreeMap stays sorted by
        * ascending values, this essentially sorts myHashMap values by key while
        * storing in a TreeMap
        */
        myTreeMap.putAll(myHashMap);
        
        // iterate through keys in myTreeMap, printing key/value
        System.out.println("Tree Map, sorted by keys in ascending order:");
        System.out.println("--------------------------------------------");
        for (String aKey : myTreeMap.keySet()) {
	        System.out.println(aKey + "/" + myTreeMap.get(aKey));
        }
        
        // formatting
        System.out.println("\n=====================\n");
        
        /* 
         * declare new tree map object 'revTreeMap', then populate it with the
         * entries from myHashMap (sorts into ascending order while populating)
        */
		TreeMap<String, String> revTreeMap = new TreeMap<String, String>(); 
		revTreeMap.putAll(myHashMap);
        
        // put keys into set in descending order
        Set<String> rtmKeys = revTreeMap.descendingKeySet();
        
        // iterate through keys in set, printing key,value for revTreeMap that match keys
        System.out.println("Tree Map, sorted by keys in descending order:");
        System.out.println("---------------------------------------------");
        for (String rKey : rtmKeys) {
        	System.out.println(rKey + "," + revTreeMap.get(rKey));
        }
    }
}