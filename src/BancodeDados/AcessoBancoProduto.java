
package BancodeDados;

import Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class AcessoBancoProduto
{
    Connection connection = null;
public boolean verificarAcessoProduto(Categoria categoria) {
    Connection connection = null;
    Statement stmt = null;
    boolean status = false;

    try {
        connection = ConexaoBanco.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");

        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM categoria");

        while (res.next()) {
          
            if (categoria.getNomecatedoria().equals(res.getString("nomeproduto"))) {
                status = true;
                break;
            }
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
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

            String query = "SELECT nomeproduto FROM categoria WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

            
            while (resultSet.next())
            {
                fornecedores.add(resultSet.getString("nomeproduto"));
            }

         
            comboBox.setModel(new DefaultComboBoxModel<>(fornecedores.toArray(new String[0])));
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
          
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
               
            }
        }
    }

}
