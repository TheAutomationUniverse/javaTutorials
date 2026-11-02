package p001_JavaBasics;

public class C005_ConditionalStatements {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		System.out.println("Numbers are: " + number1 + ", " + number2 + ", " + number3);
//		Simple if	
		if (number2 > number1) {
			System.out.println(number2 + " is greater than " + number1);
		}

//		------------------------------------------------------------------------------------------------

//		Simple if else
		if (number3 > number2) {
			System.out.println(number3 + " is greater than " + number2);
		} else {
			System.out.println(number2 + " is greater than " + number3);
		}

//		------------------------------------------------------------------------------------------------

//		else-if Ladder
		if ((number1 > number2) && (number1 > number3)) {
			System.out.println(number1 + " is greater than " + number2 + " & " + number3);
		} else if (number2 > number3) {
			System.out.println(number2 + " is greater than " + number1 + " & " + number3);
		} else {
			System.out.println(number3 + " is greater than " + number1 + " & " + number2);
		}

//		------------------------------------------------------------------------------------------------

//		Nested if
		if (number2 > number1) {
			if (number3 > number2) {
				System.out.println(number3 + " is greater than " + number2);
			}
		}

//		------------------------------------------------------------------------------------------------

//		switch case
		switch (number2) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		default:
			System.out.println("Invalid Day");
		}
	}
}

// Interview Questions
// What are Conditional Statements in Java?
// Difference between if and if-else?
// Difference between else-if ladder and nested if?
// Can we use String in switch statement? - YES
// What is the purpose of break in switch? - To exit the switch block after a matching case is executed.

// What happens if break is omitted ?
// After matching case found, Java continues executing all subsequent cases until it finds a break or reaches the end.

// When should switch be preferred over if-else?
// Use switch for multiple fixed values of the same variable, and use if-else for complex conditions or ranges.