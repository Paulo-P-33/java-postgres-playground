package com.connectionsql.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorDeConexoes {

    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    // url - protocolo:tipoDoBanco://endereçoDoServidor/nomeDoBanco, "nomeDoUsuario", "senha"
    // url - jdbc:postgresql://localhost/postgres, "gitpod", ""
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    
    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    
}
