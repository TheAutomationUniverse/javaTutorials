package p001_JavaBasics;

public class C006_Loops {

	public static void main(String[] args) {
//		Any loop may become infinite if the termination condition never becomes false.

		System.out.println("----------while----------");
//		while first checks the condition
		int a = 6;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

//		------------------------------------------------------------------------------------------------

		System.out.println("----------do while----------");
//		do while executes once before checking the condition
		int b = 6;
		do {
			System.out.println(b);
			b++;
		} while (b <= 5);

//		------------------------------------------------------------------------------------------------

		System.out.println("----------for----------");
		for (int c = 1; c <= 5; c++) {
			System.out.println(c);
		}

//		------------------------------------------------------------------------------------------------

		System.out.println("----------for each----------");
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int number : numbers) {
			System.out.println(number);
		}

//		------------------------------------------------------------------------------------------------

		System.out.println("----------break statement----------");
//		Terminates the loop completely from current iteration till end
		for (int d = 5; d >= 1; d--) {
			if (d == 3) {
				break;
			}
			System.out.println(d);
		}

//		------------------------------------------------------------------------------------------------

		System.out.println("----------continue statement----------");
//		Skips the current iteration and moves to the next iteration
		for (int e = 0; e <= 5; e++) {
			if (e == 3) {
				continue;
			}
			System.out.println(e);
		}
	}
}