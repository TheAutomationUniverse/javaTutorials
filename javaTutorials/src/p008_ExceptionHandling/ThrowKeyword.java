package p008_ExceptionHandling;

public class ThrowKeyword {

//	throw is used to explicitly throw an exception.

	public static void main(String[] args) {
		System.out.println("ABC");
		try {
			throw new Exception("MyPersonalException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PQR");

//		------------------------------------------------------------------------------------------------

		String Exce_Flag = "N";
		if (Exce_Flag.equals("N")) {
			try {
				throw new Exception("FlagIsBlankException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}