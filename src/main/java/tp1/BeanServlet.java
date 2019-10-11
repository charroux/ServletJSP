package tp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String age = req.getParameter("age");
		int a = Integer.parseInt(age);
		req.setAttribute("personne", new Personne(nom, a));
		getServletContext().getRequestDispatcher("/resultBean.jsp").forward(req, resp);
	}

	
}
