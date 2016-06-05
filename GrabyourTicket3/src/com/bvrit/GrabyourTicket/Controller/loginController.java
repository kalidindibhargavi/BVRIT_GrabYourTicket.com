package com.bvrit.GrabyourTicket.Controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.GrabyourTicket.dao.UserDAO;


public class loginController extends HttpServlet {protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		//read username and password
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		//
		
		//create object of UserDAO
		UserDAO udao = new UserDAO();
		//System.out.println("1");
		//call login()
		boolean result = udao.login(user, password);
		//System.out.println("2");
		//getting the session object
		HttpSession session = request.getSession();
		
			session.setAttribute("user1", user);
		//redirect control to next page based on decision
		if(result){
			//System.out.println("in If");
			response.sendRedirect("welcomeView.jsp");
		}else{
			//System.out.println("in else");
			response.sendRedirect("loginView.jsp");
			
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}