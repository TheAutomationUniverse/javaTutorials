package p006_Polymorphism;

public class ChildClass extends ParentClass {
//	Polymorphism means one entity can take many forms.
//	Realtime Example - A man can be father, brother, employee at the same time.

//	Types of Polymorphism:
//	1) Compile-Time Polymorphism - Method Overloading - Static Polymorphism - Early Binding
//	A class having same method name but different parameter list.
//	Method Overloading can be achieved in 3 ways
//		1) Number of parameters
//		2) Different datatype of parameters
//		3) Sequence of different datatype of parameters
//	private, static and final methods can be overloaded.

//	2) Run-Time Polymorphism - Method Overriding - Dynamic Polymorphism - Late Binding
//	A Child class and Parent class having the same method name,	same parameter list and compatible return type.
//	Purpose of overriding - child class can give it's own implementation.
//	While overriding a method, the number of parameters, datatypes & sequence of datatypes should exactly match with overridden method.
//	private & final methods can't be overridden; static methods are hidden.

	public static void main(String[] args) {
//		Compile-Time Polymorphism - Java decides at compiletime which method to call
		ChildClass object = new ChildClass();
		object.methodOverloading();
		object.methodOverloading(25);
		object.methodOverloading("David", 50000);
		object.methodOverloading(2022, "New Zealand");

//		Run-Time Polymorphism - Java decides at runtime which method to execute
//		Runtime Polymorphism works only for overridden methods. If a method is not overridden, parent implementation executes.
		ParentClass parentReference = new ChildClass(); // Upcasting
		parentReference.methodOverriding(); // non-overridden method
		parentReference.methodOverriding("Google"); // overridden method
	}

	void methodOverloading() {
		System.out.println("Employee Information");
	}

//	Number of parameters
	void methodOverloading(int employeeID) {
		System.out.println("Employee ID: " + employeeID);
	}

//	Different datatype of parameters
	void methodOverloading(String employeeName, int employeeSalary) {
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}

//	Sequence of different datatype of parameters
	void methodOverloading(int joiningYear, String employeeLocation) {
		System.out.println("Employee Year: " + joiningYear);
		System.out.println("Employee Location: " + employeeLocation);
	}

	@Override
	void methodOverriding(String companyName) {
		System.out.println("Child Company: " + companyName);
	}
}