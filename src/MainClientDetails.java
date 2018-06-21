public class MainClientDetails
{
	public static void main(String[] args) {
		System.out.println("");
		Client client = new Client.Builder().clientName("Rocky").dateReg("2018-01-01").build();
		System.out.println(client.toString());

		System.out.println("");
		Consultant consultant = new Consultant.Builder().consultantName("Jahpee").tinNumber("317-180-565").build();
		System.out.println(consultant.toString());

		System.out.println("");
		SchedulerDetails scheduleDetail = new SchedulerDetails.Builder().service("Thesis Consultation").clientId("01-01").consultantId("02-03").ddpmPersonnel("Carl").dateMeeting("June 21, 2018").timeMeeting("10:00am").duration(1.5).locationMeeting("Bo's Coffee").build();
		System.out.println(scheduleDetail.toString());

		System.out.println("");
		ClientPayment clientPayment = new ClientPayment.Builder().clientId("01-02").clientName("Clarissa").orNumber(001).datePayment("June 20, 2018").location("Santa Rosa").amount(900.00).service("Thesis Consultation").particulars("Experiment analysis").build();
		System.out.println(clientPayment.toString());
		System.out.println("");
	}
}
