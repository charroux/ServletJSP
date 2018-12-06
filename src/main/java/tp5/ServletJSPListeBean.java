package tp5;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp4.Personne;

public class ServletJSPListeBean extends HttpServlet{
	
	ArrayList<Personne> liste = new ArrayList<Personne>();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n = req.getParameter("nom");
		System.out.println("nom=" + n);
		String p = req.getParameter("prenom");
		System.out.println("prenom=" + p);
		
		Personne p1 = new Personne(n, p);
		liste.add(p1);

		req.setAttribute("liste", liste);
		
		getServletContext().getRequestDispatcher("/jspListeBean.jsp").forward(req, resp);
	}
}
