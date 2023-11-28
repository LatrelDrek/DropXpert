package BancodeDados;

import Entidades.Categoria;
import Entidades.Produto;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import BancodeDados.AcessoBancoUsuario;

public class CategoriaBanco {
    private Categoria categ;
    private Produto prod;
    public CategoriaBanco()
    {
        categ = new Categoria();
        prod = new Produto();
    }

    Connection connection = null;

    public boolean IncluirCategoria(Categoria categoria) {
        boolean status = true;

        System.out.println("Inserir Categoria");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO categoria (nomeproduto, descricao, tipo, quantidade, idempresa) VALUES (?, ?, ?, ?, ?)")) 
        {

            preparedStatement.setString(1, categoria.getNomecatedoria());
            preparedStatement.setString(2, categoria.getDescricao());
            preparedStatement.setString(3, categoria.getTipo());
            preparedStatement.setInt(4, categoria.getQuantidade());
            preparedStatement.setInt(5, categoria.getIdempresa());
           


            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
    
    public boolean AtualizarQuantidade(Produto produto) {
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
     public boolean AtualizarQuantidadeSaida(Produto produto) {
    boolean status = false;
    Connection conn = ConexaoBanco.getInstance().getConnection();

    System.out.println("Atualizar Quantidade");
    try {
        String consulta = "SELECT quantidade FROM categoria WHERE nomeproduto = ?";
        PreparedStatement preparedStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(consulta);
        preparedStatement.setString(1, produto.getNomeprodutosaida()); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
        int quantidadeAtual = 0;
        if (resultSet.next()) 
        {
            quantidadeAtual = resultSet.getInt("quantidade");
        }
        quantidadeAtual = quantidadeAtual - produto.getQuantidadesaida();
        if(quantidadeAtual<0)
        {
             JOptionPane.showMessageDialog(null, "ERRO VALOR INFORMADO NÂO CORRESPONDENTE AO ESTOQUE:" + quantidadeAtual);
             
        }
        else
        {
            String atualizacao = "UPDATE categoria SET quantidade = ? WHERE nomeproduto = ?";
        PreparedStatement updateStatement = ConexaoBanco.getInstance().getConnection().prepareStatement(atualizacao);
        updateStatement.setInt(1, quantidadeAtual);
        updateStatement.setString(2, produto.getNomeprodutosaida()); 
        
        int linhasAfetadas = updateStatement.executeUpdate();
        
        if (linhasAfetadas > 0) 
        {
            JOptionPane.showMessageDialog(null, "Atualização bem-sucedida. Nova quantidade: " + quantidadeAtual);
            status = true;
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi atualizada.");
        }

        }
        
        
    } catch (SQLException e) {
        e.printStackTrace();
    } finally 
    {
        try 
        {
            if (conn != null)
            {
                conn.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    return status;
}

           
    public ArrayList<Categoria> obterCategorias()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
    ArrayList<Categoria> categorias = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM categoria WHERE idempresa = ? ORDER BY idcategoria")) {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) {
            while (res.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdcategoria(res.getInt("idcategoria"));
                categoria.setNomecategoria(res.getString("nomeproduto"));
                categoria.setQuantidade(res.getInt("quantidade"));
                categoria.setTipo(res.getString("tipo"));
                categoria.setDescricao(res.getString("descricao"));
                categorias.add(categoria);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return categorias;
}
    
  

    public boolean atualizarCategoria(Categoria categoria) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE categoria SET tipo = ?, nomeproduto = ?, descricao = ? WHERE nomeproduto = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, categoria.getTipo() );
            preparedStatement.setString(2,categoria.getNomecatedoria());
            preparedStatement.setString(3, categoria.getDescricao());
            preparedStatement.setString(4,categoria.getNome());
        
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
  public boolean deletarCategoria(Categoria categoria)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

         
            String query = "DELETE FROM categoria WHERE nomeproduto = ?";
            preparedStatement = connection.prepareStatement(query);

        
            preparedStatement.setString(1, categoria.getNome());

           
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
  public boolean VerrificaAcesso1(Categoria usar) 
  {
    connection = ConexaoBanco.getInstance().getConnection();
    System.out.println("Conectado e verificando acesso");
    Statement stmt = null;
    boolean status = false;

    try {
        stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM categoria");

        while (res.next()) 
        {
            if (usar.getNomecatedoria().equals(res.getString("nomeproduto")))
            {
                status = true;
                break; 
            }
        }
    }
    catch (SQLException e) 
    {
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
}
