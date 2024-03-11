package org.registration.RegistrationForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fetch the data from html file
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		String email = request.getParameter("mail");
		String mobileNo = request.getParameter("mobile");
		String city = request.getParameter("city");
		
		PrintWriter out = response.getWriter();
		out.print(firstName);
		out.print(lastName);
		out.print(userName);
		out.print(password);
		out.print(email);
		out.print(mobileNo);
		out.print(city);
	}

}
