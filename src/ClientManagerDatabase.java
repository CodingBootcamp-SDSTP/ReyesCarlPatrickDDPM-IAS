import java.util.ArraList;
import java.io.HashMap;
import java.sql.*;

public class clientManagerDatabase
{
	private ConsultantCollection consultants;

	public clientManagerDatabase() {
		consultants = new ConsultantCollection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ddpmiasdb?user=ddpmiasdb&password=ddpmiasdb&serverTimezone=UTC&useSSL=false");
			readFromDB(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ConsultantCollection getConsultantCollection() {
		return(consultants);
	}

	public Consultant getConsultantById(String s) {
		return(consultants.getConsutant)
	}
}