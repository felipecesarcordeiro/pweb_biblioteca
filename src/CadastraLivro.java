

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraLivro
 */
@WebServlet("/CadastraLivro")
public class CadastraLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ConectaBd con = new ConectaBd();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraLivro() {
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
		
		String titulo = request.getParameter("titulo");
		String autores = request.getParameter("autores");
		String descr = request.getParameter("descr");
		String tipo = request.getParameter("tipo");
		String paginas = request.getParameter("paginas");
		String ano = request.getParameter("ano");
		String editora = request.getParameter("editora");

		RequestDispatcher resposta = request.getRequestDispatcher("index.html");
		resposta.forward(request,response);
		
		request.setAttribute("titulo", titulo);
		request.setAttribute("autores", autores);
		request.setAttribute("descr", descr);
		request.setAttribute("tipo", tipo);
		request.setAttribute("paginas", paginas);
		request.setAttribute("ano", ano);
		request.setAttribute("editora", editora);
		
		//PrintWriter out = new PrintWriter();
		PrintWriter out = response.getWriter();
		
		
		   //inserir livro
        try {
           con.conecta(); 
           con.cadastra("INSERT INTO volume(autor,descricao,tipovol,num_paginas,ano,editora,titulo) VALUES('"+autores+"','"+descr+"','"+tipo+"','"+paginas+"','"+ano+"','"+editora+"','"+titulo+"')");
           con.encerra();
        } catch (Exception ex) {
           System.out.println("Erro");
        }
    
 
	}

}

