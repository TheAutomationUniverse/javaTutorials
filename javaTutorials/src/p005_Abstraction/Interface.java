package p005_Abstraction;

public interface Interface {
//	The 'interface' keyword is used to declare an Interface.
//	Interface mainly contain public abstract methods, but can also contain default, static and private methods.
//	Interfcae don't have constructors.
//	Interface variables are by default public, static & final in nature; so need to initialize at the time of declaration.
//	Interface supports Multiple inheritance.
//	Interface can not extends Class but can extends multiple Interfaces.

	int number = 10; // variable Declaration & Initialization at the same time

//	abstract method - doesn't requires abstract keyword
	void abstractMethod();

//	non abstract private method
	private void nonAbstractPrivateMethod() {
		System.out.println("Interface - Non Abstract Private Method");
	}

//	non abstract static method
	static void nonAbstractStaticMethod() {
		System.out.println("Interface - Non Abstract Static Method");
	}

//	non abstract default method
	default void nonAbstractDefaultMethod() {
		System.out.println("Interface - Non Abstract Default Method");
		nonAbstractPrivateMethod();
	}
}