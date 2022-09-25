import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet{
	public void  doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException , IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String name =req.getParameter("name");
		pw.println("name="+name);
	}

}
