import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFirstServlet implements Servlet {
	public void init(ServletConfig config) throws ServletException{
	
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException {
		System.out.println("Hello World!" + new java.util.Date());
	}
	
	public java.lang.String getServletInfo() {		
		return null;
	}
	
	public void destroy() {
	}
}