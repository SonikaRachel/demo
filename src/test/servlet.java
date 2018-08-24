package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("name");
		String Age=request.getParameter("age");
		String Gender=request.getParameter("gender");
		String Email=request.getParameter("email");
		String Mobile=request.getParameter("mobile");
		String Userid=request.getParameter("userid");
		String Password=request.getParameter("password");
		
		System.out.println(Name+"  "+Age+" "+Gender+" "+Email+" "+Mobile+" "+Userid+" "+Password);
		
		JDBC j=new JDBC();
		j.insert(Name,Age,Gender,Email,Mobile,Userid,Password);
	}

}
