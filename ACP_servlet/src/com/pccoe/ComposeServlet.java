package com.pccoe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ComposeServlet
 */
@WebServlet("/ComposeServlet")
public class ComposeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComposeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String user = (String)session.getAttribute("uid");
		
		out.print("<body bgcolor='pink'>");
		out.print("<h3>WELCOME TO COMPOSE PAGE OF "+user+"<h3>");
	
		out.print("<form action='LogoutServlet'>");
		out.print("<input type='submit' value='LogOut'>");
		out.print("</form>");
	}

}
