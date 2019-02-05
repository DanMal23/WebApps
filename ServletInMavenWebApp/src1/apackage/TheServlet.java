package apackage;
/**
 * The program is an example of 
 * a small Servlet.
 * It dispalys a quiz as 
 * a web application.
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TheServlet
 */
public class TheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TheServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<htlm><body>Your Answers: <br/>1: ");
		out.println(request.getParameter("maven"));
		out.println("<br/>2: ");
		out.println(request.getParameter("log"));
		out.println("<br/>3: ");
		out.println(request.getParameter("glassfish"));
		out.println("<br/>4: ");
		out.println(request.getParameter("tag"));
		out.println("<br/>5: ");
		out.println(request.getParameter("spring"));
		out.println("<br/>6: ");
		out.println(request.getParameter("style"));
		out.println("<br/>7: ");
		out.println(request.getParameter("soap"));
		out.println("<br/>8: ");
		out.println(request.getParameter("jboss"));
		out.println("<br/>9: ");
		out.println(request.getParameter("servlet"));
		out.println("<br/>10: ");
		out.println(request.getParameter("json"));
		
		out.println("<br/><br/>The correct answers: "
				+ "<br/>1:Java "
				+ "<br/>2: Tomcat logs"
				+ "<br/>3: application server"
				+ "<br/>4: paragraph"
				+ "<br/>5: Tomcat"
				+ "<br/>6: REST"
				+ "<br/>7: xml"
				+ "<br/>8: GlassFish"
				+ "<br/>9: JSPs"
				+  "<br/>10: file format"
				);
		out.println("</body></htlm>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
