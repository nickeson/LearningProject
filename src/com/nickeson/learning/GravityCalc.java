package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: GravityCalc.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 11, 2016<p/>
 * updates:
 ****************************************************************************/

public class GravityCalc {

	/**
	 * Gravity is constant on earth at -9.8 m/s/s
	 */
	public final float GRAVITY = -9.80665f;
	
	// Member Variables
	private double fallTime = 0.00;
	private double iniPos = 0.00;
	private double iniVel = 0.00;
				
	/**
	 * default constructor
	 */
	public GravityCalc() {
	}
	
	/**
	 * convenience constructor
	 * @param fallTime time (in seconds) that the object is in free fall
	 * @param iniPos initial position of object (in meters)
	 * @param iniVel initial velocity of object (in meters)
	 */
	public GravityCalc(double fallTime, double iniPos, double iniVel) {
		this.fallTime = fallTime;
		this.iniPos = iniPos;
		this.iniVel = iniVel;
	}

	/**
	 * Main method to set initial position and velocity, run posCalc to get 
	 * freefall position calculated, then output result
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create an instance of the GravityCalc Object (class)
		GravityCalc g1 = new GravityCalc(3,10,20);
		g1.process();
	}
	
	/**
	 * Business Logic Method
	 */
	public void process() {
		
		// run posCalc & veloCalc with initPosition and initVelocity params
		double finalPosition = posCalc();
		double finalVelocity = veloCalc();
		
		// output results to console
		System.out.println("An object's position after " +
			fallTime + " seconds of freefall with an initial position of " 
			+ iniPos + " meters "
			+ " and an initial velocity of " + iniVel + " m/s "
			+ " is " + finalPosition + " meters.");
		
		System.out.println("An object's velocity after " +
			fallTime + " seconds of freefall with an initial position of " 
			+ iniPos + " meters "
			+ " and an initial velocity of " + iniVel + " m/s "
			+ " is " + finalVelocity + " m/s.");
	}
	
	
	/**
	 * Calculates final position
	 * @return final position 0 if problems occur
	 */
	public double posCalc() {
		
		// calculate final position
		double finalPos = .5 * GRAVITY * fallTime * fallTime;
		finalPos += iniVel * fallTime;
		finalPos += iniPos;
		
		// output results of calculation
		return finalPos;
	}
	
	/**
	 * Calculates final velocity
	 * @return final velocity calculation 0 if problems occur
	 */
	public double veloCalc() {
		// calculate final velocity
		double finalVelo = iniVel + (GRAVITY * fallTime);
		
		// output results of calculation
		return finalVelo;
	}

	/**
	 * @return the fallTime
	 */
	public double getFallTime() {
		return fallTime;
	}

	/**
	 * @param fallTime the fallTime to set
	 */
	public void setFallTime(double fallTime) {
		this.fallTime = fallTime;
	}

	/**
	 * @return the iniPos
	 */
	public double getIniPos() {
		return iniPos;
	}

	/**
	 * @param iniPos the iniPos to set
	 */
	public void setIniPos(double iniPos) {
		this.iniPos = iniPos;
	}

	/**
	 * @return the iniVel
	 */
	public double getIniVel() {
		return iniVel;
	}

	/**
	 * @param iniVel the iniVel to set
	 */
	public void setIniVel(double iniVel) {
		this.iniVel = iniVel;
	}
}
