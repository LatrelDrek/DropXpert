package BancodeDados;


import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioBanco 
{
    
    Connection connection = null;

    public boolean IncluirUsuario(Usuario usuario) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Usuario");
        
        connection = ConexaoBanco.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

              String sql = "INSERT INTO usuario (nome,senha,nivel,logar,idempresa) "
               + "VALUES('"+usuario.getNomeusuario()+"','"+usuario.getSenha()+"',"
               + " "+usuario.getNivel()+",'"+usuario.getLogar()+"','"+usuario.getIdempresa()+"');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            
            status = true;
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
                status = false;
            }
        }
        
        return status;
    } 
      public ArrayList<Usuario> obterUsuarios()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
        System.out.println("teste:"+ac);
        ArrayList<Usuario> usuarios = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario WHERE idempresa = ? ORDER BY idusuario"))
    {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) 
        {
            while (res.next())
            {
          Usuario usuario = new Usuario();
            usuario.setNomeusuario(res.getString("nome"));
            usuario.setIdusuario(res.getInt("idusuario"));
            usuario.setNivel(res.getInt("nivel"));
      
           usuarios.add(usuario);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return usuarios;
}
         public boolean atualizarUsuario(Usuario usuario) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE usuario SET nivel = ? WHERE idusuario= ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, usuario.getNivel());
            preparedStatement.setInt(2,usuario.getIdusuario());
            
        
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
         
         public boolean deletarUsuario(Usuario usuario)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

            
            String query = "DELETE FROM usuario WHERE idusuario = ?";
            preparedStatement = connection.prepareStatement(query);

        
            preparedStatement.setInt(1, usuario.getIdusuario());

        
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
}
