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
 * Servlet implementation class SentServlet
 */
@WebServlet("/SentServlet")
public class SentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String user = (String)session.getAttribute("uid");
		out.print("<body bgcolor='pink'>");
		out.print("<h3>WELCOME TO SENT MAIL PAGE OF "+user+"<h3>");
		
		out.print("<body>");
		out.print("<form action='InboxServlet'>");
		out.print("<input type='hidden' name='uid' value="+user+">");
		out.print("<input type='submit' value='INBOX'>");
		out.print("</form>");
		
		out.print("<form action='SentServlet'>");
		out.print("<input type='hidden' name='uid' value="+user+">");
		out.print("<input type='submit' value='SENT MAIL'>");
		out.print("</form>");
		
		out.print("<form action='ComposeServlet'>");
		out.print("<input type='hidden' name='uid' value="+user+">");
		out.print("<input type='submit' value='COMPOSE'>");
		out.print("</form>");
		
		out.print("<form action='LogoutServlet'>");
		out.print("<input type='submit' value='LogOut'>");
		out.print("</form>");
		
		out.print("</body>");
	}


}
