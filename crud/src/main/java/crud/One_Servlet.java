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
public class One_Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user_name");
		String mobile_number=request.getParameter("user_password");
		String submit=request.getParameter("submit");
		if(submit.equals("submit")) {
			RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
		}
		else if(submit.equals("edit")) {
			RequestDispatcher rd=request.getRequestDispatcher("Edit.jsp");
//			request.setAttribute("name", name);
//			request.setAttribute("number", mobile_number);
			rd.forward(request, response);
		}
		else if(submit.equals("update")){
			RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
			rd.include(request, response);
			PrintWriter out = response.getWriter();
			out.println("<p style='color:green'>*Update successfully saved.</p>");
		}
	}


}
