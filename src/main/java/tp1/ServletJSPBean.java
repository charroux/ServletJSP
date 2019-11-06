package tp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletJSPBean extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String a = req.getParameter("age");
		int age = Integer.parseInt(a);
		Personne p = new Personne(nom, prenom, age);
		req.setAttribute("personne", p);
		getServletContext().getRequestDispatcher("/jspBean.jsp").forward(req, resp);
	}

}
