package p001_JavaBasics;

public class C010_ClassAndObject {
//	A Class is a template used to create objects.
//	An Object is an instance of a class.
//	A class consists of State & Behavior.
//	State = Variables/Data of an object		Example: employeeId, employeeName
//	Behavior = Actions performed by an object		Example: displayEmployee()
//	Top-level class can be public, abstract, final or default.
//	Top-level class cannot be private, protected or static.

	int employeeId = 2525;
	String employeeName = "Peter";
	int number;
	char character;
	static int number1 = 10;
	static int number2 = 20;
	int number3 = 3;
	int number4 = 4;

	void displayEmployee() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
	}

	public static void main(String[] args) {
//		Object Creation
		C010_ClassAndObject object = new C010_ClassAndObject(); // here 'object' is a object reference variable
		object.displayEmployee(); // calling a non-static method using object reference variable

		addition(number1, number2); // calling a method using class values(primitive values)
		multiplication(object); // calling a method using object reference value(objects)

		C010_ClassAndObject classObject1 = new C010_ClassAndObject();
		classObject1.number = 200;
		classObject1.character = 'X';
		C010_ClassAndObject classObject2 = new C010_ClassAndObject();
		classObject2.number = 300;
		classObject2.character = 'Y';
		C010_ClassAndObject classObject3 = new C010_ClassAndObject();
		classObject3.number = 400;
		classObject3.character = 'Z';

		System.out.println("Before Referencing");
		System.out.println(classObject1.number); // 200
		System.out.println(classObject1.character); // X
		System.out.println(classObject2.number); // 300
		System.out.println(classObject2.character); // Y
		System.out.println(classObject3.number); // 400
		System.out.println(classObject3.character); // Z

//		Only reference is copied. Object is not copied.
		System.out.println("After Referencing");
		classObject1 = classObject2;
		classObject2 = classObject3;
		classObject3 = classObject1;
		System.out.println(classObject1.number); // 300
		System.out.println(classObject1.character); // Y
		System.out.println(classObject2.number); // 400
		System.out.println(classObject2.character); // Z
		System.out.println(classObject3.number); // 300
		System.out.println(classObject3.character); // Y

//		
		NestedClass nestedClassObject = new NestedClass(); // Creating object of a Nested class
		nestedClassObject.getTotal(nestedClassObject.nestedClassVariable); // calling a method from Nested class
	}

//	Method to explain the concept of call by values
	public static void addition(int number1, int number2) {
		int total = number1 + number2;
		System.out.println("Addition is: " + total);
	}

//	Method to explain the concept of call by object reference values
	public static void multiplication(C010_ClassAndObject object) {
		int total = object.number3 * object.number4;
		System.out.println("Multiplication is: " + total);
	}

//	------------------------------------------------------------------------------------------------

//	This is a Nested class.
//	Nested (Inner) classes can be public, private, protected, default, static, final or abstract.
	protected static final class NestedClass {
		int nestedClassVariable = 10;

//		Nested classes can also have a main() method.
//		A Java class can contain multiple main() methods in different classes.
//		At runtime, JVM executes the main() method of the class selected for execution.
//		public static void main(String[] args) {
//			NestedClass object = new NestedClass();
//			System.out.println("The value of nestedClassVariable is: " + object.nestedClassVariable);
//		}

		void getTotal(int number) {
			int total = number + 5;
			System.out.println("NestedClass Total is: " + total);
		}
	}
}

// Interview Questions
// Is Java Call By Value or Call By Reference ? - Java is always Call By Value
// What is a Object Reference Variable ? - It stores the address/reference of an object