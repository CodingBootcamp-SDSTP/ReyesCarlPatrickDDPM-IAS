public class ClientDetails
{
	public static class Builder {
		String clientName;
		String dateReg;
		String clientType;
		String service;
		String contactNumber;
		String email;
		String title;
		String generalObj;
		String specificObj;
		String dateTarget;
		String location;
		String background;
		String careerStatus;
		String paymentMode;
		String paymentWhen;
		String courseAvail;
		String whyAttend;

		public Builder clientName(String cn) {
			clientName = cn;
			return(this);
		}

		public Builder dateReg(String dr) {
			dateReg = dr;
			return(this);
		}

		public Builder clientType(String ct) {
			clientType = ct;
			return(this);
		}

		public Builder service(String s) {
			service = s;
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

		public Builder title(String t) {
			title = t;
			return(this);
		}

		public Builder generalObj(String go) {
			generalObj = go;
			return(this);
		}

		public Builder specificObj(String so) {
			specificObj = so;
			return(this);
		}

		public Builder dateTarget(String dt) {
			dateTarget = dt;
			return(this);
		}

		public Builder location(String l) {
			location = l;
			return(this);
		}

		public Builder background(String b) {
			background = b;
			return(this);
		}

		public Builder careerStatus(String cs) {
			careerStatus = cs;
			return(this);
		}

		public Builder paymentMode(String pm) {
			paymentMode = pm;
			return(this);
		}

		public Builder paymentWhen(String pw) {
			paymentWhen = pw;
			return(this);
		}

		public Builder courseAvail(String ca) {
			courseAvail = ca;
			return(this);
		}

		public Builder whyAttend(String wa) {
			whyAttend = wa;
			return(this);
		}

		public ClientDetails build() {
			return(new ClientDetails(this));
		}

		// getters
		public String getClientName() {
			return clientName;
		}

		public String getDateReg() {
			return dateReg;
		}

		public String getClientType() {
			return clientType;
		}

		public String getService() {
			return service;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public String getEmail() {
			return email;
		}

		public String getTitle() {
			return title;
		}

		public String getGeneralObj() {
			return generalObj;
		}

		public String getSpecificObj() {
			return specificObj;
		}

		public String getDateTarget() {
			return dateTarget;
		}

		public String getLocation() {
			return location;
		}

		public String getBackground() {
			return background;
		}

		public String getCareerStatus() {
			return careerStatus;
		}

		public String getPaymentMode() {
			return paymentMode;
		}

		public String getPaymentWhen() {
			return paymentWhen;
		}

		public String getCourseAvail() {
			return courseAvail;
		}

		public String getWhyAttend() {
			return whyAttend;
		}
	}

	final String CLIENTNAME;
	final String DATEREG;
	final String CLIENTTYPE;
	final String SERVICE;
	final String CONTACTNUMBER;
	final String EMAIL;
	final String TITLE;
	final String GENERALOBJ;
	final String SPECIFICOBJ;
	final String DATETARGET;
	final String LOCATION;
	final String BACKGROUND;
	final String CAREERSTATUS;
	final String PAYMENTMODE;
	final String PAYMENTWHEN;
	final String COURSEAVAIL;
	final String WHYATTEND;

	public ClientDetails(Builder builder) {
		CLIENTNAME = builder.getClientName();
		DATEREG = builder.getDateReg();
		CLIENTTYPE = builder.getClientType();
		SERVICE = builder.getService();
		CONTACTNUMBER = builder.getContactNumber();
		EMAIL = builder.getEmail();
		TITLE = builder.getTitle();
		GENERALOBJ = builder.getGeneralObj();
		SPECIFICOBJ = builder.getSpecificObj();
		DATETARGET = builder.getDateTarget();
		LOCATION = builder.getLocation();
		BACKGROUND = builder.getBackground();
		CAREERSTATUS = builder.getCareerStatus();
		PAYMENTMODE = builder.getPaymentMode();
		PAYMENTWHEN = builder.getPaymentWhen();
		COURSEAVAIL = builder.getCourseAvail();
		WHYATTEND = builder.getWhyAttend();
	}

	public String toString() {
		String details = "Client Name: " + CLIENTNAME + "\nDate of registration: " + DATEREG;
		return(details);
	}
}
