package p001_JavaBasics;

public class C007_Arrays {

	public static void main(String[] args) {
//		A) Single-Dimensional Array - Stores data in one row
//		An Array is a container that stores a fixed number of values of the same data type.
//		The length of an array is given at the time of creation.
//		Advantage: 1) Fast data access using index 2) Easy to store multiple values
//		Disadvantage: 1) Fixed size 2) Stores same data type
//		Array index starts from 0 - because Arrays use zero-based indexing where the first element is stored at the starting memory location

		int[] intArray = new int[4]; // Declaration of Single-Dimensional Array
//		Initialization of of Single-Dimensional Array
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;

		System.out.println("The length of an array is: " + intArray.length); // size/length of array
		System.out.println("Print array using simple for loop");
		for (int index = 0; index < intArray.length; index++) {
			System.out.println(intArray[index]);
		}
		System.out.println("Print array using enhanced for loop");
		for (int arrayElement : intArray) {
			System.out.println(arrayElement);
		}
//		System.out.println(i[4]); 	--- ArrayIndexOutOfBoundsException

//		------------------------------------------------------------------------------------------------

//		Object Array can store different types of values in a single array.
		Object[] objectArray = new Object[5];
		objectArray[0] = 25;
		objectArray[1] = 44.78;
		objectArray[2] = 'X';
		objectArray[3] = true;
		objectArray[4] = "Java";
		System.out.println(objectArray[1]);
		for (Object element : objectArray) {
			System.out.println(element);
		}

//		------------------------------------------------------------------------------------------------

//		A) Two-Dimensional(2-D) Array - Stores data in rows and columns
		String[][] string2DArray = new String[3][4]; // Declaration of Two-Dimensional Array
//		Initialization of Two-Dimensional Array
		string2DArray[0][0] = "Java";
		string2DArray[0][1] = "1234";
		string2DArray[0][2] = "null";
		string2DArray[0][3] = "";

		string2DArray[1][1] = "C007";
		string2DArray[1][2] = "PlayWright";

		string2DArray[2][3] = "A";

		System.out.println(string2DArray[0][2]);
		System.out.println(string2DArray[1][3]);
		System.out.println(string2DArray[2][3]);

//		Total number of rows will be given
		System.out.println("Number of rows: " + string2DArray.length);

//		Total number of columns will be given
		System.out.println("Number of cols: " + string2DArray[0].length);

		System.out.println("Print array using simple for loop");
		for (int row = 0; row < string2DArray.length; row++) {
			for (int col = 0; col < string2DArray[row].length; col++) {
				System.out.println(string2DArray[row][col]);
			}
		}
	}
}