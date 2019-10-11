package tp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCreerForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nb = req.getParameter("nb");
		req.setAttribute("nombre", nb);
		getServletContext().getRequestDispatcher("/creerFromJSP.jsp").forward(req, resp);
	}
	
	

}
