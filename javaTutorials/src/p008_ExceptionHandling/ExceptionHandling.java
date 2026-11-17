package p008_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
//	Exception Handling is a mechanism to handle runtime errors, so that normal execution of the program can continue.
//	'Throwable' is the Parent class of 'Exception' & 'Error'
//	Error - Generally not recoverable - Example - OutOfMemoryError, StackOverflowError
//	Exception - Can be handled
//	Exception Types - 1) Checked Exception 2) Unchecked Exception
//	Checked Exception - Checked at compile time.
//	Unchecked Exception - Checked at runtime.

	public static void arithmeticException() {
		System.out.println("This is java.lang.ArithmeticException");
		int number = 10 / 0;
		System.out.println("The number is: " + number);
	}

	public static void nullPointerException() {
		System.out.println("This is java.lang.NullPointerException");
		String string = null;
		System.out.println(string.charAt(0));
	}

	public static void stringIndexOutOfBoundsException() {
		System.out.println("This is java.lang.StringIndexOutOfBoundsException");
		String string = "JavA";
		System.out.println(string.charAt(4));
	}

	public static void arrayIndexOutOfBoundsException() {
		System.out.println("This is java.lang.ArrayIndexOutOfBoundsException");
		int[] number = new int[5];
		System.out.println(number[5] = 9);
	}

	public static void numberFormatException() {
		System.out.println("This is java.lang.NumberFormatException");
		int number = Integer.parseInt("100AK");
		System.out.println(number);
	}

	public static void fileNotFoundException() throws FileNotFoundException {
		System.out.println("This is java.io.FileNotFoundException");
		File file = new File("E://file.txt");
		FileReader fileReader = new FileReader(file);
	}

	public static void main(String[] args) throws FileNotFoundException {
//		---Unchecked Exception---
//		arithmeticException();
//		nullPointerException();
//		stringIndexOutOfBoundsException();
//		arrayIndexOutOfBoundsException();
//		numberFormatException();

//		---Checked Exception---
//		fileNotFoundException();
	}
}