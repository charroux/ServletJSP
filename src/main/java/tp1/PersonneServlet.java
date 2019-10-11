package tp1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonneServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] noms = req.getParameterValues("nom");
		ArrayList<Person> persons = new ArrayList<Person>();
		for(String nom: noms) {
			persons.add(new Person(nom));
		}
		req.setAttribute("persons", persons);
		getServletContext().getRequestDispatcher("/resultFinal.jsp").forward(req, resp);
	}

}