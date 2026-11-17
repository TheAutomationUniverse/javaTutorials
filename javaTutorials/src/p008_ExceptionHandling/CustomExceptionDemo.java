package p008_ExceptionHandling;

public class CustomExceptionDemo {

//	Custom Exception - is a user-defined exception created by extending the Exception class
//	Custom Exception - used to handle business-specific validation and provide meaningful exception messages.

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Valid Age");
	}

	public static void main(String[] args) {
		try {
			validateAge(25);
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}