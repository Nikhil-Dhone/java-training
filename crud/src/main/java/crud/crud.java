package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/crud")
public class crud extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		String mobile=request.getParameter("mobile");
		String submit=request.getParameter("submit");
		
		if(submit.equals("submit")) {
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}
		else if(submit.equals("edit")) {
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}
		else if(submit.equals("Update")){
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.include(request, response);
		}
	}
	
	


}