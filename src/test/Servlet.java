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
    private String out="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
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
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<table border='0' align='center'>");
			out.println("<tr><th>Mastermind Online</th></tr>");
			out.println("</table>");
			out.println("<table border='1' align='center'>");
			out.println(this.out);
			out.println("</table>");
			rd.include(request, response);
			
			
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
		if(feld1 != null && feld2 != null && feld3 != null && feld4 != null ){
			Row rr =new Row(feld1, feld2, feld3, feld4);
			out += m.addR(rr);
			//out += "</tr>";
			out += "<td>" + m.getErg(rr) + "</td></tr>";
		}
	}
}
