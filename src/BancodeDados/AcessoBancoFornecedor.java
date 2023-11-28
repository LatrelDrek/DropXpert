
package BancodeDados;

import Entidades.Fornecedor;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class AcessoBancoFornecedor
{
    Connection connection = null;

  public boolean verificarAcessoFornecedor(Fornecedor fornecedor) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM Fornecedor");

        while (res.next()) 
        {
            if (fornecedor.getNomefornecedor().equals(res.getString("nomefornecedor")))
            {
                status = true;
                break; // Pare de iterar, pois encontrou uma correspondência
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

            String query = "SELECT nomefornecedor FROM fornecedor WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

            // Preenche a lista com os resultados da consulta
            while (resultSet.next()) {
                fornecedores.add(resultSet.getString("nomefornecedor"));
            }

            // Preenche o ComboBox com as categorias
            comboBox.setModel(new DefaultComboBoxModel<>(fornecedores.toArray(new String[0])));
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com exceções adequadamente
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
