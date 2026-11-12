package p007_Encapsulation;

public class Employee {
//	Encapsulation - wrapping data (variables) and methods into a single unit and restricting direct access to data using private access modifier.
//	All the variables are set to private and public getter and setter methods are provided.

//	Difference between Data Hiding and Encapsulation ?
//	Data Hiding is achieved using private variables.
//	Encapsulation is achieved using private variables + getter/setter methods.

//	Benefits of Encapsulation - Data Hiding & Security, Validation, Maintainability, Flexibility

	private String employeeName;
	private int employeeAge;
	private char employeeGender;
	private double employeeSalary;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		if (employeeAge >= 18) {
			this.employeeAge = employeeAge;
		} else {
			System.out.println("Invalid Age");
		}
	}

	public char getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}