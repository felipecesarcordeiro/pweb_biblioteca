package br.edu.ifpb.Biblioteca_pweb.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectaBd {
   private static Statement pstatment;
   public static ResultSet rs; 
   private static Connection con;
   private static ResultSetMetaData rdata;
    
    public void conecta(){
          
         
        try{
            Class.forName("com.mysql.jdbc.Driver");//carrega a classe de drive do banco de dados
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ps","root",""); //estabelece a conexão com o banco
            pstatment = con.createStatement();//envia requisições para o banco de dados
            System.out.println("Conexão estabelecida com sucesso!");
             }
        
        catch(ClassNotFoundException | SQLException error){
            
            System.out.println("Falha na conexão");
        }
    }
    
    public void cadastra(String sql){
        try {
            pstatment=null;
            pstatment = con.createStatement();//envia requisições ao banco de dados
            pstatment.executeUpdate(sql);//inserir requisições no banco de dados
            System.out.println("Inserido com sucesso!");
        } catch (Exception e) {
           System.out.println("Inválido");
        }
    }
    
    public void pesquisa(String sql){
       try {
           rs=pstatment.executeQuery(sql);
       } catch (SQLException ex) {
           Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void deleta(String sql){
        try {
            pstatment=null;
            pstatment = con.createStatement();//envia requisições ao banco de dados
            pstatment.executeUpdate(sql);//inserir requisições no banco de dados
            System.out.println("Excluido com sucesso!");
        } catch (Exception e) {
           System.out.println("Erro");
        }
    }
    
    
    public void encerra(){
        try{
            pstatment.close();
            con.close();
            System.out.println("O banco foi finalizado.");
        }
        
        catch(Exception exception){
            System.out.println("Erro");
        }
    }
}
