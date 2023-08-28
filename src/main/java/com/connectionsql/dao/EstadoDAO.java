package com.connectionsql.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.connectionsql.model.Estado;

public class EstadoDAO extends DAO {

    public EstadoDAO(Connection conn) {
        super(conn);
    }

    public void localizar(String uf) {
        try {
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next()){
                System.out.println();
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao tentar realizar uma consulta SQL:" + e.getMessage());
        }
    }

    public List<Estado> listar() throws SQLException {
        var lista = new LinkedList<Estado>();
        var statement = conn.createStatement();
        var resultado = statement.executeQuery("select * from estado");
        while (resultado.next()) {
            var estado = new Estado();
            estado.setId(resultado.getLong("id"));
            estado.setNome(resultado.getString("nome"));
            estado.setUf(resultado.getString("uf"));
            lista.add(estado);
        }

        return lista;
    }
}
