package testquestions;

class CustomExceptionDemo extends Exception {
	CustomExceptionDemo(String msg) {
		super(msg);
	}
}

class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) throws CustomExceptionDemo { // Parameterized Constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		try {
			if (firstName.length() < 3 || lastName.length() < 3) {
				throw new CustomExceptionDemo(
						"The string length should not be less than 3"); /* caught Null String custom Exception */
			} else {
				System.out.print(firstName + " " + lastName);
			}
		} catch (NullPointerException ex) { // caught NullPointerException

			System.out.println(ex.getMessage());
		}
	}
}

public class EmployeeClass1 {
	public static void main(String[] args) throws CustomExceptionDemo {
		Employee E1 = new Employee("jo", "john"); // pass values to constructor
	}
}
