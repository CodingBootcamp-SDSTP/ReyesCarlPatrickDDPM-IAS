public class MainClientDetails
{
	public static void main(String[] args) {
		ClientDetails detail = new ClientDetails.Builder().clientName("Rocky").dateReg("2018-01-01").build();
		System.out.println(detail.toString());
	}
}
