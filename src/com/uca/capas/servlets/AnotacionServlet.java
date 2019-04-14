package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();
		
		if (username.equals("user1") && password.equals("pass1")) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Usuario autorizado</h1>");
			out.println("</body>");
			out.println("</html>");
		}else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Usuario no autorizado</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
