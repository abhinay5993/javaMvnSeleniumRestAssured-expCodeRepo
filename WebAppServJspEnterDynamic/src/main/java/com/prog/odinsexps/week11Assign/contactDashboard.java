package com.prog.odinsexps.week11Assign;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * Servlet implementation class contactDashboard
 */

@WebServlet("/contactApp")
public class contactDashboard extends HttpServlet {
	 
	private UserContactDtoOperations userDtoObj;
	public int userId;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactDashboard() {
        super();
        userDtoObj=new UserContactDtoOperations();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			// set content type
			response.setContentType("text/html");
			if(request.getParameter("action")==null)
			{
				listUser(request, response);	
			}
			else if(request.getParameter("action").equals("delete"))
			{
				deleteUser(request, response);	
			}
			else if (request.getParameter("action").equals("insert")) {
				insertUser(request, response);
			} else if (request.getParameter("action").equals("edit")) {
				showEditForm(request, response);
			}
			else if (request.getParameter("action").equals("update")) {
				updateUser(request, response);
			}
			else {
				listUser(request, response);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<UserContactDtoOperations> listUser;
		try {
			listUser = userDtoObj.getAllUserContacts();
			request.setAttribute("listOfContacts", listUser);
			getServletContext().getRequestDispatcher(request.getContextPath()+"/jspPages/usersDashboardList.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		userId = Integer.parseInt(request.getParameter("id"));
		UserContactDtoOperations existingUser;
		try {
			existingUser = userDtoObj.getUserContactById(userId);
			HttpSession htpSes=request.getSession();
			htpSes.setAttribute("existUsersObj",existingUser);
			response.sendRedirect(request.getContextPath()+"/jspPages/editDetails.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		try {
			String name = request.getParameter("userName");
			String email = request.getParameter("email");
			String mobNo = request.getParameter("mobileNo");
			String country = request.getParameter("userCountry");
			UserContactDtoOperations newUser = new UserContactDtoOperations(name, email, mobNo, country);
			userDtoObj.insertNewUsersDetails(newUser);
			response.sendRedirect(request.getContextPath() + "/jspPages/usersDashboardList.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		try {
			String name = request.getParameter("updateUName");
			String email = request.getParameter("upEmailId");
			String mobileNo = request.getParameter("updateMobileNo");
			String country = request.getParameter("updateNewCountry");
			UserContactDtoOperations useObj = new UserContactDtoOperations(userId, name, email, mobileNo, country);
			userDtoObj.updateUsersContacts(useObj);
			response.sendRedirect(request.getContextPath() + "/jspPages/usersDashboardList.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		try {
			userId = Integer.parseInt(request.getParameter("id"));
			userDtoObj.deleteContactByUserId(userId);
			response.sendRedirect(request.getContextPath() + "/jspPages/usersDashboardList.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
