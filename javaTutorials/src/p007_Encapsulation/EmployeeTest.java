package p007_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee parentObject = new Employee();
		parentObject.setEmployeeName("Peter");
		parentObject.setEmployeeAge(25);
		parentObject.setEmployeeGender('M');
		parentObject.setEmployeeSalary(150.35);

		System.out.println("Employee Name: " + parentObject.getEmployeeName());
		System.out.println("Employee Age: " + parentObject.getEmployeeAge());
		System.out.println("Employee Gender: " + parentObject.getEmployeeGender());
		System.out.println("Employee Salary: " + parentObject.getEmployeeSalary());

		System.out.println();

		parentObject.setEmployeeName("Maria");
		parentObject.setEmployeeAge(17); // Here validation failed so it will return Age 25
		parentObject.setEmployeeGender('F');
		parentObject.setEmployeeSalary(45.20);

		System.out.println("Employee Name: " + parentObject.getEmployeeName());
		System.out.println("Employee Age: " + parentObject.getEmployeeAge());
		System.out.println("Employee Gender: " + parentObject.getEmployeeGender());
		System.out.println("Employee Salary: " + parentObject.getEmployeeSalary());
	}
}