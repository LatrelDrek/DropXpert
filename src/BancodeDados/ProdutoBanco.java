package BancodeDados;


import Entidades.Produto;
import Entidades.Comprador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ProdutoBanco 
{
    Connection connection = null;

    public boolean IncluirProduto(Produto produto)
    {
        boolean status = true;

        System.out.println("Inserir Produto");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO produto (nomeproduto, dataentrada, horaentrada, preco, quantidade, idempresa, fornecedor) VALUES (?, ?, ?, ?, ?, ?, ? )")) {

            preparedStatement.setString(1, produto.getNomeproduto());
            preparedStatement.setString(2, produto.getDataentrada().trim());
            preparedStatement.setString(3, produto.getHoraentrada());
            preparedStatement.setDouble(4, produto.getPreco());
            preparedStatement.setInt(5, produto.getQuantidade());
            preparedStatement.setInt(6, produto.getIdempresaentrada());
            preparedStatement.setString(7, produto.getFornecedor());
           


            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
     public boolean SaidaProduto(Produto produto, Comprador comprador)
    {
        boolean status = true;

        System.out.println("Saida Produto");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO produtosaida (nomeproduto, datasaida, horasaida, preco, quantidade, comprador, idempresa) VALUES ( ?, ?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, produto.getNomeprodutosaida());
            preparedStatement.setString(2, produto.getDatasaida());
            preparedStatement.setString(3, produto.getHorasaida());
            preparedStatement.setDouble(4, produto.getPrecosaida());
            preparedStatement.setInt(5, produto.getQuantidadesaida());
            preparedStatement.setString(6, produto.getComprador());
            preparedStatement.setInt(7, produto.getIdempresasaida());



            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
            public ArrayList<Produto> obterEntradas()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
        System.out.println("teste:"+ac);
        ArrayList<Produto> produtos = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM produto WHERE idempresa = ? ORDER BY idproduto"))
    {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) 
        {
            while (res.next())
            {
            Produto produto = new Produto();
            produto.setIdproduto(res.getInt("idproduto"));
            produto.setNomeproduto(res.getString("nomeproduto"));
            produto.setQuantidade(res.getInt("quantidade"));
            produto.setPreco(Double.valueOf(res.getString("preco")));
            produto.setDataentrada(res.getString("dataentrada"));
            produto.setHoraentrada(res.getString("horaentrada"));
            produto.setFornecedor(res.getString("fornecedor"));
            
            produtos.add(produto);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return produtos;
}

      public ArrayList<Produto> obterSaidas()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
        System.out.println("teste:"+ac);
        ArrayList<Produto> produtos = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM produtosaida WHERE idempresa = ? ORDER BY idproduto"))
    {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) 
        {
            while (res.next())
            {
            Produto produto = new Produto();
            produto.setIdprodutosaida(res.getInt("idproduto"));
            produto.setNomeprodutosaida(res.getString("nomeproduto"));
            produto.setQuantidadesaida(res.getInt("quantidade"));
            produto.setPrecosaida(Double.valueOf(res.getString("preco")));
            produto.setDatasaida(res.getString("datasaida"));
            produto.setHorasaida(res.getString("horasaida"));
            produto.setComprador(res.getString("comprador"));
            produtos.add(produto);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return produtos;
}
    public void preencherComboBoxEntrada(JComboBox<String> comboBox) 
    {
        AcessoBancoUsuario acesso = new AcessoBancoUsuario();
        int idempresa= acesso.Valores();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "SELECT idproduto FROM produto WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

         
            while (resultSet.next()) {
                fornecedores.add(resultSet.getString("idproduto"));
            }

           
            comboBox.setModel(new DefaultComboBoxModel<>(fornecedores.toArray(new String[0])));
        } catch (SQLException e) {
            e.printStackTrace();
           
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Lide com exceções adequadamente
            }
        }
    }
    public boolean atualizarEntrada(Produto produto) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE produto SET nomeproduto = ?, fornecedor = ?, horaentrada = ?, dataentrada = ?, preco = ?, quantidade = ? WHERE idproduto = ?";
            preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, produto.getNomeproduto());
        preparedStatement.setString(2, produto.getFornecedor());
        preparedStatement.setString(3, produto.getHoraentrada());
        preparedStatement.setString(4, produto.getDataentrada());
        preparedStatement.setDouble(5, produto.getPreco());
        preparedStatement.setInt(6, produto.getQuantidade());
        preparedStatement.setInt(7, produto.getIdproduto());
        
          
            
        
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
                // Lide com exceções adequadamente
            }
        }
        return status;
    }
    public boolean deletarEntrada(Produto produto)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "DELETE FROM produto WHERE idproduto = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, produto.getIdproduto());

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
    public boolean atualizarSaida(Produto produto) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE produtosaida SET nomeproduto = ?, comprador = ?, horasaida = ?, datasaida = ?, preco = ?, quantidade = ? WHERE idproduto = ?";
            preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, produto.getNomeprodutosaida());
        preparedStatement.setString(2, produto.getComprador());
        preparedStatement.setString(3, produto.getHorasaida());
        preparedStatement.setString(4, produto.getDatasaida());
        preparedStatement.setDouble(5, produto.getPrecosaida());
        preparedStatement.setInt(6, produto.getQuantidadesaida());
        preparedStatement.setInt(7, produto.getIdprodutosaida());
        
          
            
        
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
                // Lide com exceções adequadamente
            }
        }
        return status;
    }
    

   public void preencherComboBoxsaida(JComboBox<String> comboBox) 
    {
        AcessoBancoUsuario acesso = new AcessoBancoUsuario();
        int idempresa= acesso.Valores();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "SELECT idproduto FROM produtosaida WHERE idempresa = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idempresa);
            resultSet = preparedStatement.executeQuery();

            List<String> fornecedores = new ArrayList<>();

            
            while (resultSet.next()) {
                fornecedores.add(resultSet.getString("idproduto"));
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
                // Lide com exceções adequadamente
            }
        }
    }
    public boolean deletarSaida(Produto produto)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

            String query = "DELETE FROM produtosaida WHERE idproduto = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, produto.getIdprodutosaida());

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
