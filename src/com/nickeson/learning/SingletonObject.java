package com.nickeson.learning;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: Singleton.java <p/>
 * <b>Project</b>: Singleton Practice <p/>
 * <b>Description: </b> Learning to build a Singleton<p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 4, 2016<p/>
 * updates:
 ****************************************************************************/

public class SingletonObject {
	
	// member var init to null : non-null = instance exists
    private static SingletonObject snglObj = null;

	// no code required, default *PRIVATE* constructor
	private SingletonObject() {
	}

	public static void main(String[] args) {
		// create one and only instance by calling getSingletonObject method
		SingletonObject.getSingletonObject();
	}
	
	// synchronized for thread safety
	public static synchronized SingletonObject getSingletonObject()
    {
      // if instance doesn't exist, call the default constructor
      if (snglObj == null) snglObj = new SingletonObject();
      return snglObj;
    }
	
	// override clone() to prevent our singleton being cloned
	public Object clone()
			throws CloneNotSupportedException
		{
			throw new CloneNotSupportedException();
		}
}