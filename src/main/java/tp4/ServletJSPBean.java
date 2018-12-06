package tp4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletJSPBean extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n = req.getParameter("nom");
		System.out.println("nom=" + n);
		String p = req.getParameter("prenom");
		System.out.println("prenom=" + p);
		
		Personne p1 = new Personne(n, p);

		req.setAttribute("personne", p1);
		
		getServletContext().getRequestDispatcher("/jspBean.jsp").forward(req, resp);
	}
}
