package ac.kr.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {super();}
	
	//tomcat이 HttpServletRequest, HttpServletResponse 객체를 만듦 => form에서 입력한 값을 바탕으로 주소값 들어 옴
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//사용자가 보낸 form data 읽어 옴
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Process : access to database, perform business logic
		
		//Build HTML code
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Your username is "+username+"<br/>";
		htmlResponse += "<h2>Your password is "+password+"<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
	}

}
