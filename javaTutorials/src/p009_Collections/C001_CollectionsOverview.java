
package p009_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class C001_CollectionsOverview {

	public static void main(String[] args) {

//		Q) What is Java Collections Framework ?
//			1) Java Collections Framework (JCF) is a collection of interfaces, classes and utility methods provided by Java.
//			2) It is used to store & manipulate multiple objects together.
//			3) Collections store objects, not primitive values directly. Wrapper classes and autoboxing make it convenient to work with primitive values.

//		Q) What are the main components of Collections framework ?
//			1) Interfaces
//			2) Classes
//			3) Utility Methods - Collections.sort(), Collections.reverse(), Collections.shuffle(), Collections.min(), Collections.max()

//		------------------------------------------------------------------------------------------------

//		Q) Difference between Collections & Arrays ?
//		A) Arrays
//			1) Arrays have a fixed size. Once an array is created, its size cannot be changed.
//			2) Adding or removing elements is not directly supported.
//		B) Collections
//			1) Collections generally have dynamic size.
//			2) Adding or removing elements is directly supported.
//			3) Collections provide methods to search and manipulate data as per our requirements.

//		Q) Difference between Collection & Collections ?
//			1) Collection - is an Interface. - Collection<String> names = new ArrayList<>();
//			2) Collections - is an utility class. - Collections.sort(names);

//		------------------------------------------------------------------------------------------------

//		Collections Framework Hierarchy
//		A) Iterable(Interface)
//			1) Iterable is the root interface of the Collection hierarchy.
//			2) 'Collection' Interface extends Iterable Interface.
//			3) Iterable provides iterator() method, which returns an Iterator object.
//			4) Iterator is a separate Interface and does NOT extend Iterable Interface.
//			5) 'ListIterator' Interface extends 'Iterator' Interface.
//		
//		B) Collection(Interface)
//			1) It is the root interface for List, Set and Queue.
//			2) Methods: add() addAll() remove() removeAll() retainAll() contains() containsAll() size() isEmpty() clear() iterator() toArray()

//		C) List(Interface) - extends Collection(Interface)
//			1) Stores elements in ordered format.
//			2) Supports index-based access.
//			3) Allows duplicate elements.
//			4) 'ArrayList', 'LinkedList', & 'Vector' these Classes implements 'List' Interface
//			5) 'Stack' Class extends 'Vector' Class.

//		D) Set(Interface) - extends Collection(Interface)
//			1) Doesn't support index-based access.
//			2) Doesn't allow duplicate elements.
//			3) Ordering depends on the implementation.
//	    		HashSet       -> No guaranteed iteration order.
//	    		LinkedHashSet -> Maintains insertion order.
//	    		TreeSet       -> Maintains sorted order.
//			4) 'HashSet' Class implements 'Set' Interface
//			5) 'LinkedHashSet' Class extends 'HashSet' Class and implements 'Set' Interface
//			6) 'SortedSet' Interface extends 'Set' Interface
//			7) 'TreeSet' Class implements 'NavigableSet' Interface which extends 'SortedSet' Interface

//		E) Queue(Interface) - extends Collection(Interface)
//			1) Queue is used to hold elements before processing.
//			2) Many Queue implementations follow FIFO ordering.
//			3) Queue implementations may allow duplicate elements.
//			4) 'PriorityQueue' Class implements 'Queue' Interface.
//			5) PriorityQueue processes elements according to priority, not insertion order.
//			6) 'ArrayDeque' & 'LinkedList' these Classes implements 'Deque' Interface which extends 'Queue' Interface.

//		F) Map(Interface) - part of Collections Framework but does not extend Collection Interface.
//			1) Stores elements in <Key, Value> format.
//			2) 'Key' must be unique but, 'Value' can be duplicate.
//			3) 'HashMap' & 'Hashtable' these Classes implements 'Map' Interface.
//			4) 'LinkedHashMap' Class extends 'HashMap' Class and implements 'Map' Interface.
//			5) 'TreeMap' Class implements 'NavigableMap' Interface which extends 'SortedMap' Interface which extends 'Map' Interface.

//		------------------------------------------------------------------------------------------------

//		Q) Difference between Iterator & ListIterator ?
//		A) Iterator
//			1) It is used to traverse elements of an Iterable object.
//			2) Traverses only in forward direction.
//			3) Doesn't provide index-based access.
//			4) Methods: hasNext() next() remove()
//		B) ListIterator
//			1) It is used to traverse List only.
//			2) Traverse in both forward & backward direction.
//			3) Provide index-based access.
//			4) Methods: hasNext() next() remove() hasPrevious() previous() nextIndex() previousIndex() add() set()

//		------------------------------------------------------------------------------------------------

//		Creating a Collection reference using ArrayList object.
		Collection<String> testCases = new ArrayList<>();

//		Adding elements to the Collection.
		testCases.add("TC_Login");
		testCases.add("TC_Logout");
		testCases.add("TC_Search");
		testCases.add("TC_AddToCart");

//		Displaying total number of elements.
		System.out.println("Total Test Cases: " + testCases.size());

//		Checking whether a particular test case exists.
		System.out.println("Contains TC_Login: " + testCases.contains("TC_Login"));

//		Traversing Collection using enhanced for loop.
		System.out.println("\nUsing enhanced for loop:");
		for (String testCase : testCases) {
			System.out.println(testCase);
		}

//		Traversing Collection using Iterator.
		System.out.println("\nUsing Iterator:");
		Iterator<String> iterator = testCases.iterator();
		while (iterator.hasNext()) {
			String testCase = iterator.next();
			System.out.println(testCase);
		}

//		Removing an element.
		testCases.remove("TC_Logout");
		System.out.println("\nAfter Removing TC_Logout:");
		System.out.println(testCases);

//		Checking whether Collection is empty.
		System.out.println("\nIs Collection Empty? " + testCases.isEmpty());

//		Converting Collection to Array.
		Object[] testCaseArray = testCases.toArray();
		System.out.println("\nConverted Array:");
		System.out.println(Arrays.toString(testCaseArray));
	}
}