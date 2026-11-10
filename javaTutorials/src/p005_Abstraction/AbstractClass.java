package p005_Abstraction;

public abstract class AbstractClass {
//	The 'abstract' keyword is used to declare abstract class & methods.
//	Abstract class can provide partial abstraction because it can contain both abstract and non abstract methods.
//	Abstract class can have constructors and can be called once Child class object is created.
//	Abstract class variables are not by default public, static & final in nature; so we can initialize whenever we want.
//	Abstract class participate in Single, Multilevel and Hierarchical Inheritance.
//  Abstract class can extends Class or implements Interfaces.

	int number; // variable Declaration

//	abstract class constructor
	public AbstractClass() {
		number = 20; // variable initialization
		System.out.println("Abstract Class - Constructor - Number is: " + number);
	}

//	abstract method - requires abstract keyword
	abstract void abstractMethod();

//	non abstract method
	void nonAbstractMethod() {
		System.out.println("Abstract Class - Non Abstract Method");
	}
}