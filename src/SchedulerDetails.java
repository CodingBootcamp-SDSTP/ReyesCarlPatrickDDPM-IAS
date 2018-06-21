public class SchedulerDetails
{
	public static class Builder {
		String clientId;
		String consultantId;
		String ddpmPersonnel;
		String dateMeeting;
		String timeMeeting;
		double duration;
		String locationMeeting;
		String service;

		public Builder clientId(String ci) {
			clientId = ci;
			return(this);
		}

		public Builder consultantId(String ci) {
			consultantId = ci;
			return(this);
		}

		public Builder ddpmPersonnel(String dp) {
			ddpmPersonnel = dp;
			return(this);
		}

		public Builder dateMeeting(String dm) {
			dateMeeting = dm;
			return(this);
		}

		public Builder timeMeeting(String tm) {
			timeMeeting = tm;
			return(this);
		}

		public Builder duration(double d) {
			duration = d;
			return(this);
		}

		public Builder locationMeeting(String lm) {
			locationMeeting = lm;
			return(this);
		}

		public Builder service(String s) {
			service = s;
			return(this);
		}

		public SchedulerDetails build() {
			return(new SchedulerDetails(this));
		}

		// getters
		public String getClientId() {
			return clientId;
		}

		public String getConsultantId() {
			return consultantId;
		}

		public String getDdpmPersonnel() {
			return ddpmPersonnel;
		}

		public String getDateMeeting() {
			return dateMeeting;
		}

		public String getTimeMeeting() {
			return timeMeeting;
		}

		public double getDuration() {
			return duration;
		}

		public String getLocationMeeting() {
			return locationMeeting;
		}

		public String getService() {
			return service;
		}
	}

	final String CLIENTID;
	final String CONSULTANTID;
	final String DDPMPERSONNEL;
	final String DATEMEETING;
	final String TIMEMEETING;
	final double DURATION;
	final String LOCATIONMEETING;
	final String SERVICE;

	public SchedulerDetails(Builder builder) {
		CLIENTID = builder.getClientId();
		CONSULTANTID = builder.getConsultantId();
		DDPMPERSONNEL = builder.getDdpmPersonnel();
		DATEMEETING = builder.getDateMeeting();
		TIMEMEETING = builder.getTimeMeeting();
		DURATION = builder.getDuration();
		LOCATIONMEETING = builder.getLocationMeeting();
		SERVICE = builder.getService();
	}

	public String toString() {
		String details = "Service: " + SERVICE + "\nClient: " + CLIENTID + "\nConsultant: " + CONSULTANTID + "\nDDPM-IAS Personnel: " + DDPMPERSONNEL + "\nDate: " + DATEMEETING + "\nTime: " + TIMEMEETING + "\nLocation: " + LOCATIONMEETING;
		return(details);
	}
}
