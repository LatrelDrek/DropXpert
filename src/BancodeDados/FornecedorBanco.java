package BancodeDados;


import Entidades.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class FornecedorBanco
{

    Connection connection = null;

    public boolean IncluirFornecedor(Fornecedor fornecedor) {
        boolean status = true;

        System.out.println("Inserir Fornecedor");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO fornecedor (nomefornecedor, endereco, cnpj, telefone, celular, cep, inscricao, email, data, idempresa ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, fornecedor.getNomefornecedor());
            preparedStatement.setString(2, fornecedor.getEnderecofornecedor());
            preparedStatement.setString(3, fornecedor.getCnpj());
            preparedStatement.setString(4, fornecedor.getTelefone());
            preparedStatement.setString(5, fornecedor.getCelular());
            preparedStatement.setString(6, fornecedor.getCep());
            preparedStatement.setString(7, fornecedor.getInscricaoEstadual());
            preparedStatement.setString(8, fornecedor.getEmail());
            preparedStatement.setString(9, fornecedor.getData());
            preparedStatement.setInt(10, fornecedor.getIdempresa());



            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
            
    public ArrayList<Fornecedor> obterFornecedores()
    {
        AcessoBancoUsuario ac = new AcessoBancoUsuario();
       int idempresa = ac.Valores();
        System.out.println("teste:"+ac);
    ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    try (Connection connection = ConexaoBanco.getInstance().getConnection();
         PreparedStatement stmt = connection.prepareStatement("SELECT * FROM fornecedor WHERE idempresa = ? ORDER BY idfornecedor"))
    {

        stmt.setInt(1, idempresa); 

        try (ResultSet res = stmt.executeQuery()) 
        {
            while (res.next())
            {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setIdfornecedor(res.getInt("idfornecedor"));
            fornecedor.setNomefornecedor(res.getString("nomefornecedor"));
            fornecedor.setEnderecofornecedor(res.getString("endereco"));
            fornecedor.setTelefone(res.getString("telefone"));
            fornecedor.setCelular(res.getString("celular"));
            fornecedor.setCep(res.getString("cep"));
            fornecedor.setCnpj(res.getString("cnpj"));
            fornecedor.setInscricaoestadual(res.getString("inscricao"));
            fornecedor.setData(res.getString("data"));
            fornecedor.setEmail(res.getString("email"));
            fornecedores.add(fornecedor);
            }
        }
    } catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return fornecedores;
}
         public boolean deletarFornecedor(Fornecedor fornecedor)
  {
      boolean sts= false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            connection = ConexaoBanco.getInstance().getConnection();

            
            String query = "DELETE FROM fornecedor WHERE nomefornecedor = ?";
            preparedStatement = connection.prepareStatement(query);

        
            preparedStatement.setString(1, fornecedor.getNomefornecedor());

        
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
     public boolean atualizarFornecedor(Fornecedor fornecedor) 
    {
        boolean status=false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConexaoBanco.getInstance().getConnection();

           
            String query = "UPDATE fornecedor SET telefone = ?, cep = ?, email = ?, inscricao = ?, celular = ?, cnpj = ?, endereco = ? WHERE nomefornecedor = ?";
            preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, fornecedor.getTelefone());
        preparedStatement.setString(2, fornecedor.getCep());
        preparedStatement.setString(3, fornecedor.getEmail());
        preparedStatement.setString(4, fornecedor.getInscricaoEstadual());
        preparedStatement.setString(5, fornecedor.getCelular());
        preparedStatement.setString(6, fornecedor.getCnpj());
        preparedStatement.setString(7, fornecedor.getEnderecofornecedor());
        preparedStatement.setString(8, fornecedor.getNomefornecedor());
          
            
        
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
