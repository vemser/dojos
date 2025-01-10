package br.com.dbc.vemser.aula_01_testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArmazemTest {
    private Armazem armazem;

    @BeforeEach
    void setup() {
//        Produto produto1 = new Produto(1, "Escova de dentes", 0.3, StatusProduto.ATIVO, TipoProduto.HIGIENE);
//        Produto produto2 = new Produto(2, "Notebook", 1.4, StatusProduto.ATIVO, TipoProduto.ELETRONICO);
//        Produto produto3 = new Produto(3, "Tortuguita ed. Especial", 0.1, StatusProduto.INATIVO, TipoProduto.ALIMENTO);

        List<Produto> produtos = new ArrayList<>();
        armazem = new Armazem(1, "Caldeira - Porto Alegre", produtos);
    }

    @Test
    void deveAdicionarUmProdutoComSucesso() {
        Produto produtoNovo = new Produto(1, "Pasta de dente", 0.4, StatusProduto.ATIVO, TipoProduto.HIGIENE);

        armazem.adicionarProduto(produtoNovo);

        assertEquals(1, armazem.getProdutos().size());

        assertEquals("Pasta de dente", armazem.getProdutos().get(0).getNome());
    }

    @Test
    void deveAdicionarUmOutroProduto() {
        Produto produtoNovo = new Produto(2, "Escova", 0.4, StatusProduto.ATIVO, TipoProduto.HIGIENE);

        armazem.adicionarProduto(produtoNovo);

        assertEquals(1, armazem.getProdutos().size());
        assertEquals("Escova", armazem.getProdutos().get(0).getNome());
    }

    @Test
    void deveRemoverUmProdutoComSucesso() {
        Produto produtoNovo = new Produto(2, "Escova", 0.4, StatusProduto.ATIVO, TipoProduto.HIGIENE);

        armazem.adicionarProduto(produtoNovo);

        armazem.removerProduto(produtoNovo);

        assertEquals(0, armazem.getProdutos().size());
    }

    @Test
    void deveRemoverUmProdutoComFracasso() {
        Produto produtoNovo = new Produto(2, "Escova", 0.4, StatusProduto.ATIVO, TipoProduto.HIGIENE);

        armazem.adicionarProduto(produtoNovo);

        armazem.removerProduto(produtoNovo);

        assertEquals(0, armazem.getProdutos().size());
    }
}