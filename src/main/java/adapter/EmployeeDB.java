package adapter;

public class EmployeeDB implements Employee {

	private String id;
	private String firstName;
	private String lastName;
	private String email; 
	
	public EmployeeDB(String id, String first,String last, String email) {
		
		this.id = id;
		this.firstName=first;
		this.lastName=last;
		this.email=email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}