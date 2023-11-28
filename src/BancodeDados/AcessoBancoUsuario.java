
package BancodeDados;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entidades.Categoria;
import Entidades.Usuario;
import UI.Login;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class AcessoBancoUsuario
{
    public static int idempresa;
    public static int nivel;

    Connection connection = null;
    public AcessoBancoUsuario()
            {
              
            }

  public boolean verificaAcesso(Usuario usar) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM usuario");

        while (res.next()) 
        {
            if (usar.getLogar().equals(res.getString("logar")) && usar.getSenha().equals(res.getString("senha"))) {
                status = true;
                break; 
            }
        }
    }
    catch (SQLException e) {
        System.out.println(e.getMessage());
        status = false;
    } 
    finally {
        try 
        {
            stmt.close();
            connection.close();
        } catch (SQLException e) 
        {
            System.out.println("Erro ao desconectar" + e.getMessage());
        }
    }

    return status;
}
  
  
     public int IdcolocadorUsuario(String id) 
     {
    
    Connection conn = ConexaoBanco.getInstance().getConnection();
         System.out.println("");
    System.out.println("Passar dados ID");
    try {
        String consulta = "SELECT idempresa FROM usuario WHERE logar = ?";
        PreparedStatement preparedStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(consulta);
        preparedStatement.setString(1, id ); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
     
                
        if (resultSet.next()) 
        {
            idempresa = resultSet.getInt("idempresa");
            
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
            if (conn != null) 
            {
                conn.close();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return idempresa;
    
}
     public int Valores()
     {
         System.out.println(""+idempresa);
         return idempresa;
     }

  public boolean VerrificaAcesso1(Usuario usar) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM usuario");

        while (res.next()) 
        {
            if (usar.getLogar().equals(res.getString("logar")))
            {
                status = true;
                break; 
            }
        }
    }
    catch (SQLException e) {
        System.out.println(e.getMessage());
        status = false;
    } 
    finally {
        try 
        {
            stmt.close();
            connection.close();
        } catch (SQLException e) 
        {
            System.out.println("Erro ao desconectar" + e.getMessage());
        }
    }

    return status;
}
  public void preencherComboBox(JComboBox<String> comboBox) 
    {
        Usuario usuario= new Usuario();
        AcessoBancoUsuario acesso = new AcessoBancoUsuario();
        int idempresa= acesso.Valores();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "SELECT idusuario FROM usuario WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

            
            while (resultSet.next()) {
                fornecedores.add(resultSet.getString("idusuario"));
            }

           
            comboBox.setModel(new DefaultComboBoxModel<>(fornecedores.toArray(new String[0])));
        } catch (SQLException e) {
            e.printStackTrace();
         
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException e)
            {
                e.printStackTrace();
               
            }
        }
    }
public void Nivel(String id) 
     {
    
    Connection conn = ConexaoBanco.getInstance().getConnection();
    System.out.println("");
    System.out.println("Passar dados ID");
    try {
        String consulta = "SELECT nivel FROM usuario WHERE logar = ?";
        PreparedStatement preparedStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(consulta);
        preparedStatement.setString(1, id ); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
     
                
        if (resultSet.next()) 
        {
            nivel = resultSet.getInt("nivel");
            
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
            if (conn != null) 
            {
                conn.close();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
}

public int PassarNiveL()
{
    return nivel;
}
}


