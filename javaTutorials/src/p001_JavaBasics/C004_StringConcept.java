package p001_JavaBasics;

public class C004_StringConcept {
	public static void main(String[] args) {
		String string1 = "Java is a Simple programming language.";
		System.out.println(string1);
		String string2 = "Python is a SImple programming language.";
		System.out.println("The length is: " + string1.length());
		System.out.println("The character at index number 2 is: " + string1.charAt(2));
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareToIgnoreCase(string2));
		System.out.println(string1.concat(" Selenium"));
		System.out.println(string1.contains("simple"));
		System.out.println(string1.indexOf("gra"));
		System.out.println(string1.replace("S", "D"));
		System.out.println(string1.substring(5, 24));
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		System.out.println("I'm in love with 'Selenium'");
		System.out.println("I\'m in love\\ with \"Selenium\"");
		String str = " Selenium ";
		System.out.println(str.trim());

//		------------------------------------------------------------------------------------------------

//		1)	String Buffer
		StringBuffer stringBufferObject = new StringBuffer();
		stringBufferObject.append("PlayWright");
		stringBufferObject.replace(4, 10, "Play");
		System.out.println(stringBufferObject);

//		2)	String Builder
		StringBuilder stringBuilderObject = new StringBuilder();
		stringBuilderObject.append("Selenium");
		System.out.println(stringBuilderObject);

//		------------------------------------------------------------------------------------------------

		int a = 10;
		int b = 20;

		String x = "Hello";
		String y = "Java";

		System.out.println(a + b + x + y); // 30HelloJava
		System.out.println(x + y + a + b); // HelloJava1020
		System.out.println(x + y + a * b); // HelloJava200
		System.out.println(x + y + b / a); // HelloJava2
		System.out.println(b - a + x + y); // 10HelloJava
		System.out.println(x + y + (b - a)); // HelloJava10
//		System.out.println(x + y + b - a); // Compile Error

		String string3 = "abc", string4 = "abc";
		System.out.println(string3 = string4); // abc
		System.out.println(string3 == string4); // true

//		------------------------------------------------------------------------------------------------

//		Example 1
		String string5 = "Java";
		String string6 = "Java";
		System.out.println(string5 == string6); // true
		System.out.println(string5.equals(string6)); // true
//		Both strings point to the same object in the String Constant Pool.

//		Example 2
		String stringObject1 = new String("Java");
		String stringObject2 = new String("Java");
		System.out.println(stringObject1 == stringObject2); // false
		System.out.println(stringObject1.equals(stringObject2)); // true
//		Here are two different objects, so stringObject1 != stringObject2

//		Example 3
		String string7 = "Java";
		String string8 = "java";
		System.out.println(string7.equals(string8)); // false
		System.out.println(string7.compareTo(string8)); // -32
//		Here UpperCase 'J' and lowerCase 'j' have different ASCII/Unicode values.

//		Example 4
		String string9 = "Java";
		string9.concat(" Selenium");
		System.out.println(string9); // Java
//		Output will be "Java" because String is immutable.
//		concat() creates a new String object, but we are not storing it anywhere.
		string9 = string9.concat(" Selenium");
		System.out.println(string9); // Java Selenium
//		Output will be "Java Selenium".
//		concat() creates a new String object and its reference is assigned back to string9.
	}
}

// Interview Questions
// What is String ?
// String is a class and treated as a non-primitive datatype.
// String is an immutable & thread safe & stored in Constant String Pool.

// Why Strings are Non-Primitive ?
// String can store null value, contains methods and stores object reference instead of actual primitive value.

// Why Strings are Immutable ?
// Because String literals are stored in the String Constant Pool (SCP). and those Strings can be shared between multiple resources
// So, if any resource changes the String value then other resources will also affect with new value
// So, for performance reason, String class is immutable.

// What is immutable ?
// Immutable Means once an object is created, its value cannot be changed.

// What is Thread Safe ?
// It means multiple threads can securely access the same resource at the same time.

// What is String Constant Pool?
// It is a special area inside the Java heap memory where Java stores String literals to optimize memory usage and improve performance.
// If the String already exists, Java reuses the existing object.
// If it doesn't exist, Java creates a new object and stores it in the SCP.

// Difference between == and equals() ?
// == is a Comparison operator, which compares memory addresses.
// equals() is a method, which compares actual values.

// Difference between compareTo() and equals() ?
// compareTo() - Used to compare Strings lexicographically(dictionary/alphabetical order based on Unicode values).
// Returns an int value like 0, positive number, negative number.
// equals() - Used to check whether the contents of two Strings are equal.
// Returns boolean value

// What is StringBuffer & StringBuilder ?
// StringBuffer & StringBuilder both are mutable.
// StringBuffer is thread safe but, slower than StringBuilder.
// StringBuilder is not thread safe but, faster than StringBuffer.