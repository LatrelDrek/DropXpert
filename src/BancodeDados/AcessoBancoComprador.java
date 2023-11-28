
package BancodeDados;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entidades.Comprador;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class AcessoBancoComprador
{

    Connection connection = null;

  public boolean verificarAcessoComprador(Comprador comprador) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM comprador");

        while (res.next()) 
        {
            if (comprador.getNomecomprador().equals(res.getString("nomecomprador")) ) 
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
        AcessoBancoUsuario acesso = new AcessoBancoUsuario();
        int idempresa= acesso.Valores();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "SELECT nomecomprador FROM comprador WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

            
            while (resultSet.next()) {
                fornecedores.add(resultSet.getString("nomecomprador"));
            }

            
            comboBox.setModel(new DefaultComboBoxModel<>(fornecedores.toArray(new String[0])));
        } catch (SQLException e) {
            e.printStackTrace();
       
        } 
        finally 
        {
            try 
            {
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
}
