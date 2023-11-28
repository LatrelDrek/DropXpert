package BancodeDados;

import Entidades.Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaBanco {

    Connection connection = null;

    public boolean IncluirEmpresa(Empresa empresa) {
        boolean status = true;

        System.out.println("Inserir Empresa");

        try (Connection connection = ConexaoBanco.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO empresa (nomeempresa, senhaempresa, cnpj, email) VALUES (?, ?, ?, ?)")) {

            preparedStatement.setString(1, empresa.getNomeempresa());
            preparedStatement.setString(2, empresa.getSenhaempresa().trim());
            preparedStatement.setString(3, empresa.getCnpj());
            preparedStatement.setString(4, empresa.getEmail());


            System.out.println("SQL: " + preparedStatement.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        }

        return status;
    }
}
