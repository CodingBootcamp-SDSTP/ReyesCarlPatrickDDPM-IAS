public class ClientPayment
{
	public static class Builder {
		String clientId;
		String clientName;
		int orNumber;
		String datePayment;
		String location;
		double amount;
		String service;
		String particulars;

		public Builder clientId(String ci) {
			clientId = ci;
			return(this);
		}

		public Builder clientName(String cn) {
			clientName = cn;
			return(this);
		}

		public Builder orNumber(int or) {
			orNumber = or;
			return(this);
		}

		public Builder datePayment(String dp) {
			datePayment = dp;
			return(this);
		}

		public Builder location(String l) {
			location = l;
			return(this);
		}

		public Builder amount(double a) {
			amount = a;
			return(this);
		}

		public Builder service(String s) {
			service = s;
			return(this);
		}

		public Builder particulars(String p) {
			particulars = p;
			return(this);
		}

		public ClientPayment build() {
			return(new ClientPayment(this));
		}

		// getters
		public String getClientId() {
			return clientId;
		}

		public String getClientName() {
			return clientName;
		}

		public int getOrNumber() {
			return orNumber;
		}

		public String getDatePayment() {
			return datePayment;
		}

		public String getLocation() {
			return location;
		}

		public double getAmount() {
			return amount;
		}

		public String getService() {
			return service;
		}

		public String getParticulars() {
			return particulars;
		}
	}

	final String CLIENTID;
	final String CLIENTNAME;
	final int ORNUMBER;
	final String DATEPAYMENT;
	final String LOCATION;
	final double AMOUNT;
	final String SERVICE;
	final String PARTICULARS;

	public ClientPayment(Builder builder) {
		CLIENTID = builder.getClientId();
		CLIENTNAME = builder.getClientName();
		ORNUMBER = builder.getOrNumber();
		DATEPAYMENT = builder.getDatePayment();
		LOCATION = builder.getLocation();
		AMOUNT = builder.getAmount();
		SERVICE = builder.getService();
		PARTICULARS = builder.getParticulars();
	}

	public String toString() {
		String details = "Client Name: " + CLIENTNAME + "\nOR Number: " + ORNUMBER + "\nDate of Payment: " + DATEPAYMENT + "\nLocation: " + LOCATION + "\nAmount: " + AMOUNT + "\nService availed: " + SERVICE + "\nParticulars: " + PARTICULARS;
		return(details);
	}
}
