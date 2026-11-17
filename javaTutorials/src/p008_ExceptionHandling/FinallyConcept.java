package p008_ExceptionHandling;

public class FinallyConcept {

//	finally block executes whether exception occurs or not.

//	Difference Between final, finally, and finalize() ?
//	final - keyword
//	finally - block
//	finalize - method(called by Garbage Collector) - finalize() is deprecated now

//	Can We Have Multiple finally Blocks ? - No

	public static void main(String[] args) {
		System.out.println("----------Exception not coming-------------");
		try {
			int number = 10 / 2;
			System.out.println("The number is: " + number);
		} catch (Exception e) {
			System.out.println("Catch Block 1");
		} finally {
			System.out.println("Finally Block 1: Exception not coming");
		}
		System.out.println();

//		------------------------------------------------------------------------------------------------

//		Terminates the execution of a program
//		System.exit(0);
//		finally block will not execute after System.exit(0);

//		------------------------------------------------------------------------------------------------

		System.out.println("----------Exception coming and handled-------------");
		try {
			int number = 10 / 0;
			System.out.println("The number is: " + number);
		} catch (Exception e) {
			System.out.println("Catch Block 2");
		} finally {
			System.out.println("Finally Block 2: Exception coming and handled");
		}
		System.out.println();

//		------------------------------------------------------------------------------------------------

		System.out.println("----------Exception coming and not handled-------------");
		try {
			int number = 10 / 0;
			System.out.println("The number is: " + number);
		} finally {
			System.out.println("Finally Block 3: Exception coming and not handled");
		}
	}
}