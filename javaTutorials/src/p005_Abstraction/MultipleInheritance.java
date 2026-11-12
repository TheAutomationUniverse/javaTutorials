package p005_Abstraction;

// Multiple Inheritance - One Child class implementing multiple Interfaces
// MultipleInheritance - Child
// Interface1 - Parent1
// Interface2 - Parent2

// Class - extends > One Class && implements > One or More Interfaces
// Interface - extends > One or More Interfaces
// Interface never extends or implements a Class.
// Interface does not use 'implements' keyword.

public class MultipleInheritance implements Interface1, Interface2 {

	public static void main(String[] args) {
		MultipleInheritance object = new MultipleInheritance();
		System.out.println("Interface extends Interface");
		object.abstractMethod();
		object.abstractMethod1();
		object.abstractMethod2();
		System.out.println();

		System.out.println("Multiple Inheritance");
		object.abstractMethod1();
		object.abstractMethod2();
		System.out.println();

		System.out.println("Diamond Problem Resolution");
		object.test();
	}

//	Overriding GrandParent method as Interface1 extends Interface
	@Override
	public void abstractMethod() {
		System.out.println("Child - Parent - GrandParent");
	}

//	Overriding Parent1 method
	@Override
	public void abstractMethod1() {
		System.out.println("Child - Parent1");
	}

//	Overriding Parent2 method
	@Override
	public void abstractMethod2() {
		System.out.println("Child - Parent2");
	}

//	Diamond Problem Resolution
	@Override
	public void test() {
		System.out.println("Overridden test() Method");
		Interface1.super.test();
		Interface2.super.test();
	}
}