package Controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.LoginService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String email =  request.getParameter("email");
	  String senha =  request.getParameter("senha");
	
	  LoginService servico = new LoginService();
	  
	  
	  if(servico.VerificarUsuario(email, senha)) {
		  response.sendRedirect("home.jsp");
	  }else {
		  response.sendRedirect("index.jsp");
	  }
		
	}

}
