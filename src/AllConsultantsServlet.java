import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

public class AllConsultantsServlet extends HttpServlet
{
	ConsultantCollection consultants;

	public void init() throws ServletException {
		ClientManagerDatabase cmd = new ClientManagerDatabase();
		consultants = cmd.getConsultantCollection();
	}

	// Make ClientManagerDatabase.java first before this..
}
