package br.com.dbc.vemser.aula_01_testes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Armazem {
    private Integer idArmazem;
    private String localizacao;
    private List<Produto> produtos;


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public Produto buscarProdutoPorId(Integer idProduto) throws Exception {
        return produtos.stream().filter(produto -> Objects.equals(produto.getIdProduto(), idProduto))
                .findFirst().orElseThrow(() -> new Exception("Produto não encontrado!"));
    }

    public Produto alterarProduto(Integer idProduto, Produto produtoAlterado) throws Exception {
        Produto produtoEncontrado = buscarProdutoPorId(idProduto);

        if (produtoAlterado.getNome().isEmpty()) {
            throw new Exception("Nome não pode ser vazio");
        }

        produtoEncontrado.setPeso(produtoAlterado.getPeso());
        produtoEncontrado.setNome(produtoAlterado.getNome());
        produtoEncontrado.setTipo(produtoAlterado.getTipo());
        produtoEncontrado.setStatus(produtoAlterado.getStatus());

        return produtoEncontrado;
    }
}
