public class Client
{
	private String cliName;
	private String clientType;
	private String service;
	private String contactNo;
	private String email;
	private int orNumber;

	public void setName(String n) {
		cliName =  n;
	}

	public String getName() {
		return(cliName);
	}

	public void setClientType(String c) {
		clientType =  c;
	}

	public String getClientType() {
		return(clientType);
	}

	public void setService(String s) {
		service = s;
	}

	public String getService() {
		return(service);
	}

	public void setContactNo(String c) {
		contactNo = c;
	}

	public String getContactNo() {
		return(contactNo);
	}

	public void setEmail(String e) {
		email = e;
	}

	public String getEmail() {
		return(email);
	}

	public void setOrNumber(int o) {
		orNumber = o;
	}

	public int getOrNumber() {
		return(orNumber);
	}

	public String toString() {
		return("Client Name: " + cliName + "Client Type: " + clientType + "Service: " + service + "Contact number: " + contactNo + "Email address: " + email + " OR Number: " + orNumber);
	}
}
