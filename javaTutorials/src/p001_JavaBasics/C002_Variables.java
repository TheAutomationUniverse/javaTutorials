package p001_JavaBasics;

public class C002_Variables {
//	A) Instance Variable	
//	Declaration is anywhere within the class but outside methods.
//	Initialization is anywhere within the class.
//	Every object gets its own copy

//	B) Static Variable
//	Declaration is anywhere within the class but outside methods with static keyword.
//	Initialization is anywhere within the class.
//	Shared among all objects

//	C) Local Variable
//	Declaration & Initialization both within method only.

	int instanceIntVar; // Declaration of Instance variable
	String instanceStringVar = "Java"; // Declaration & Initialization of Instance variable
	static int staticIntVar; // Declaration of Static variable
	static String staticStringVar = "Selenium"; // Declaration & Initialization of Static variable

	public static void main(String[] args) {
		System.out.println("Inside main() method");
		C002_Variables classObject = new C002_Variables();

		int localIntVar = 10; // Declaration & Initialization of Local variable
		System.out.println("The Value of Local variable: " + localIntVar);

//		Initialization of Instance variable
		classObject.instanceIntVar = 183;
		System.out
				.println("The Value of Instance variable int by using object reference: " + classObject.instanceIntVar);
		System.out.println(
				"The Value of Instance variable String by using object reference: " + classObject.instanceStringVar);

//		Initialization of Static variable
		staticIntVar = 25;
		System.out.println("The Value of static variable without using object reference: " + staticIntVar);
		System.out.println("The Value of static variable by using object reference: " + classObject.staticIntVar);
		System.out.println("The Value of static variable without using object reference: " + staticStringVar);

//		Calling non-static method by using object reference
		classObject.addition();

//		Calling static method without using object reference
		multiplication();
	}

	public void addition() {
		System.out.println("Inside non-static method addition()");
//		Non-static method can access local, instance and static variables
		int localIntVar = 20;
		instanceIntVar = 10;
		staticIntVar = 30;
		int addition = localIntVar + instanceIntVar + staticIntVar;
		System.out.println("The addition of local & instance & static variable through non-static method: " + addition);
	}

	public static void multiplication() {
		System.out.println("Inside static method multiplication()");
//		Static method can directly access local and static variables
		int localIntVar = 20;
		staticIntVar = 10;
		int multiplication = localIntVar * staticIntVar;
		System.out.println("The multiplication of local & static variable through static method: " + multiplication);
	}
}