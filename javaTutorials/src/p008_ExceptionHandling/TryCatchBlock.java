package p008_ExceptionHandling;

public class TryCatchBlock {

//	Can We Have try Without catch ? - Yes - try-finally
//	Can We Have catch Without try ? - No
//	Can We Have Multiple catch Blocks ? - Yes

//	int a=10;
	public static void main(String[] args) throws InterruptedException {
//		Uncatched exception
//		int number=9/0;
//		System.out.println(number);

//		Catched exception
		Thread.sleep(2000);

//		try - catch block
		try {
			int number = 9 / 0;
			System.out.println(number);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception caught");
	}
}