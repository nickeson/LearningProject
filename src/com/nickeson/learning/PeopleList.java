package com.nickeson.learning;
import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: PeopleList.java <p/>
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

public class PeopleList {

	// default constructor
	public PeopleList() {
	}

	// main method
	public static void main(String[] args) {
		
		// create a new List object called 'peopleList' to hold Person objects
		List<Person> peopleList = new ArrayList<Person>();
		
		// create new Person objects containing data (ID, firstName, lastName)
		Person person1 = new Person(1, "Jamie", "Jenkins");
		Person person2 = new Person(2, "Jody", "Jenkins");
		Person person3 = new Person(3, "Jeff", "Hans");
		Person person4 = new Person(4, "Jamie", "Roberts");
		
		// populate peopleList with Person objects we just created
		peopleList.add(person1);
		peopleList.add(person2);
		peopleList.add(person3);
		peopleList.add(person4);
		
		// create iterator object to loop through peopleList
		Iterator<Person> itr = peopleList.iterator();
		
		System.out.println("peopleList as entered (default order):\n");
		
		// loop through peopleList and print values
		while (itr.hasNext()) {
			Person currPers = itr.next();
			System.out.println(currPers.toString() + " ");
		}
		
		// shuffle peopleList
		Collections.shuffle(peopleList);
		
		// formatting
		System.out.println("\n=========================\n");
		System.out.println("peopleList after shuffling:\n");
		
		// create new iterator for shuffled list
		Iterator<Person> itr2 = peopleList.iterator();	
		
		// loop through peopleList and print shuffled values
		while (itr2.hasNext()) {
			Person currPers = itr2.next();
			System.out.println(currPers.toString() + " ");
		}
	}
}