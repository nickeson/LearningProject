package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: PhraseOMatic.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 18, 2016<p/>
 * updates:
 ****************************************************************************/

public class PhraseOMatic {

	public PhraseOMatic() {
		// Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Auto-generated main method stub
		String[] wordListOne = { "24/7", "multi-tier", "30,000 foot", "B-to-B", 
			"win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", 
			"critical-path", "dynamic" };
		
		String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", 
			"centric", "distributed", "clustered", "branded", "outside-the-box", 
			"positioned", "networked", "focused", "leveraged", "aligned", 
			"targeted", "shared", "cooperative", "accelerated" };
		
		String[] wordListThree = { "process", "tipping-point", "solution", 
			"architecture", "core competency", "strategy", "mindshare", "portal", 
			"space", "vision", "paradigm", "mission" };
		
		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);	
		
		// now build a phrase
		String phrase = wordListOne[rand1] + " " +
			wordListTwo[rand2] + " " + wordListThree[rand3];	
		
		// print out the phrase
		System.out.println("What we need is a " + phrase + ".");
	}
}