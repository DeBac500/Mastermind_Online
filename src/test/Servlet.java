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
	private String output = "";
    private Mastermind m = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        m=null;
        output="";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		does(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		does(request,response);
	}
	private void does(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String anzahl = request.getParameter("anzahl");
		int anz;
		if(anzahl != null){
			anz = Integer.parseInt(anzahl);
			m = new Mastermind(anz);
		}
		if(m != null){
			make(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("game.jsp");
			rd.include(request, response);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println(output);
		}else{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Error!</br>");
		}
	}
	public void make(HttpServletRequest request, HttpServletResponse response){
		String feld1 = request.getParameter("feld1");
		String feld2 = request.getParameter("feld2");
		String feld3 = request.getParameter("feld3");
		String feld4 = request.getParameter("feld4");
	}
}
