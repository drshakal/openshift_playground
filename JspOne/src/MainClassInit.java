import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainClassInit extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		k=k*k;
		
		ServletContext ct=getServletContext();
		String path= ""+ct.getContext("envVar");
		
		
		PrintWriter out= res.getWriter();
		out.println("\nSquare is :"+k+"\npath:"+path);
		
		
	}
}
