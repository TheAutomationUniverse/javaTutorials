package p001_JavaBasics;

public class C003_Operators {

	public static void main(String[] args) {
//		A) Arithmetic Operators		+, -, *, /, %
		int number1 = 10;
		int number2 = 5;
		System.out.println("Arithmetic Operators: +, -, *, /, %");
		System.out.println("number1: " + number1 + " | number2: " + number2);
		System.out.println("Addition: " + (number1 + number2));
		System.out.println("Subtraction: " + (number1 - number2));
		System.out.println("Multiplication: " + (number1 * number2));
		System.out.println("Division: " + (number1 / number2));
		System.out.println("Modulus(Remainder): " + (number1 % number2));

//		------------------------------------------------------------------------------------------------

//		B) Assignment Operators		=, +=, -=, *=, /=, %=
		int number3 = 8;
		System.out.println("\nAssignment Operators: =, +=, -=, *=, /=, %=");
		System.out.println("number3: " + number3);
		number3 += 5;
		System.out.println("+=5 : " + number3); // 13
		number3 -= 3;
		System.out.println("-=3 : " + number3); // 10
		number3 *= 2;
		System.out.println("*=2 : " + number3); // 20
		number3 /= 4;
		System.out.println("/=4 : " + number3); // 5
		number3 %= 3;
		System.out.println("%=3 : " + number3); // 2

//		------------------------------------------------------------------------------------------------

//		C) Relational Operators			==, !=, >, <, >=, <=
		int number4 = 4;
		int number5 = 5;
		System.out.println("\nRelational Operators: ==, !=, >, <, >=, <=");
		System.out.println("number4: " + number4 + " | number5: " + number5);
		System.out.println("number4 == number5 : " + (number4 == number5)); // false
		System.out.println("number4 != number5 : " + (number4 != number5)); // true
		System.out.println("number4 > number5 : " + (number4 > number5)); // false
		System.out.println("number4 < number5 : " + (number4 < number5)); // true
		System.out.println("number4 >= number5 : " + (number4 >= number5)); // false
		System.out.println("number4 <= number5 : " + (number4 <= number5)); // true

//		------------------------------------------------------------------------------------------------

//		D) Logical Operators		&&, ||, !
		boolean condition1 = true;
		boolean condition2 = false;
		System.out.println("\nLogical Operators: &&, ||, !");
		System.out.println("condition1: " + condition1 + " | condition2: " + condition2);
		System.out.println("condition1 && condition2 : " + (condition1 && condition2)); // false
		System.out.println("condition1 || condition2 : " + (condition1 || condition2)); // true
		System.out.println("!condition1 : " + (!condition1)); // false

//		------------------------------------------------------------------------------------------------

//		E) Unary Operators		++, --
		System.out.println("\nUnary Operators: ++, --");
//		1) Post Increment - means it will first assign the value of i to j and then increase the value of i by 1, so the current value of i is 2
		int i = 1;
		int j = i++;
		System.out.println("The value of i is: " + i); // 2
		System.out.println("The value of j is: " + j); // 1

//		2) Pre Increment - means it will first increase the value of a by 1 and then assign it to b
		int a = 1;
		int b = ++a;
		System.out.println("The value of a is: " + a); // 2
		System.out.println("The value of b is: " + b); // 2

//		Post Decrement - means it will first assign the value of m to n and then decrease the value of m by 1, so the current value of m is 1
		int m = 2;
		int n = m--;
		System.out.println("The value of m is: " + m); // 1
		System.out.println("The value of n is: " + n); // 2

//		Pre Decrement - means it will first decrease the value of x by 1 and then assign it to y
		int x = 2;
		int y = --x;
		System.out.println("The value of x is: " + x); // 1
		System.out.println("The value of y is: " + y); // 1

//		------------------------------------------------------------------------------------------------

//		F) Ternary Operator
		System.out.println("\nTernary Operator: condition ? true : false");
		int age = 20;
		String result = age >= 18 ? "Eligible for Voting" : "Not Eligible for Voting";
		System.out.println(result); // Eligible for Voting

//		------------------------------------------------------------------------------------------------

//		G) Short Circuit Operators		&&, ||
		System.out.println("\nShort Circuit Operators: &&, ||");
//		1) Short-Circuit AND (&&)
//		If first condition is false, Java does NOT check second condition.
		int number6 = 6;
		boolean result1 = number6 > 20 && ++number6 > 6;
		System.out.println("Short-Circuit AND: " + result1); // false

//		2) Short-Circuit OR (||)
//		If first condition is true, Java does NOT check second condition.
		int number7 = 7;
		boolean result2 = number7 < 20 || ++number7 > 7;
		System.out.println("Short-Circuit OR: " + result2); // true
	}
}

// Interview Questions
// What are the different types of operators in Java?
// What is the difference between = and ==?
// What is the difference between Post Increment and Pre Increment?
// What is the difference between Post Decrement and Pre Decrement?
// What are Relational Operators?
// What are Logical Operators?
// What is the Ternary Operator?
// What are Short-Circuit Operators?
// What is the difference between && and &?