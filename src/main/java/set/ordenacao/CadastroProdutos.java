package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProduto = new CadastroProdutos();

        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 0", 10d, 9);
        cadastroProduto.adicionarProduto(1L, "Produto 8", 20d, 3);
        cadastroProduto.adicionarProduto(6L, "Produto 9", 2d, 8);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}