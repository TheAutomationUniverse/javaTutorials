package p001_JavaBasics;

public class C001_DataTypes {
//	Datatype: Specifies size & type of value that can be stored in an identifier.

//	Primitive Data Types
//	1) Already defined
//	2) It can't be null, must have a value
//	3) These are written in lowerCase.
//	4) Example: byte, short, int, long, float, double, char, boolean

//	Non-Primitive Data Types
//	1) Defined or created by programmers
//	2) It can be null
//	3) Most of these follows PascalCase naming convention.
//	4) Example: String, Array, Class, Interface

	static int intTypeDefault;
	static double doubleTypeDefault;
	static char charTypeDefault; // It's a Unicode null character
	static boolean booleanTypeDefault;
	static String stringDefault;

	public static void main(String[] args) {
//		Types of Primitive Data Types
//		A) Integer Types
//		1) byte		ranges from -128 to 127
		byte byteType = 127;
		System.out.println("The value of byte datatype is: " + byteType);

//		2) short 	ranges from -32,768 to 32,767
		short shortType = 32767;
		System.out.println("The value of short datatype is: " + shortType);

//		3) int
		int intType = 2147483647;
		System.out.println("The value of int datatype is: " + intType);
		intType = 20; // replacing the value of i by 20
		System.out.println("The value of i after replacing is: " + intType);

//		4) long
		long longType = 9223372036854775807L;
		System.out.println("The value of long datatype is: " + longType);

//		B) Floating Types
//		1) float		It can not work without Suffix "F" 
		float floatType = 4.5F;
		System.out.println("The value of float datatype is: " + floatType);

//		2) double	It can work with or without Suffix "D" 
		double doubleTypeWithSuffix = 12.33D;
		System.out.println("The value of double datatype with Suffix is: " + doubleTypeWithSuffix);
		double doubleTypeWithoutSuffix = 12.33;
		System.out.println("The value of double datatype without Suffix is: " + doubleTypeWithoutSuffix);
		double doubleType = 100D;
		System.out.println("The value of double datatype is: " + doubleType);

//		C) Character Type
		char charType = 'A';
		System.out.println("The value of char datatype is: " + charType);

//		D) Boolean Type
		boolean booleanType = false;
		System.out.println("The value of boolean datatype is: " + booleanType);

//		------------------------------------------------------------------------------------------------

//		Types of Non-Primitive Data Types
//		Wrapper Classes convert primitive datatypes into objects.
//		Collections can store only objects, not primitive values.
//		A) Integer Types
//		1) Byte
		Byte wrapperByte = -128;
		System.out.println("The value of Wrapper class Byte datatype is: " + wrapperByte);

//		2) Short
		Short wrapperShort = -32768;
		System.out.println("The value of Wrapper class Short datatype is: " + wrapperShort);

//		3) Integer
		Integer wrapperInteger = -2147483648;
		System.out.println("The value of Wrapper class Integer datatype is: " + wrapperInteger);

//		4) Long
		Long wrapperLong = -9223372036854775808L;
		System.out.println("The value of Wrapper class Long datatype is: " + wrapperLong);

//		B) Floating Types
//		1) Float
		Float wrapperFloat = 4.5F;
		System.out.println("The value of Wrapper class Float datatype is: " + wrapperFloat);

//		2) Double
		Double wrapperDouble = 4.5D;
		System.out.println("The value of Wrapper class Double datatype is: " + wrapperDouble);

//		C) Character Type
		Character wrapperCharacter = 'K';
		System.out.println("The value of Wrapper class Character datatype is: " + wrapperCharacter);

//		D) Boolean Type
		Boolean wrapperBoolean = true;
		System.out.println("The value of Wrapper class Boolean datatype is: " + wrapperBoolean);

//		E) Class, Interface, String, Array these are also the Non-Primitive datatypes

//		------------------------------------------------------------------------------------------------

//		A) Automatic/Implicit Type casting - Smaller → Bigger
		int integerValue = 10;
		float implicitCastingResult = integerValue;
		System.out.println("The Automatic Type Casting is: " + implicitCastingResult);

//		B) Manual/Explicit Type casting	- Bigger → Smaller
		float floatValue = 98.89f;
		int explicitCastingResult = (int) floatValue;
		System.out.println("The Manual Type Casting is: " + explicitCastingResult);

//		------------------------------------------------------------------------------------------------

		Integer autoBoxing = 10; // AutoBoxing - Primitive → Wrapper
		System.out.println("AutoBoxing Value: " + autoBoxing);

		int unBoxing = autoBoxing; // UnBoxing - Wrapper → Primitive
		System.out.println("UnBoxing Value: " + unBoxing);

//		------------------------------------------------------------------------------------------------

		byteType++; // Overflow
		System.out.println("The Overflow value of byte datatype is: " + byteType);

		wrapperByte--; // Underflow
		System.out.println("The Underflow value of byte datatype is: " + wrapperByte);

//		------------------------------------------------------------------------------------------------

//		ASCII value of char
		char charValue = 'A';
		System.out.println("ASCII value of char 'A' is: " + (int) charValue);

//		------------------------------------------------------------------------------------------------

//		Default Values
		System.out.println("The Default value of int datatype is: " + intTypeDefault);
		System.out.println("The Default value of double datatype is: " + doubleTypeDefault);
		System.out.println("Unicode value of default char datatype is: " + (int) charTypeDefault);
		System.out.println("The Default value of boolean datatype is: " + booleanTypeDefault);
		System.out.println("The Default value of String datatype is: " + stringDefault);

//		------------------------------------------------------------------------------------------------

//		Find Minimum & Maximum values using Constants
		System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
		System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
	}
}

// Interview Questions
// What is the difference between Primitive and Non-Primitive Datatypes?
// What is the difference between int and Integer?
// What are Wrapper Classes in Java?
// What is AutoBoxing and UnBoxing?
// What is Type Casting?
// What is the default value of primitive datatypes?
// Why is the default value of char not visible?
// What is Overflow and Underflow?
// How can you find minimum and maximum values without memorizing them?
// Why is String considered a Non-Primitive Datatype?
// Why do Collections use Wrapper Classes instead of Primitive Datatypes?