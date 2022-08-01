package com.javaWebApp.servJspFirst;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class GreetTestMsg
 */
public class GreetTestMsg extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// print object
		PrintWriter pw = response.getWriter();

		// set content type
		response.setContentType("text/html");

		// business logic
		Date d = new Date();
		pw.println("<h2 style='color:red'>current date and time is:" + d.toString());

		// close obj
		pw.close();

	}
}
