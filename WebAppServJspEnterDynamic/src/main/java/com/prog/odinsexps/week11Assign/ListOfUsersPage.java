package com.prog.odinsexps.week11Assign;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ListOfUsersPage
 */

@WebServlet("/getUsers")
public class ListOfUsersPage extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			// set content type
			response.setContentType("text/html");
			// business logic
			AdminLogin loginObj = new AdminLogin();
			String adUserName = request.getParameter("email");
			String adPass = request.getParameter("pswd");
			if (loginObj.performAdminLogin(adUserName, adPass)) {
			   response.sendRedirect(request.getContextPath()+"/jspPages/usersDashboardList.jsp");
			} else {
				pw.print("<script language='JavaScript'>alert('Invalid!! admin.. login attempt..');</script>");
				response.sendRedirect(request.getContextPath() + "/jspPages/unAutherized.jsp");
			}
		} catch (Exception e) {
			pw.println("<h2 style='color:red'>Exception :" + e);
		} finally {
			pw.close();
		}
	}

}