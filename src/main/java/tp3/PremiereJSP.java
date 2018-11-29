package tp3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PremiereJSP extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n = req.getParameter("nom");
		System.out.println("nom=" + n);
		String a = req.getParameter("age");
		int age = Integer.parseInt(a);
		System.out.println("age=" + age);
		
		req.setAttribute("name", n);
		req.setAttribute("age", age);
		
		getServletContext().getRequestDispatcher("/premiereJSP.jsp").forward(req, resp);
	}
}
