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
 * Servlet implementation class InboxServlet
 */
@WebServlet("/InboxServlet")
public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String user = (String)session.getAttribute("uid");
		
		out.print("<body bgcolor='pink'>");
		out.print("<h3>WELCOME TO INBOX PAGE OF "+user+"<h3>");
		
		
		out.print("<table cellspacing='15' border='1' align='center'>");
		out.print("<tr>");
		out.print("<td>FROM</td>");
		out.print("<td>SUBJECT</td>");
		out.print("<td>MESSAGE</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>tejaswee</td>");
		out.print("<td>PMCD</td>");
		out.print("<td>calculator theory</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>athira nair</td>");
		out.print("<td>Word doc</td>");
		out.print("<td>text file</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>athira nair</td>");
		out.print("<td>PMCD assign3</td>");
		out.print("<td>pmcd program </td>");
		out.print("</tr>");
		out.print("</table>");
		
		out.print("<form action='InboxServlet'>");
		out.print("<input type='submit' value='INBOX'>");
		out.print("</form>");
		
		out.print("<form action='SentServlet'>");
		out.print("<input type='submit' value='SENT MAIL'>");
		out.print("</form>");
		
		out.print("<form action='ComposeServlet'>");
		out.print("<input type='submit' value='COMPOSE'>");
		out.print("</form>");
		
		out.print("<form action='LogoutServlet'>");
		out.print("<input type='submit' value='LogOut'>");
		out.print("</form>");
	}

}
