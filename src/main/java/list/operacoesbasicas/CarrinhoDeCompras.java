package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaitem;

    public CarrinhoDeCompras() {
        this.listaitem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.listaitem.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!listaitem.isEmpty()) {
            for (Item i : listaitem) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            listaitem.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista esta vazia");
        }
    }
        public double calcularValorTotal() {
            double valorTotal = 0d;
            if (!listaitem.isEmpty()) {
                for (Item item : listaitem) {
                    double valorItem = item.getPreco() * item.getQuantidade();
                    valorTotal += valorItem;
                }
                return valorTotal;
            } else {
                throw new RuntimeException("A LISTA ESTÁ VAZIA");
            }
        }
        public void exibirItens() {
            if(!listaitem.isEmpty()) {
                System.out.println(this.listaitem);
            }else{
                System.out.println("A LISTA ESTA VAZIA");
           }
        }
        @Override
        public String toString() {
            return "CarrinhoDeCompras{" +
                    "listaitem=" + listaitem +
                    '}';
        }

        public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("lapis", 2d, 3);
        carrinho.adicionarItem("lapis", 2d, 3);
        carrinho.adicionarItem("caderno", 45d, 2);
        carrinho.adicionarItem("manda", 4d, 65);

        carrinho.exibirItens();

        carrinho.removerItem("lapis");

        carrinho.exibirItens();

        System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
    }
}
