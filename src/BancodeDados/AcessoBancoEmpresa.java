
package BancodeDados;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entidades.Empresa;
import Entidades.Produto;
import Entidades.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AcessoBancoEmpresa
{

    Connection connection = null;

  public boolean verificarAcessoEmp(Empresa empresa) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM empresa");

        while (res.next()) 
        {
            if (empresa.getEmail().equals(res.getString("email")) ) 
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
public boolean verificarAcessoEmp1(Empresa empresa) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM empresa");

        while (res.next()) 
        {
            if (empresa.getEmail().equals(res.getString("email")) && empresa.getSenhaempresa().equals(res.getString("senhaempresa")) ) 
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

 public boolean AtualizarQuantidade(Produto produto)
 {
    boolean status = false;
    Connection conn = ConexaoBanco.getInstance().getConnection();

    System.out.println("Atualizar Quantidade");
    try {
        String consulta = "SELECT quantidade FROM categoria WHERE nomeproduto = ?";
        PreparedStatement preparedStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(consulta);
        preparedStatement.setString(1, produto.getNomeproduto()); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
        int quantidadeAtual = 0;
        if (resultSet.next()) {
            quantidadeAtual = resultSet.getInt("quantidade");
        }
        quantidadeAtual = quantidadeAtual + produto.getQuantidade();

        String atualizacao = "UPDATE categoria SET quantidade = ? WHERE nomeproduto = ?";
        PreparedStatement updateStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(atualizacao);
        updateStatement.setInt(1, quantidadeAtual);
        updateStatement.setString(2, produto.getNomeproduto()); 
        int linhasAfetadas = updateStatement.executeUpdate();

        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Atualização bem-sucedida. Nova quantidade: " + quantidadeAtual);
            status = true;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi atualizada.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return status;
}
 
     public void Idcolocador(Empresa empresa, Usuario usuario) {
  
    Connection conn = ConexaoBanco.getInstance().getConnection();

    System.out.println("Passar dados ID");
    try {
        String consulta = "SELECT idempresa FROM empresa WHERE email = ?";
        PreparedStatement preparedStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(consulta);
        preparedStatement.setString(1, empresa.getEmail()); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
        int idempresa = 0; 
                
        if (resultSet.next()) 
        {
            idempresa = resultSet.getInt("idempresa");
        }
        usuario.setIdempresa(idempresa);

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

}
