package p001_JavaBasics;

public class C011_StaticAndNonStatic {
//	The 'static' keyword can be used with variable, method & block.
//	A static block always executes first even before the main() method.
//	If multiple static blocks are present, they execute in the same order in which they appear in the class.
//	static blocks are mainly used to initialize static variables. non static variables can also be initialized using object reference variables.

//	static members belong to the class and shared among all objects of that class.
//	static members can be accessed directly within the same class or by using ClassName.memberName.
//	static members can also be called by using object reference variable but; it will give a warning that it should be accessed in a static way.

//	non static members belong to objects of a class and each object gets its own copy.
//	non Static members can only be accessed with the object reference variable.

	String name; // non static global variable
	static int age; // static global variable

//	static block 1
	static {
		age = 10;
		System.out.println("static block 1 - The age is: " + age);
		C011_StaticAndNonStatic object = new C011_StaticAndNonStatic();
		object.name = "Mark";
		System.out.println("static block 1 - The name is: " + object.name);
	}

//	static block 2
	static {
		age = 20;
		System.out.println("static block 2 - The age is: " + age);
	}

//	JVM calls the main() method without creating an object that's why it is static
	public static void main(String[] args) {
		System.out.println("main() method");

		System.out.println("Current age is: " + age); // 20 - This is coming from Static block 2
		age = 27; // Initializing static variable without className.
		System.out.println("Current age without className is: " + age);
		C011_StaticAndNonStatic.age = 21; // Initializing static variable with className.
		System.out.println("Current age with className is: " + C011_StaticAndNonStatic.age);

		staticMethod1(); // calling static method without using className
//		C011_StaticAndNonStatic.staticMethod1(); // calling static method by using className

		C011_StaticAndNonStatic object = new C011_StaticAndNonStatic();
		object.nonStaticMethod1(); // Calling static method by using object reference variable

	}

//	non-static method 1
	public void nonStaticMethod1() {
		System.out.println("This is non static method");
		age = 25;
		System.out.println("non static method - static variable - age: " + age);
		staticMethod2(); // calling static method inside non static method

		name = "Peter";
		System.out.println("non static method - non static variable - Name: " + name);

	}

	void nonStaticMethod2() {
		System.out.println("This is non static method 2");
	}

//	static Method
	public static void staticMethod1() {
		System.out.println("This is static method");
		age = 18;
		System.out.println("static method - static variable - age: " + age);

//		static methods cannot directly access non-static members. An object is required.
		C011_StaticAndNonStatic object = new C011_StaticAndNonStatic();
		object.name = "David";
		System.out.println("static method - non static variable - Name: " + object.name);
		object.nonStaticMethod2(); // calling non static method inside static method
	}

	static void staticMethod2() {
		System.out.println("This is static method 2");
	}
}