package com.libms.webServ;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.libms.bean.AdminUsers;

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
			AdminUsers loginObj = new AdminUsers();
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