package com.pccoe;


import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.*;
import java.lang.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet")

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String url;
    String user,pass;
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	//url=config.getServletContext().getInitParameter("url");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		int flag=0;
		Connection con=null;Statement smt=null;
		HttpSession session=request.getSession(true);
		session.setAttribute("uid", user);
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shweta", "root", "shwetsudha");
		
		 smt=con.createStatement();
		String query="select * from login";
		ResultSet rs=smt.executeQuery(query);
		
		while(rs.next()){
			
			if(user.equals(rs.getString(1)) && pass.equals(rs.getString(1)) ){
				flag=1;break;
			}	
		}*/
		if(user.equals("shweta") && pass.equals("kale") ){
			flag=1;
		}	
		if(flag==1){
			out.print("<body bgcolor='pink'>");
			out.print("<h3>WELCOME "+user+"!!!</h3>");
			out.print("<h4>Servlet Context url: "+url+"</h4>");
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
			
			out.print("<a href='DraftServlet?user="+user+"'>Draft</a>");
			
	
		}
		else
			out.print("<h3>Sorry "+user+" incorrect password... \n Login Again !!!</h3>");
		
		}/* catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}*/

}
