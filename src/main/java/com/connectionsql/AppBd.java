package com.connectionsql;

import java.sql.SQLException;

import com.connectionsql.dao.DAO;
import com.connectionsql.dao.EstadoDAO;
import com.connectionsql.dao.GerenciadorDeConexoes;
import com.connectionsql.dao.ProdutoDAO;
import com.connectionsql.model.Marca;
import com.connectionsql.model.Produto;

public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }
    
    public AppBd () {
        try (var conn = GerenciadorDeConexoes.obterConexao()) {
            var estadoDAO = new EstadoDAO(conn);
            var listaEstado = estadoDAO.listar();
            for (var estado : listaEstado) {
                System.out.println(estado);
            }
            
            estadoDAO.localizar("PE");
            
            var marca = new Marca();
            marca.setId(1L);
            
            var produto = new Produto();
            produto.setNome("Produto teste");
            produto.setMarca(marca);
            produto.setValor(5000);
            
            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.inserir(produto);

            var novoProduto = new Produto();
            novoProduto.setId(206L);
            novoProduto.setNome("Produto atualizado");
            novoProduto.setMarca(marca);
            novoProduto.setValor(3000);

            produtoDAO.alterar(novoProduto);
            
            produtoDAO.deletar(202L);

            var dao = new DAO(conn);

            dao.listar("produto");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }

    

    
}
