package p008_ExceptionHandling;

// Checked Exception
public class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}
}