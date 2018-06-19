import java.math.BigDecimal;

public class Consultant
{
	private String date;
	private String conName;
	private String tinNumber;
	private String email;
	private String contactNumber;
	private String office;
	private String service;
	private BigDecimal pfAmount;

	public void setDate(String d) {
		date = d;
	}

	public String getDate() {
		return(date);
	}

	public void setConName(String n) {
		conName = n;
	}

	public String getConName() {
		return(conName);
	}

	public void setTinNumber(String t) {
		tinNumber = t;
	}

	public String getTinNumber() {
		return(tinNumber);
	}

	public void setEmail(String e) {
		email = e;
	}

	public String getEmail() {
		return(email);
	}

	public void setContactNumber(String c) {
		contactNumber = c;
	}

	public String getContactNumber() {
		return(contactNumber);
	}

	public void setOffice(String o) {
		office = o;
	}

	public String getOffice() {
		return(office);
	}

	public void setService(String s) {
		service = s;
	}
	
	public String getService() {
		return(service);
	}

	public void setPfAmount(BigDecimal pf) {
		pfAmount = pf;
	}

	public BigDecimal getPfAmount() {
		return(pfAmount);
	}

	public String toString() {
		return("Date: " + date + ", Consultant Name: " + conName + ", TIN Number: " + tinNumber + ", Email address: " + email + ", Contact Number: " + contactNumber + ", Office: " + office + ", Service offered: " + service + ", Professional Fee: " + pfAmount);
	}

	public String getDetails() {
		return(conName + "@" + pfAmount);
	}
}
