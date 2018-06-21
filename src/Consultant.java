import java.math.BigDecimal;

public class Consultant
{
	public static class Builder {
		String consultantName;
		String tinNumber;
		String contactNumber;
		String email;
		String address;
		BigDecimal pfAmount;
		String service;
		String educAttainment;
		String expertise;

		public Builder consultantName(String cn) {
			consultantName = cn;
			return(this);
		}

		public Builder tinNumber(String tn) {
			tinNumber = tn;
			return(this);
		}

		public Builder contactNumber(String cn) {
			contactNumber = cn;
			return(this);
		}

		public Builder email(String e) {
			email = e;
			return(this);
		}

		public Builder address(String a) {
			address = a;
			return(this);
		}

		public Builder pfAmount(BigDecimal pf) {
			pfAmount = pf;
			return(this);
		}

		public Builder service(String s) {
			service = s;
			return(this);
		}

		public Builder educAttainment(String ea) {
			educAttainment = ea;
			return(this);
		}

		public Builder expertise(String e) {
			expertise = e;
			return(this);
		}

		public Consultant build() {
			return(new Consultant(this));
		}

		// getters
		public String getConsultantName() {
			return consultantName;
		}

		public String getTinNumber() {
			return tinNumber;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public String getEmail() {
			return email;
		}

		public String getAddress() {
			return address;
		}

		public BigDecimal getPfAmount() {
			return pfAmount;
		}

		public String getService() {
			return service;
		}

		public String getEducAttainment() {
			return educAttainment;
		}

		public String getExpertise() {
			return expertise;
		}
	}

	final String CONSULTANTNAME;
	final String TINNUMBER;
	final String CONTACTNUMBER;
	final String EMAIL;
	final String ADDRESS;
	final BigDecimal PFAMOUNT;
	final String SERVICE;
	final String EDUCATTAINMENT;
	final String EXPERTISE;

	public Consultant(Builder builder) {
		CONSULTANTNAME = builder.getConsultantName();
		TINNUMBER = builder.getTinNumber();
		CONTACTNUMBER = builder.getContactNumber();
		EMAIL = builder.getEmail();
		ADDRESS = builder.getAddress();
		PFAMOUNT = builder.getPfAmount();
		SERVICE = builder.getService();
		EDUCATTAINMENT  = builder.getEducAttainment();
		EXPERTISE = builder.getExpertise();
	}

	public String toString() {
		String details = "Consultant Name: " + CONSULTANTNAME + "\nTIN Number: " + TINNUMBER;
		return(details);
	}
}
