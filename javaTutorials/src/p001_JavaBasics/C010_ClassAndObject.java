package p001_JavaBasics;

public class C010_ClassAndObject {
//	A Class is a template used to create objects.
//	An Object is an instance of a class.
//	A class have State & Behavior.
//	State = Variables/Data of an object		Example: employeeId, employeeName
//	Behavior = Actions performed by an object		Example: displayEmployee()

	int employeeId = 2525;
	String employeeName = "Peter";
	int number;
	char character;

	void displayEmployee() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
	}

	public static void main(String[] args) {
//		Object Creation
		C010_ClassAndObject object = new C010_ClassAndObject(); // here 'object' is a object reference variable
		object.displayEmployee(); // calling a non-static method using object reference variable

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
	}
}