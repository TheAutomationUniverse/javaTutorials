package p004_Inheritance;

// Inheritance means one class can inherit properties and behaviors from another class.
// child - parent relationship enabled.
// child - the class which inherits properties and behaviors.
// parent - the class whose members are inherited.
// The 'extends' keyword is used in a child class to inherit properties and behaviors from a parent class.
// Inheritance is used for code reusability and avoids code duplication.
// Multiple inheritance is supported only with Interfaces not with classes.
// Constructors are not inherited; but parent constructor gets executed when child class object is created.
// If both parent and child classes have common properties and behaviors, then preference is given to child class.
// The 'super' keyword is used to access parent class constructors, variables and methods.
// one child class can have only one parent class but, one parent class can have multiple child classes.

// Can Private Members Be Inherited ?
// Yes. Private members are inherited as part of the object.
// but they cannot be directly accessed in the child class because their visibility is restricted to the parent class.

public class Child extends Parent {
	public String childName = "Gracy";
	protected int childAge = 22;
	char childGender = 'F';
	private float childHeight = 5.7F;
	final double childSalary = 80.50;
	static boolean childHaveKids = true;
	String hobby = "Chess";

	public Child() {
		System.out.println("Child: Public Constructor");
//		Inherited parent class properties
		System.out.println("Parent Name: " + parentName);
		System.out.println("Parent Age: " + parentAge);
		System.out.println("Parent Gender: " + parentGender);
		System.out.println("Parent Salary: " + parentSalary);
		System.out.println("Parent Have Kids: " + parentHaveKids);
	}

	protected Child(int age) {
		System.out.println("Child: Protected Constructor");
	}

	Child(float height, double salary) {
		System.out.println("Child: Default Constructor");
	}

	private Child(boolean haveKids) {
		System.out.println("Child: Private Constructor");
		childHaveKids = haveKids;
		System.out.println("Child Have Kids: " + childHaveKids);
	}

	{
		System.out.println("Child: Instance Block");
//		Common Variables
		System.out.println("Hobby is: " + hobby); // This will give preference to child class variable.
		System.out.println("Hobby is: " + super.hobby); // This will call parent class variable.

//		Common Methods
		commonMethod(); // This will give preference to child class method.
		super.commonMethod(); // This will call parent class method.
	}

	static {
		System.out.println("Child: Static block");
	}

	public void childPublicMethod() {
		System.out.println("Child: Public Method");
	}

	protected void childProtectedMethod() {
		System.out.println("Child: Protected Method");
	}

	void childDefaultMethod() {
		System.out.println("Child: Default Method");
	}

	private void childPrivateMethod() {
		System.out.println("Child: Private Method");
	}

//	Can Static Methods Be Overridden ?
//	No. Because overriding requires runtime polymorphism. Static methods belong to the class and are resolved at compile time.
//	When a child class declares a static method with the same name and signature, it is called method hiding.
	static void staticMethod() {
		System.out.println("Child: Static Method");
	}

	final void childFinalMethod() {
		System.out.println("Child: Final Method");
	}

//	Method Overriding - child and parent class having the same method name and signature with different method body
	public void commonMethod() {
		System.out.println("Child: Common Method");
	}

	public static void main(String[] args) {
		System.out.println("Child: main() Method");
		Child child = new Child(false);
		System.out.println("Child Height: " + child.childHeight);
		child.childPrivateMethod();

//		Inherited parent class behaviors using child class object
		child.parentPublicMethod();
		child.parentProtectedMethod();
		child.parentDefaultMethod();
		child.parentFinalMethod();

//		Upcasting - Here child class object is created but the object reference is addressing to parent class.
		Parent parent = new Child();

//		child class method will execute - Because Java finds an overridden method during runtime.
		parent.commonMethod();

//		parent class method will execute - Because Java did not find overridden method during runtime.
		parent.parentPublicMethod();

//		static methods are resolved using reference type at compile time(Method Hiding)
//		child class method will execute - Because here object reference is not used
		staticMethod();

//		child class method will execute - Because here object reference is not used
		Child.staticMethod();

//		parent class method will execute - Because object reference is addressing to parent class.
//		parent.staticMethod(); // This is not even recommended as static method should be accessed in a static way
	}
}