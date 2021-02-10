package testquestions;

public class EmployeeClass {
	String firstname;
	String lastname;

	public EmployeeClass(String firstname, String lastname) { // Parameterized constructor
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() { // Values are printed using toString method
		return firstname + " " + lastname;
	}

}
