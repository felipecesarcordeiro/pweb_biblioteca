

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servidor")
public class Servidor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Servidor() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		RequestDispatcher resposta = request.getRequestDispatcher("loginusuario.html");
		resposta.forward(request,response);
		
		request.setAttribute("nome", nome);
		request.setAttribute("senha", senha);

		PrintWriter out = response.getWriter();
	}

}
