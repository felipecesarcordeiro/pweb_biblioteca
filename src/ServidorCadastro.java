

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServidorCadastro
 */
@WebServlet("/ServidorCadastro")
public class ServidorCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ConectaBd con = new ConectaBd();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServidorCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		RequestDispatcher resposta = request.getRequestDispatcher("modulo.jsp");
		resposta.forward(request,response);
		
		request.setAttribute("nome", nome);
		request.setAttribute("senha", senha);

		PrintWriter out = response.getWriter();
		
		 //inserir admin
	    try {
	        con.conecta(); 
	        con.cadastra("INSERT INTO adim(nome,senha) VALUES('"+nome+"','"+senha+"')");
	        con.encerra();
	     } catch (Exception ex) {
	        System.out.println("Erro");
	     }
	    
	}
		
	

}

