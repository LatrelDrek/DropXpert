package BancodeDados;

import Entidades.Comprador;
import Entidades.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompradorBanco 
{
    Connection connection = null;

    public boolean IncluirComprador(Comprador comprador) {
        boolean status = true;

        System.out.println("Inserir Comprador");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO comprador (nomecomprador, descricaocomprador, idempresa) VALUES (?, ?, ?)")) {

            preparedStatement.setString(1, comprador.getNomecomprador());
            preparedStatement.setString(2, comprador.getDescricaocomprador());
            preparedStatement.setInt(3, comprador.getIdempresa());
            


            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
     
     public ArrayList<Comprador> obterCompradores()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
        System.out.println("teste:"+ac);
        ArrayList<Comprador> compradores = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM comprador WHERE idempresa = ? ORDER BY idcomprador"))
    {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) 
        {
            while (res.next())
            {
          Comprador comprador = new Comprador();
            comprador.setIdcomprador(res.getInt("idcomprador"));
            comprador.setDescricaocomprador(res.getString("descricaocomprador"));
            comprador.setNomecomprador(res.getString("nomecomprador"));
      
           compradores.add(comprador);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return compradores;
}
      public boolean deletarComprador(Comprador comprador)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

            
            String query = "DELETE FROM comprador WHERE nomecomprador = ?";
            preparedStatement = connection.prepareStatement(query);

        
            preparedStatement.setString(1, comprador.getNomecomprador());

        
            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) 
            {
                System.out.println("DELETE bem-sucedido!");
                sts = true;
            } 
            else
            {
                System.out.println("Nenhum registro deletado.");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
          
        } 
        finally 
        {
            try 
            {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
                
            }
        }
        return sts;
    }
      
      public boolean atualizarComprador(Comprador comprador) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE comprador SET descricaocomprador = ?, nomecomprador = ? WHERE nomecomprador = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, comprador.getDescricaocomprador());
            preparedStatement.setString(2,comprador.getNomecomprador());
            preparedStatement.setString(3, comprador.getNomecomprador());
           
        
            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) 
            {
                System.out.println("UPDATE bem-sucedido!");
                status = true;
            } 
            else 
            {
                System.out.println("Nenhum registro atualizado.");
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            
        } 
        finally 
        {
            try 
            {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
               
            }
        }
        return status;
    }
    
    
}
