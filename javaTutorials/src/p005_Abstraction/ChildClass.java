package p005_Abstraction;

public class ChildClass extends AbstractClass implements Interface {
//	Abstraction - Hide internal implemetation details & provide only necessary details
//	Abstraction is achieved using Abstract class or Interface
//	Abstract methods have only method declaration, no method body.
//	If a Child class is extending an Abstract class or implementing Interfaces then, that Child class must have to implements all the abstract methods.
//  Object creation is not allowed in Abstract class or Interface.
//	The object of Child class can be referred by the reference variable of Abstract class or Interface.

	@Override
//	While overriding, if the same method is inherited from both an Abstract class and an Interface, then the implementation must satisfy both contracts.
//	abstractMethod() in AbstractClass has 'default' access.
//	abstractMethod() in Interface has also 'default' access but Java converts it to 'public' access.
//	Therefore the overriding method must be declared as public, because visibility cannot be reduced during overriding.
	public void abstractMethod() {
		System.out.println("Child Class - Abstract Method");
	}

	public static void main(String[] args) {
		ChildClass childReference = new ChildClass();
		childReference.abstractMethod();
		childReference.nonAbstractMethod();
		childReference.nonAbstractDefaultMethod();

		AbstractClass abstractClassReference = new ChildClass();
		abstractClassReference.abstractMethod();
		abstractClassReference.nonAbstractMethod();

		Interface interfaceReference = new ChildClass();
		interfaceReference.abstractMethod();
		Interface.nonAbstractStaticMethod();
		interfaceReference.nonAbstractDefaultMethod();
	}
}