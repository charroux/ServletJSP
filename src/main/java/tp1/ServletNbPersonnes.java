package tp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletNbPersonnes extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nbPersonnes = req.getParameter("nbPersonnes");
		int nb = Integer.parseInt(nbPersonnes);
		req.setAttribute("nb", nb);
		getServletContext().getRequestDispatcher("/creerForm.jsp").forward(req, resp);
	}

}
