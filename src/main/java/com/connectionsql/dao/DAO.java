package com.connectionsql.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {
    protected Connection conn;

    public DAO(Connection conn) {
        this.conn = conn;
    }

    public void listar(String tabela) {
        try {
            var sql = "select * from " + tabela;
            var statement = conn.createStatement();
            var resultado = statement.executeQuery(sql);
            
            var metadata = resultado.getMetaData();
            int qtdColunas = metadata.getColumnCount();

            for (int i = 1; i <= qtdColunas; i++) {
                System.out.printf("%-25s |", metadata.getColumnName(i));
            }

            System.out.println();
            System.out.println(); 

            while (resultado.next()) {
                for (int i = 1; i <= qtdColunas; i++) {
                    System.out.printf("%-25s |", resultado.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao tentar realizar uma consulta SQL:" + e.getMessage());
        }
    }
}
