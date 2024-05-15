package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contarPalavraMap;

    public ContagemPalavras() {
        this.contarPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contarPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contarPalavraMap.isEmpty()) {
            contarPalavraMap.remove(palavra);
        } else {
            System.out.println("O map está vazio");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contarPalavraMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrar() {
        String linguagemFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contarPalavraMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemFrequente = entry.getKey();
            }
        }
        return linguagemFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 7);


        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String MaisFrequente = contagemLinguagens.encontrar();
        System.out.println("A linguagem mais frequente é: " + MaisFrequente);
    }
}

























