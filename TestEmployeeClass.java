package testquestions;

public class TestEmployeeClass {

	public static void main(String[] args) {
		EmployeeClass employee1 = new EmployeeClass("Tom", "T");
		EmployeeClass employee2 = new EmployeeClass("John", "J");
		EmployeeClass employee3 = new EmployeeClass("Mary", "Jane");

		System.out.println(employee1); /* The three instances of object are printed */
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
