package adapter;

public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance)
	{
		this.instance=instance; 
	}
	
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurname();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}

}
