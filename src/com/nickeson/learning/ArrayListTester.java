package com.nickeson.learning;

import java.util.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: CollectionTest.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 2, 2016<p/>
 * updates:
 ****************************************************************************/

public class ArrayListTester {

	public ArrayListTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("C");
		myArrayList.add("D");	
		myArrayList.add("E");
		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("F");
		
		System.out.print("Original contents of myArrayList: ");
		Iterator<String> itr = myArrayList.iterator();
		
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println(); // formatting
		
		// modify object being iterated
		ListIterator<String> litr = myArrayList.listIterator();
		
		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+ADDED");
		}
		System.out.print("Modified contents of myArrayList: ");
		
		itr = myArrayList.iterator();
		
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println(); // formatting
		
		// print modified list, iterating backwards
		System.out.print("Modified myArrayList, printed backwards: ");
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println(); // formatting
	}
}