package p001_JavaBasics;

public class C009_Constructors {
//	Constructor can be public, private, protected or default.
//	Constructor cannot be static, final, abstract or synchronized.
//	Constructors can be overloaded but, can't be overridden.
//	Interfaces do not have constructors.
//	Always parent class constructor gets called before child class constructor.
//	Types of constructors: 1) Default	2) Parameterized

//	The 'this' keyword is used to refer to the current class object and its properties.
//	The 'super' keyword is used to access parent class constructors, methods and variables.
//	super should be the first statement and it should be used within child class only.
//	One constructor can call another constructor by using 'this' keyword but; it should be the first statement.
//	We can use 'super' & 'this' together in one constructor but there are two conditions:
//	1) First statement should be for constructor call
//	2) Second should be used only for accessing the class properties but not for calling another constructor.

	int total;

//	Default Constructor - If no constructor is explicitly created then Java automatically provides a default constructor.

//	Parameterized Constructor
//	Constructor Chaining - Calling one constructor from another constructor using this()
	C009_Constructors(int number1, int number2) {
		this(number1 + number2);
	}

	C009_Constructors(int subTotal) {
		total = subTotal;
		System.out.println("The total is:" + total);
	}

	public static void main(String[] args) {
		C009_Constructors object = new C009_Constructors(20, 30);
		System.out.println("New total is " + (object.total = 25));
	}
}

// Interview Questions
// What is a Constructor ?
// Constructor has the same name as class name.
// Constructor looks like a method but; it's not a method because, it won't return any value.

// Why do we use Constructors ? - to initialize the object & class properties.

// What is Constructor Overloading ? - Multiple constructors with the same name but different parameter lists.

// Difference Between Constructor and Method ?
// Constructor - Same name as class, No return type, Called automatically during object creation, initializes objects & class properties
// Method - Any valid name, Has return type or void, Called explicitly, Performs operations

// Why can't constructors be static ?
// Constructors are used to initialize objects. Static members belong to the class, not to an object, therefore constructors cannot be static.

// Why can't constructors be final?
// Constructors are never inherited, so overriding is not possible. Therefore final has no meaning for constructors.