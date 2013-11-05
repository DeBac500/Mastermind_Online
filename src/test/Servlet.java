package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Mastermind m = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        m=null;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		//RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
		//rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String anzahl = request.getParameter("anzahl");
		int anz;
		if(anzahl != null){
			anz = Integer.parseInt(anzahl);
			m = new Mastermind(anz);
		}
		if(m != null){
			RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
			rd.include(request, response);
		}else{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Error!</br>");
		}
	}

}
