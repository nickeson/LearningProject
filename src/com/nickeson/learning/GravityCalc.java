package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: GravityCalc.java <p/>
 * <b>Project</b>: LearningProject1 <p/>
 * <b>Description: </b> An earth gravity calculator that computes final position 
 * and velocity, given intitial position, velocity and fall time
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
	 * Gravity is constant on earth at -9.8 (m/s)/s
	 */
	public final double GRAVITY = -9.80665d;
	
	// Member Variables initialized to 0 for default constructor
	private double fallTime = 0; 
	private double iniPos = 0;
	private double iniVel = 0;
				
	/**
	 * default constructor
	 */
	public GravityCalc() {
	}
	
	/**
	 * convenience constructor
	 * @param fallTime time (in seconds) that the object is in free fall
	 * @param iniPos initial position of object (in meters)
	 * @param iniVel initial velocity of object (in meters per second)
	 */
	public GravityCalc(double fallTime, double iniPos, double iniVel) {
		this.fallTime = fallTime;
		this.iniPos = iniPos;
		this.iniVel = iniVel;
	}

	/**
	 * Main method - create instance of GravityCalc, set GravityCalc params, then run businessLogic
	 * @param args
	 */
	public static void main(String[] args) {
		
		GravityCalc g1 = new GravityCalc(3,10,20);
		g1.businessLogic();
	}
	
	/**
	 * Method to use specific instance of GravityCalc, run posCalc and veloCalc
	 * on that instance, and output results to console
	 */
	public void businessLogic() {
		
		// run posCalc & veloCalc with instance's passed params
		double finalPosition = posCalc();
		double finalVelocity = veloCalc();
		
		// output results to console
		System.out.println("An object's position after " +
			fallTime + " seconds of freefall with an initial position of " 
			+ iniPos + " meters"
			+ " and an initial velocity of " + iniVel + " m/s"
			+ " is " + finalPosition + " meters.");
		
		System.out.println("An object's velocity after " +
			fallTime + " seconds of freefall with an initial position of " 
			+ iniPos + " meters"
			+ " and an initial velocity of " + iniVel + " m/s"
			+ " is " + finalVelocity + " m/s.");
	}
	
	
	/**
	 * Calculates object's final position
	 * @return final position 0 if problems occur
	 */
	public double posCalc() {
		
		double finalPos = .5 * GRAVITY * fallTime * fallTime;
		finalPos += iniVel * fallTime;
		finalPos += iniPos;
		
		return finalPos;
	}
	
	/**
	 * Calculates object's final velocity
	 * @return final velocity calculation 0 if problems occur
	 */
	public double veloCalc() {
		
		double finalVelo = iniVel + (GRAVITY * fallTime);
		
		return finalVelo;
	}
	
	/**
	 * Returns the object's fall time (in sec)
	 * @return the fallTime
	 */
	public double getFallTime() {
		return fallTime;
	}

	/**
	 * Sets the object's fall time (in sec)
	 * @param fallTime the fallTime to set
	 */
	public void setFallTime(double fallTime) {
		this.fallTime = fallTime;
	}

	/**
	 * Returns the object's initial position (in meters)
	 * @return the iniPos
	 */
	public double getIniPos() {
		return iniPos;
	}

	/**
	 * Sets the object's initial position (in meters)
	 * @param iniPos the iniPos to set
	 */
	public void setIniPos(double iniPos) {
		this.iniPos = iniPos;
	}

	/**
	 * Returns the object's initial velocity (in m/s)
	 * @return the iniVel
	 */
	public double getIniVel() {
		return iniVel;
	}

	/**
	 * Sets the object's initial velocity (in m/s)
	 * @param iniVel the iniVel to set
	 */
	public void setIniVel(double iniVel) {
		this.iniVel = iniVel;
	}
}
