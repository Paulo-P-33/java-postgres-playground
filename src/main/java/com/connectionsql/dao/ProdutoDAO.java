package com.connectionsql.dao;

import java.sql.Connection;

import com.connectionsql.model.Produto;

public class ProdutoDAO extends DAO {

    public ProdutoDAO(Connection conn) {
        super(conn);
    }

    public void deletar(long id) {
        var sql = "delete from produto where id = ?";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao tentar excluir produto do banco de dados:" + e.getMessage());
        }
    }

    public void inserir(Produto produto) {
        var sql = "insert into produto (nome, marca_id, valor) values (?, ?, ?)";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao tentar realizar uma consulta SQL:" + e.getMessage());
        }
    }

    public void alterar(Produto produto) {
        var sql = "update produto set nome = ?, marca_id = ?, valor = ? where id = ?";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao tentar atualizar um produto:" + e.getMessage());
        }
    }
}
