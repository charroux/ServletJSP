package tp1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPersonnes extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] noms = req.getParameterValues("nom");
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		for(String n: noms) {
			Personne p = new Personne();
			p.setNom(n);
			personnes.add(p);
		}
		req.setAttribute("personnes", personnes);
		getServletContext().getRequestDispatcher("/jspPersonnes.jsp").forward(req, resp);
	}

}
