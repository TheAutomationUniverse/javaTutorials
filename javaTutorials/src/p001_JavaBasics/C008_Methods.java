package p001_JavaBasics;

public class C008_Methods {
	public static void main(String[] args) {
		System.out.println("main() Method");
		C008_Methods object = new C008_Methods();

		object.test(); // calling - Method with void return type only

		object.test("The Automation Universe"); // calling - Method with void return type & argument list

		int number = object.getNumber(); // calling - Method with return type
		System.out.println("The number is: " + number);

		int result = object.addition(5, 3); // calling - Method with return type & argument list
		System.out.println("The addition is: " + result);

		object.finalMethod(); // calling - final method

		staticMethod(); // calling - static method without using object
//		object.staticMethod(); // calling static method by using object - Not Recommended
	}

//	Method with void return type only
	void test() {
		System.out.println("void returns nothing.");
	}

//	Method with void return type & argument list
//	Method Overloading - Same method name but different argument list
	void test(String value) {
		System.out.println("This is " + value);
	}

//	Method with return type
	int getNumber() {
		int number = 100;
		return number;
	}

//	Method with return type & argument list
	int addition(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}

//	final method
	final void finalMethod() {
		System.out.println("final Method");
	}

//	static method
	static void staticMethod() {
		System.out.println("static Method");
	}
}

// Interview Questions
// What is a Method ? - Method is a block of code that performs a specific task, only when it is called.
// Why do we use Methods ? - To avoid code duplication and improve code reusability and readability.

// Difference between Static and Non-Static Methods ?
// static method can be called without an object.
// non-static requires an object.

// What is Method Overloading ? - Same method name with different parameter lists.
// What is a Method Signature ? - It consists of method name & Parameter list.

// What is the purpose of return statement ? - It ends the method execution and sends a value back to the caller.

// Difference between return type and void ?
// void - this is also a return type but it returns nothing.
// return type - String - this will return String value

// What is a final method and why do we use ?
// It is a method that cannot be overridden in a child class.
// It is used when we want to keep the original implementation and prevent modification through inheritance.

// Why return type is not part of method signature ?
// Because java ignores return type while checking method signatures
// void test() - Method name having 0 parameters with void return type. 
// int test() - Method name having 0 parameters with int return type.
// Here, test method have same method name and same parameters - Duplicate method test()