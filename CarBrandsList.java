package CarBrandsList;
/*
 * File name: CarBrandsList.java
 * Author: Bing Xie
 * Course: CST8284-OOP
 * Assignment: assignment3
 * Date: 2022-11-25
 * Professor: Daniel Cormier
 */

/**
 * This class creats multiple methods, uses prinf statement to call methods created 
 * and practice linkedlist understanding
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

import java.util.Collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CarBrandsList {
/**
 * main entry point of the program
 * @param args command line argument
 */
public static void main(String[] args) {
/**
 *add rides to list1
 */
String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
LinkedList<String> list1= new LinkedList<>();
list1.addAll(Arrays.asList(rides));

/**
 * add rides2 to list2
 */
String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
LinkedList<String> list2=new LinkedList<>();
list2.addAll(Arrays.asList(rides2));

// HINT: In the section below you should insert code for method calls in main for each of the sections below.

//combine list 1 and list 2 together and print the full list.
list1.addAll(list2);
printList(list1);

// calling the to print in uppercase method to print list in uppercase
System.out.printf("%nDisplaying names of car brands in uppercase letters...\n");
printUpperCase(list1);

// remove item from 5 to 7 by calling the remove method
remove(list1,5,7);
System.out.printf("%nDeleting car brands 5 to 7...\n");
printList(list1);

//calling regular print method to print the current list
System.out.printf("%nHere is the current list of car brands...\n");
printList(list1);

//calling reversed method to print list in reverse order
System.out.printf("%nReversed ");
printReverseOrder(list1);

// calling sorted method to print sort list 
System.out.printf("%nSorted car brands in alphabetical order...\n");
printSorted(list1);

//calling no duplicates method to print the list with removed duplicates
System.out.printf("%nRemoving duplicate car brands...\n");
printNoDuplicates(list1);
} 

// HINT: MORE TO DO: Insert all your methods in this section which includes: 

/**
 * output List contents
 * @param link a linkedlist parameter to be operated within the method
 */
public static void printList(LinkedList<String> link) {
	System.out.println("List is: ");
	Iterator<String>iter=link.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next()+" ");
	}
	System.out.println();
}
/**
 * locate String objects and convert to uppercase
 * @param link a linkedlist parameter to be operated within the method
 */
public static void printUpperCase(LinkedList<String> link) {
	LinkedList<String> listToUpper=new LinkedList<>();
	Iterator<String> iter=link.iterator();
	while(iter.hasNext()) {
		String str=(String)iter.next();
		str=str.toUpperCase();
		listToUpper.add(str);
	}
	link.clear();
	link.addAll(listToUpper);
	printList(link);
}

/**
 * locate String objects and eliminate duplicates of the linkedlist
 * @param link linkedlist parameter to be operated within the method
 */
public static void printNoDuplicates(LinkedList<String> link) {
	System.out.print("No duplicates are: ");
	HashSet<String>listToUpper=new HashSet<>();
	Iterator<String> iter=link.iterator();
	while(iter.hasNext()) {
		listToUpper.add(iter.next());
	}
	for (String e: listToUpper) {
		System.out.print(e+" ");
	}
}

/**
 * obtain sublist and use clear method to delete sublist items
 * @param link a linkedlist parameter to be operated within the method
 * @param a the parameter as the beginning element position to be removed from the linkedlist
 * @param b the parameter as the end element position to be removed from the linkedlist
 */
public static void remove(LinkedList<String> link, int a,int b) {
	link.subList(a,( b+1)).clear();
}
/**
 *  print the list in reverse order
 * @param link linkedlist parameter to be operated within the method
 */
public static void printReverseOrder(LinkedList<String> link) {
	Collections.reverse(link);
	printList(link);
}
/**
 * sort the list
 * @param link linkedlist parameter to be operated within the method
 */
public static void printSorted(LinkedList<String> link) {
	Collections.sort(link);
	printList(link);
}

}
